package org.iplantc.de.apps.client.views.details;

import org.iplantc.de.apps.client.AppDetailsView;

import com.google.web.bindery.autobean.shared.Splittable;

import gwt.react.client.components.ComponentConstructorFn;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author aramsey
 */

@JsType(isNative = true, namespace = "CyVerseReactComponents.apps.details", name = "AppInfoDialog")
public class ReactAppDetails {

    @JsProperty(namespace = "CyVerseReactComponents.apps.details", name = "AppInfoDialog")
    public static ComponentConstructorFn<AppInfoProps> AppInfoDialog;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    static class AppInfoProps extends BaseProps {
        public Splittable app;
        public AppDetailsView.Presenter presenter;
        public boolean dialogOpen;
    }

}
