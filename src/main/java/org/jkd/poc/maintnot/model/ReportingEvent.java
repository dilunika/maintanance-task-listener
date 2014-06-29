package org.jkd.poc.maintnot.model;

/**
 * Created by kd40173 on 29/06/14.
 */
public class ReportingEvent {

    private String requestCorelator;

    private String operationName;

    private String request;

    private String response;

    public ReportingEvent(String requestCorelator, String operationName, String request) {
        this.requestCorelator = requestCorelator;
        this.operationName = operationName;
        this.request = request;
    }

    public String getRequestCorelator() {
        return requestCorelator;
    }

    public String getOperationName() {
        return operationName;
    }

    public String getRequest() {
        return request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
