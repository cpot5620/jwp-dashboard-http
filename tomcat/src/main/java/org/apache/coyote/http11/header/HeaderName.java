package org.apache.coyote.http11.header;

public enum HeaderName {
    LOCATION("Location"),
    SET_COOKIE("Set-cookie"),
    CONTENT_TYPE("Content-Type"),
    CONTENT_LENGTH("Content-Length");
    private final String value;

    HeaderName(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}