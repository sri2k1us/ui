package org.iplantc.de.admin.desktop.client.metadata.presenter.callbacks;

import com.google.web.bindery.autobean.shared.Splittable;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface SaveTemplateSuccess {
    @SuppressWarnings("unusable-by-js")
    void resolve(Splittable result);
}
