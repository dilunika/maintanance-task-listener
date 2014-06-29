package org.jkd.poc.maintnot.model;

/**
 * Created by kd40173 on 19/06/14.
 */

public class DeviceOrderInvoice {

    private Device device;

    private Double amount;

    public DeviceOrderInvoice(Device device, Double amount) {
        this.device = device;
        this.amount = amount;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


}
