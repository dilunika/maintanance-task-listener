package org.jkd.poc.maintnot.services;

import org.jkd.poc.maintnot.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by kd40173 on 20/06/14.
 */

@Component
public class MaintananceTaskSchedule {

    private static final Logger LOGGER = LoggerFactory.getLogger(MaintananceTaskSchedule.class);


    public void scheduleTask(ReplacementNotification notification,
                             DeviceOrderInvoice replaceDeviceInvoice,
                             MaintananceEngineer maintananceEngineer) {

        MaintananceTask maintananceTask = new MaintananceTask();
        maintananceTask.setEngineer(maintananceEngineer);
        maintananceTask.setReplacingDeviceInvoice(replaceDeviceInvoice);
        maintananceTask.setReplacementNotification(notification);

        persistToSchedule(maintananceTask);
    }

    private void persistToSchedule(MaintananceTask maintananceTask) {

        LOGGER.debug("Maintanace Task scheduled :: {}", maintananceTask);

    }

}
