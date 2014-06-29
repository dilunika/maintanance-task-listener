package org.jkd.poc.maintnot;

import org.apache.camel.builder.RouteBuilder;
import org.jkd.poc.maintnot.processors.AllocateEngineerProcess;
import org.jkd.poc.maintnot.processors.CreateMaintananceTaskProcess;
import org.jkd.poc.maintnot.processors.OrderDeviceProcess;
import org.jkd.poc.maintnot.processors.ResponseTransformerProcess;
import org.jkd.poc.maintnot.services.ReportingManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kd40173 on 19/06/14.
 */
@Component
public class MaintanaceServiceRouteBuilder extends RouteBuilder {

    @Autowired
    private ReportingManager reportingManager;

    @Autowired
    private OrderDeviceProcess orderDeviceProcess;

    @Autowired
    private AllocateEngineerProcess allocateEngineerProcess;

    @Autowired
    private CreateMaintananceTaskProcess createMaintananceTaskProcess;

    @Autowired
    private ResponseTransformerProcess responseTransformerProcess;

    @Override
    public void configure() throws Exception {

        from("cxfrs:bean:restServer?bindingStyle=SimpleConsumer")
            .bean(reportingManager,"initializeReporting")
            .process(orderDeviceProcess)
            .process(allocateEngineerProcess)
            .process(createMaintananceTaskProcess)
            .process(responseTransformerProcess)
            .bean(reportingManager,"record");
    }
}
