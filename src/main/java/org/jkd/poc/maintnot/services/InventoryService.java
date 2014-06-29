package org.jkd.poc.maintnot.services;

import org.jkd.poc.maintnot.model.Device;
import org.jkd.poc.maintnot.model.DeviceOrderInvoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by kd40173 on 20/06/14.
 */

@Component
public class InventoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryService.class);

    public DeviceOrderInvoice replaceDevice(Device faultedDevice){

        updateFaultDevicesInventory(faultedDevice);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Device replacingDevice = new Device();
        replacingDevice.setSeriealNumber(UUID.randomUUID().toString());
        replacingDevice.setModel("MX01212");

        return new DeviceOrderInvoice(new Device(),400.45);
    }

    private void updateFaultDevicesInventory(Device faultedDevice) {

        LOGGER.debug("Inventory updated with fault device :: {}", faultedDevice);
    }
}
