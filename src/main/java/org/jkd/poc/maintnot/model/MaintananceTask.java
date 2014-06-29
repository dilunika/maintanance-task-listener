package org.jkd.poc.maintnot.model;

/**
 * Created by kd40173 on 20/06/14.
 */
public class MaintananceTask {

    private MaintananceEngineer engineer;

    private DeviceOrderInvoice replacingDeviceInvoice;

    private ReplacementNotification replacementNotification;

    public MaintananceEngineer getEngineer() {
        return engineer;
    }

    public void setEngineer(MaintananceEngineer engineer) {
        this.engineer = engineer;
    }

    public DeviceOrderInvoice getReplacingDeviceInvoice() {
        return replacingDeviceInvoice;
    }

    public void setReplacingDeviceInvoice(DeviceOrderInvoice replacingDeviceInvoice) {
        this.replacingDeviceInvoice = replacingDeviceInvoice;
    }

    public ReplacementNotification getReplacementNotification() {
        return replacementNotification;
    }

    public void setReplacementNotification(ReplacementNotification replacementNotification) {
        this.replacementNotification = replacementNotification;
    }
}
