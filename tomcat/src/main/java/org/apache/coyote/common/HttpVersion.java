package org.apache.coyote.common;

import java.util.Arrays;
import org.apache.coyote.exception.InvalidHttpVersionException;

public enum HttpVersion {
    HTTP_1_1("HTTP/1.1");

    private final String version;

    HttpVersion(final String version) {
        this.version = version;
    }

    public static HttpVersion from(final String version) {
        return Arrays.stream(values())
                .filter(httpVersion -> httpVersion.version.equals(version))
                .findFirst()
                .orElseThrow(InvalidHttpVersionException::new);
    }

    public String getVersion() {
        return version;
    }
}