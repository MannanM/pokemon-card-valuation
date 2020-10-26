let path = require('path');
let HtmlWebpackPlugin = require('html-webpack-plugin');
let MiniCssExtractPlugin = require('mini-css-extract-plugin');
let webpack = require('webpack');

var basePath = __dirname;

module.exports = (env) => {
    return {
        context: path.join(basePath, 'src'),
        resolve: {
            extensions: ['.tsx', '.ts', '.js']
        },
        entry: {
            app: './index.tsx'
        },
        output: {
            path: path.join(basePath, 'dist'),
            filename: '[name].js',
        },
        module: {
            rules: [
                {
                    test: /\.tsx$/,
                    exclude: /node_modules/,
                    loader: 'ts-loader',
                },
                {
                    test: /\.css$/,
                    use: [MiniCssExtractPlugin.loader, "css-loader"],
                },
                {
                    test: /\.(png|jpg|gif|svg|ico)$/,
                    loader: 'file-loader',
                    options: {
                        name: 'assets/img/[name].[ext]?[hash]'
                    }
                }, {
                    type: 'javascript/auto',
                    test: /\.(json)$/i,
                    loader: 'file-loader',
                    options: {
                        name: 'api/[name].[ext]?[hash]'
                    }
                },
            ],
        },
        // For development https://webpack.js.org/configuration/devtool/#for-development
        devtool: 'inline-source-map',
        devServer: {
            port: 8080,
            noInfo: true,
        },
        plugins: [
            new webpack.DefinePlugin({
                'process.env.BASE_URL': JSON.stringify(env.BASE_URL),
                'process.env.GA_TRACKING': JSON.stringify(env.GA_TRACKING),
                'process.env.BUILD_TIME': JSON.stringify(new Date().toISOString())
            }),
            //Generate index.html in /dist => https://github.com/ampedandwired/html-webpack-plugin
            new HtmlWebpackPlugin({
                filename: 'index.html', //Name of file in ./dist/
                template: 'index.html', //Name of template in ./src
                hash: true,
            }),
            new MiniCssExtractPlugin({
                filename: "[name].css",
                chunkFilename: "[id].css"
            }),
        ],
    }
};