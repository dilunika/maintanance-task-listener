package org.jkd.poc.maintnot.services;


import org.jkd.poc.maintnot.model.MaintananceEngineer;
import org.jkd.poc.maintnot.model.ReplacementNotification;
import org.springframework.stereotype.Component;

/**
 * Created by kd40173 on 20/06/14.
 */

@Component
public class EngineerAllocationSchedule {

    public MaintananceEngineer allocateEngineer(ReplacementNotification replacementNotification){

        MaintananceEngineer engineer = new MaintananceEngineer();
        engineer.setEmployeeId("115023273");
        engineer.setName("M G Perera");

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return engineer;
    }
}
