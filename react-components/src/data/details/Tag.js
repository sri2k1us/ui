/**
 * @author sriram
 */
import React, {Component} from "react";
import styles from "../style";
import jss from "jss";
import injectSheet from "react-jss";


class Tag extends Component {

    handleMouseOver = () => {
        let ele = document.getElementById(this.props.tag.id);
        jss.createRule({
            display: 'block',
        }).applyTo(ele);
    };

    handleMouseOut = () => {
        let ele = document.getElementById(this.props.tag.id);
        jss.createRule({
            display: 'none',
        }).applyTo(ele);
    };


    render() {
        const removeStyle = {
            fontWeight: 'bold',
            cursor: 'pointer',
            display: 'none',
            float: 'right',
            fontSize: 12,
            paddingLeft: '2px',

        }; // does not work with jss classname approach
        const classes = this.props.classes;
        return (
                <div className={classes.tagDivStyle} onMouseOver={this.handleMouseOver}
                     onMouseOut={this.handleMouseOut}>
                    <div className={classes.tagStyle}
                         onClick={() => this.props.onClick(this.props.tag)}>{this.props.tag.value}</div>
                    <div id={this.props.tag.id}
                         style={removeStyle} onClick={() => this.props.removeTag(this.props.tag)}> X
                    </div>
                </div>
        );
    }
}

export default injectSheet(styles)(Tag);
