package org.jkd.poc.maintnot.processors;

import org.apache.camel.Exchange;
import org.jkd.poc.maintnot.model.Constants;
import org.jkd.poc.maintnot.model.DeviceOrderInvoice;
import org.jkd.poc.maintnot.model.ReplacementNotification;
import org.jkd.poc.maintnot.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by kd40173 on 19/06/14.
 */
@Component
public class OrderDeviceProcess implements org.apache.camel.Processor {

    @Autowired
    private InventoryService inventoryService;

    @Override
    public void process(Exchange exchange) throws Exception {

        ReplacementNotification notification = exchange.getIn().getBody(ReplacementNotification.class);

        DeviceOrderInvoice invoice = inventoryService.replaceDevice(notification.getFaultedDevice());

        exchange.setProperty(Constants.REPLACING_DEVICE_INVOICE, invoice);

    }

}
