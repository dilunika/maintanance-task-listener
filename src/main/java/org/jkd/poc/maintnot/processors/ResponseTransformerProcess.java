package org.jkd.poc.maintnot.processors;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

/**
 * Created by kd40173 on 19/06/14.
 */

@Component
public class ResponseTransformerProcess implements org.apache.camel.Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        Response response = Response.ok().build();
        exchange.getIn().setBody(response);
    }
}
