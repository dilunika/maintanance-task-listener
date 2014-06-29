package org.jkd.poc.maintnot;

import org.jkd.poc.maintnot.model.ReplacementNotification;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kd40173 on 19/06/14.
 */
@Component
public class MaintananceServiceFrontEnd {

    @Path("/replacements")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response notifyReplacement(ReplacementNotification notification){
        return null;
    }
}
