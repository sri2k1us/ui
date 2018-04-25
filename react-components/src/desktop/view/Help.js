/**
 * @author sriram
 */
import React, {Component} from "react";
import IconButton from "material-ui-next/IconButton";
import Menu, {MenuItem} from "material-ui-next/Menu";
import Typography from "material-ui-next/Typography";
import {FormattedMessage, IntlProvider} from "react-intl";

class Help extends Component {
    constructor(props) {
        super(props);
        this.state = {
            anchorEl: null,
        };
        this.onHelpClick = this.onHelpClick.bind(this);
    }

    onHelpClick(event) {
        console.log(event.currentTarget);
        this.setState({anchorEl: document.getElementById(this.props.anchor)});
    }

    handleClose = () => {
        this.setState({anchorEl: null});
    };

    onMenuItemSelect(event) {
        console.log("selected item =>" + event.currentTarget);
    }

    render() {
        const appearance = this.props.appearance;
        const {anchorEl} = this.state;
        const link = {
            color: '#0971AB',
            cursor: 'pointer',
            textAlign: 'left',
            fontSize: '11px',
        };
        return (
            <IntlProvider locale='en' defaultLocale='en' messages={this.props.messages}>
                <span>
                     <img style={this.props.iconStyle}
                             src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAADMElEQVRIiY2WT2hUVxjFf+fxkCBiBhlEZJgJopAGqtSV7g2GErqQVlcqjFJKkQZEKa24ECluAq6klOIgiLtqIZQgiqAgRsRuuohZSMhAFiIyzIiUIsHTxbvvzsvkTe2FYc67797vz/nOd+8T/zF6rUYdmMJMgieQtmOD9ApYBB4Y7glWRpvtUhsqMQqw0+YC8lGhqgEw2rgcoIP5DXEZWB10lJRsmLJZAL4VqtqAQQi7NMhtiK/BC8D04Mt1DnrX66dt/y5cVx618jQzjI3J/tdjati3u636N0WbymipA3xu6zZipJQIeA90gDXDZkFlCAPvDV8J5kab7XyBasDPwiNZkBu4eA4cxnxi2CPYZzhlu0Mhm4A3AdeAGkDSa9XBvmhUB2V8Szhm7o7hMLBo8Qj7BVCtNNs3JI4Z/gllij/sGnCp22qQ2IwhfRkJE/mywL9WhTtATbBX0hhwKFTloWBFEpLCHuUBHhHsSkBTwLaC3eAlFycToJ+ASxAXfQCoNNtrwDuH2LNdMY8KMJ0Cky6YxTkIshSp4cc4b5D4C6DXalRt6tFteN/HnkwRE8KZ/yifzFrIOnuK7/QMeNptNRLgPKKqKGQiVZkTjSeC7eQ9WkJRgZaMGnEe+Bs4Y/usICmjKMRTTbCTPt8OigvPjnzmc3cMT8BXZF8VpADqL1uHMSSINzk3UshEChQJXMDwJzAFOouURN4kyjGdFLQI7A5hgoTsWGiUpyuwZyR9ANLYWBLDsGEpAe4XJBmaK8eF+ayEI8AW/ucQfpCA72J1P0YR5g+LTw2fgR8PpyXit4b5BHiJmOtTBLJRoWrCSPql0myvVprtZVs3B86fMjyPtSSAbqsxJnvBsKPfTeRNlXfFrOH7oJxfsU8Mq4HhtaSDo832chq4WkHMgG7JpI7nCrGzDd8BB4BNwP5C5zGA1zAzwHJmuzC6rcY5wRXsNKooirpwDgxXzprhB8FsfnWuuzAEs+DjSK83qGjIfVkYb4CTReMbMgDoXW+A2AVcBqYxW50fUy7b4begefBF0MvBS3/I7Ri/LsaNvxCaBMaBirNm7Aov2dxHmsMsVU6Vf7b8C7hYjiWl9m09AAAAAElFTkSuQmCC"
                             alt="Help" onClick={this.onHelpClick} ></img>
                     <Menu id='helpMenu' anchorEl={anchorEl}
                           open={Boolean(anchorEl)}
                           onClose={this.handleClose}>
                         <MenuItem onClick={this.onMenuItemSelect}><Typography
                             style={link}><FormattedMessage
                             id="faqLink"/></Typography></MenuItem>
                         <MenuItem onClick={this.onMenuItemSelect}><Typography
                             style={link}><FormattedMessage
                             id="forumsLink"/></Typography></MenuItem>
                         <MenuItem onClick={this.onMenuItemSelect}><Typography
                             style={link}><FormattedMessage
                             id="feedbackLink"/></Typography></MenuItem>
                     </Menu>
                </span>
            </IntlProvider>
        );
    }
}

export default Help;