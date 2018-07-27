import { getMessage } from "../../../util/I18NWrapper";
import ids from "../ids";
import { options } from "./Operators";
import ReduxTextField from "./ReduxTextField";
import SelectOperator from "./SelectOperator";

import { Field } from "redux-form";
import MenuItem from "@material-ui/core/MenuItem";
import React, { Component, Fragment } from "react";
import Select from "@material-ui/core/Select";

class FileSize extends Component {
    render() {
        let operators = [
            options.Between,
            options.BetweenNot
        ];

        let {
            messages
        } = this.props;

        let sizesList = messages.fileSizes;
        let sizesListChildren = sizesList.map(function (item, index) {
            return <MenuItem key={index} value={item}>{item}</MenuItem>
        });

        return (
            <Fragment>
                <SelectOperator operators={operators}/>
                <Field name='from.value'
                       type='number'
                       parse={value => value ? Number(value) : null}
                       min='0'
                       label={getMessage('fileSizeGreater')}
                       component={ReduxTextField}/>
                <Field name='from.unit'
                       id={ids.fileSizeLessThanUnit}
                       label=' '
                       component={renderDropDown}>
                    {sizesListChildren}
                </Field>
                <Field name='to.value'
                       type='number'
                       parse={value => value ? Number(value) : null}
                       min='0'
                       label={getMessage('fileSizeLessThan')}
                       component={ReduxTextField}/>
                <Field name='to.unit'
                       id={ids.fileSizeLessThanUnit}
                       label=' '
                       component={renderDropDown}>
                    {sizesListChildren}
                </Field>
            </Fragment>


        )
    }
}

function renderDropDown(props) {
    let {
        input,
        children,
        id
    } = props;
    return (
        <Select value={input.value ? input.value : ''}
                onChange={(event) => input.onChange(event.target.value)}
                id={id}>
            {children}
        </Select>
    )
}

export default FileSize;