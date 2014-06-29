package org.jkd.poc.maintnot.processors;

import org.apache.camel.Exchange;
import org.jkd.poc.maintnot.model.Constants;
import org.jkd.poc.maintnot.model.MaintananceEngineer;
import org.jkd.poc.maintnot.model.ReplacementNotification;
import org.jkd.poc.maintnot.services.EngineerAllocationSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kd40173 on 19/06/14.
 */
@Component
public class AllocateEngineerProcess implements org.apache.camel.Processor {

    @Autowired
    private EngineerAllocationSchedule engineerAllocationSchedule;

    @Override
    public void process(Exchange exchange) throws Exception {

        ReplacementNotification notification = exchange.getIn().getBody(ReplacementNotification.class);

        MaintananceEngineer maintananceEngineer = engineerAllocationSchedule.allocateEngineer(notification);

        exchange.setProperty(Constants.MAINTANANCE_ENGINEER,maintananceEngineer);

    }
}
