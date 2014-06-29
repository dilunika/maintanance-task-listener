package org.jkd.poc.maintnot.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kd40173 on 19/06/14.
 */

@XmlRootElement(name = "replacementNotification")
public class ReplacementNotification {

    private Device faultedDevice;

    private String faultDescription;

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }

    public Device getFaultedDevice() {
        return faultedDevice;
    }

    public void setFaultedDevice(Device faultedDevice) {
        this.faultedDevice = faultedDevice;
    }


}
