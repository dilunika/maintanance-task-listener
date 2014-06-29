package org.jkd.poc.maintnot.services;

import org.apache.camel.Exchange;
import org.jkd.poc.maintnot.dataaccess.ReportingEventRepository;
import org.jkd.poc.maintnot.model.Constants;
import org.jkd.poc.maintnot.model.ReplacementNotification;
import org.jkd.poc.maintnot.model.ReportingEvent;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

/**
 * Created by kd40173 on 29/06/14.
 */
@Component
public class ReportingManager {

    private ReportingEventRepository repository;

    public void initializeReporting(Exchange exchange){

        ReportingEvent reportingEvent = createReporingEvent(exchange);

        exchange.setProperty(Constants.REPORTING_EVENT, reportingEvent);
    }

    public void record(Exchange exchange){

        ReportingEvent reportingEvent = (ReportingEvent) exchange.getProperty(Constants.REPORTING_EVENT);

        Response response = exchange.getIn().getBody(Response.class);

        reportingEvent.setResponse(String.valueOf(response.getStatus()));

        repository.insert(reportingEvent);
    }

    private ReportingEvent createReporingEvent(Exchange exchange) {

        String corelator = (String) exchange.getIn().getHeader(Constants.CORELATOR_HEADER);

        String operationName = (String) exchange.getIn().getHeader(Constants.OPERATION_NAME_HEADER);

        ReplacementNotification replacementNotification = exchange.getIn().getBody(ReplacementNotification.class);

        return new ReportingEvent(corelator,operationName,replacementNotification.toString());
    }
}
