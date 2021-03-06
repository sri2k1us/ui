package org.iplantc.de.shared.services;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Provides a wrapper over service calls.
 */
public class BaseServiceCallWrapper implements IsSerializable {
    private static final long serialVersionUID = -7453647589756124397L;

    private Type type = Type.GET;
    private String address = "";
    private String arguments;

    /**
     * Indicate the type of HTTP Method being used for a service call.
     */
    public enum Type implements IsSerializable {
        GET, PUT, POST, DELETE, PATCH
    }

    public BaseServiceCallWrapper() {
    }

    public BaseServiceCallWrapper(String address) {
        this.address = address;
    }

    public BaseServiceCallWrapper(Type type, String address) {
        this(address);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String args) {
        this.arguments = args;
    }

    public boolean hasArguments() {
        return arguments != null && arguments.length() != 0;
    }
}
