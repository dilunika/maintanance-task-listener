package org.jkd.poc.maintnot.processors;

import org.apache.camel.Exchange;
import org.jkd.poc.maintnot.model.Constants;
import org.jkd.poc.maintnot.model.DeviceOrderInvoice;
import org.jkd.poc.maintnot.model.MaintananceEngineer;
import org.jkd.poc.maintnot.model.ReplacementNotification;
import org.jkd.poc.maintnot.services.MaintananceTaskSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kd40173 on 20/06/14.
 */
@Component
public class CreateMaintananceTaskProcess implements org.apache.camel.Processor {

    @Autowired
    private MaintananceTaskSchedule maintananceTaskSchedule;

    @Override
    public void process(Exchange exchange) throws Exception {

        ReplacementNotification notification = exchange.getIn().getBody(ReplacementNotification.class);
        DeviceOrderInvoice replaceDeviceInvoice  = (DeviceOrderInvoice) exchange.getProperty(Constants.REPLACING_DEVICE_INVOICE);
        MaintananceEngineer maintananceEngineer = (MaintananceEngineer) exchange.getProperty(Constants.MAINTANANCE_ENGINEER);

        maintananceTaskSchedule.scheduleTask(notification,replaceDeviceInvoice,maintananceEngineer);
    }
}
