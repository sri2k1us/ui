/**
 * @author sriram
 */
import React, {Component} from "react";
import {FormattedMessage, IntlProvider} from "react-intl";
import Menu, {MenuItem} from "material-ui-next/Menu";
import Typography from "material-ui-next/Typography";
import Divider from "material-ui-next/Divider";

class Notifications extends Component {
    constructor(props) {
        super(props);
        this.state = {
            anchorEl: null,
        };
        this.handleNotificationsClick = this.handleNotificationsClick.bind(this);
        this.onMenuItemSelect = this.onMenuItemSelect.bind(this);
    }

    handleNotificationsClick() {
        this.setState({anchorEl: document.getElementById(this.props.anchor)});
    }

    handleClose = () => {
        this.setState({anchorEl: null});
    };

    onMenuItemSelect(event) {
        console.log("selected item =>" + event.currentTarget);
    }

    render() {
        const {
            anchorEl,
        } = this.state;
        const link = {
            color: '#0971AB',
            cursor: 'pointer',
            textAlign: 'left',
            fontSize: '11px',
        }
        const notificationCount = {
            backgroundColor: '#db6619',
            fontSize: '.625em',
            color: 'white',
            height: '10px',
            verticalAlign: 'super',
            visibility: 'visible',
            lineHeight: '0.8em',
            float: 'left',
        }
        const notifications = this.props.notifications;
        const unread = notifications.unseen_total;
        const messages = notifications.messages;

        return (
            <IntlProvider locale='en' defaultLocale='en' messages={this.props.messages}>
                <span>
                      <img style={this.props.iconStyle}
                           src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAMAAABHPGVmAAAACXBIWXMAAC4jAAAuIwF4pT92AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAGBQTFRF////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////BmKR8wAAAB90Uk5TAAYJEhwiJ1VYWWR5e4CJjpWWp7HJyuXm7e7w8ff6/lycuGgAAAD0SURBVHgB7c1LsoJADAXQx1/5NNqoaZXm7n+Xz7IYMNCCFJOkzNnA+fvMGGOSxDl6cS5JdCfOYeacJauIMCPSnWBBb1IUTYOFpikKdUlZDsOAD4ahLEs9SV3HiG9ijHWtI2lbrGpb+UlVTRNWTVNVyU6y7H7HJiFkmeSk77FZ38tN0vT5xGaPR5pKTY5HsBwOUpPzGSyn008n1ytYLhepCRFYbjepyTiCZRylJmCz5M0SSyyxxBJLLOk6sHWdtIRf8Jv9Cb/gNwKS7wW/EZBgtx2JJdoZIiwQ6U28x4L3epM8DwGzEPLcktXGe3rx/l1oS4wx/4jHcRyd/1M5AAAAAElFTkSuQmCC"
                           alt="Notifications" onClick={this.handleNotificationsClick}></img>
                    <span id='notifyCount' style={notificationCount}>{unread}</span>
                        <Menu id='notificationsMenu' anchorEl={anchorEl} open={Boolean(anchorEl)}
                              onClose={this.handleClose}>
                            {messages.map(n => {
                                return (
                                    <span>
                                        <MenuItem
                                            onClick={this.onMenuItemSelect}> <Typography>{n.message.text}</Typography> </MenuItem>
                                        <Divider />
                                    </span>
                                )
                            })}
                            <MenuItem>
                                    <span style={link}>See all notifications &nbsp;</span>
                                                     |  
                                    <span style={link}>&nbsp;Mark all as seen </span>
                            </MenuItem>
                        </Menu>
                </span>

            </IntlProvider>
        );

    }
}

export default Notifications;



