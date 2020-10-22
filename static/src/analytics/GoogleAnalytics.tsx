import ReactGA from 'react-ga';

export abstract class GoogleAnalytics {
    public static pageView(): void {
        ReactGA.initialize(process.env.GA_TRACKING);
        ReactGA.pageview(window.location.pathname);
        console.log(`Build Time: ${process.env.BUILD_TIME}`);
    }

    public static event(category: string, action: string, label: string): void {
        ReactGA.event({
            category: category,
            action: action,
            label: label
        });
    }
}
