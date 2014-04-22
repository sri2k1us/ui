package org.iplantc.de.client.util;

import org.iplantc.de.client.models.CommonModelAutoBeanFactory;
import org.iplantc.de.client.models.HasId;
import org.iplantc.de.client.models.HasPath;

import com.google.common.base.Strings;
import com.google.gwt.core.shared.GWT;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.Splittable;
import com.google.web.bindery.autobean.shared.impl.StringQuoter;

@SuppressWarnings("nls")
public class CommonModelUtils {
    private static final CommonModelAutoBeanFactory factory = GWT.create(CommonModelAutoBeanFactory.class);

    public static HasId createHasIdFromString(String id) {
        Splittable hasIdSplittable = createHasIdSplittableFromString(id);

        if (hasIdSplittable == null) {
            return null;
        }

        return AutoBeanCodex.decode(factory, HasId.class, hasIdSplittable).as();
    }

    public static Splittable createHasIdSplittableFromString(String id) {
        if (Strings.isNullOrEmpty(id)) {
            return null;
        }

        Splittable hasIdSplittable = StringQuoter.createSplittable();
        StringQuoter.create(id).assign(hasIdSplittable, "id");

        return hasIdSplittable;
    }

    public static HasId createHasIdFromSplittable(Splittable value) {
        if ((value == null) || !value.isKeyed()) {
            return null;
        }

        boolean hasIdKey = !value.isUndefined("id") && value.get("id").isString();
        if (!hasIdKey)
            return null;

        return AutoBeanCodex.decode(factory, HasId.class, value).as();
    }

    public static HasPath createHasPathFromString(String path) {
        Splittable pathSplittable = createHasPathSplittableFromString(path);

        if (pathSplittable == null) {
            return null;
        }

        return AutoBeanCodex.decode(factory, HasPath.class, pathSplittable).as();
    }

    public static Splittable createHasPathSplittableFromString(String path) {
        if (Strings.isNullOrEmpty(path)) {
            return null;
        }

        Splittable pathSplittable = StringQuoter.createSplittable();
        StringQuoter.create(path).assign(pathSplittable, "path");

        return pathSplittable;
    }
}
