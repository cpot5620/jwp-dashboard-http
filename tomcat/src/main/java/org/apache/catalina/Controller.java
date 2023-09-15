package org.apache.catalina;

import org.apache.coyote.request.HttpRequest;
import org.apache.coyote.response.HttpResponse;

public interface Controller {

    void service(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception;
}