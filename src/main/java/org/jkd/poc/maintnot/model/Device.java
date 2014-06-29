package org.jkd.poc.maintnot.model;

/**
 * Created by kd40173 on 20/06/14.
 */
public class Device {

    private String seriealNumber;

    private String model;

    public String getSeriealNumber() {
        return seriealNumber;
    }

    public void setSeriealNumber(String seriealNumber) {
        this.seriealNumber = seriealNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
            "seriealNumber:'" + seriealNumber + '\'' +
            ", model:'" + model + '\'' +
            '}';
    }
}
