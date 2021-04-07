import * as React from 'react';
import Select, {components} from 'react-select';

interface CardSelectorProps {
    callback: (selectedOption) => void,
    options: Array<any>,
    placeholder: String,
    defaultValue: String
}

export class CardSelector extends React.Component<CardSelectorProps> {
    state = {
        selectedOption: null,
    };

    handleChange = selectedOption => {
        this.setState(
            {selectedOption},
            () => console.log(`Option selected:`, this.state.selectedOption)
        );
        this.props.callback(selectedOption)
    };

    componentDidUpdate(prevProps) {
        if (prevProps.options.length === 0 && this.props.options.length !== 0
            || prevProps.defaultValue !== this.props.defaultValue) {
            if (this.props.defaultValue) {
                let array = this.props.options;
                //options can be nested in groups, so check if they have values
                if (!this.props.options[0].value) {
                    //if they don't assume they are nested and pull them out
                    array = this.props.options.reduce((acc, val) => acc.concat(val.options), []);
                }
                this.handleChange(array.find(x => x.value === this.props.defaultValue));
            }
        }
    }

    render() {
        const {selectedOption} = this.state;
        const styles = {
            valueContainer: base => ({
                ...base,
                paddingLeft: !!this.state.selectedOption?.image ? 28 : 7
            })
        }
        return (
            <Select
                value={selectedOption}
                onChange={this.handleChange}
                isLoading={!this.props.options}
                isSearchable={true}
                isClearable={true}
                options={this.props.options}
                placeholder={this.props.placeholder}
                components={{ValueContainer, Option: IconOption}}
                styles={styles}
            />
        );
    }
}

const ValueContainer = ({children, ...props}) => {
    const value = props.getValue()[0];
    return (
        components.ValueContainer && (
            <components.ValueContainer {...props}>
                {!!children && value && value.image && (
                    <img src={`assets/img/${value.image}`}
                         style={{width: 20, position: 'absolute', left: 6}}
                         alt={value.label}
                    />
                )}
                {children}
            </components.ValueContainer>
        )
    );
};

const IconOption = props => (
    <components.Option {...props}>
        {props.data.image &&
        <img src={`assets/img/${props.data.image}`}
             style={{width: 16, height: 16, paddingRight: 7}}
             alt={props.data.label}
        />
        }
        <span style={{verticalAlign: 'top'}}>
            {props.data.label}
        </span>
    </components.Option>
);
