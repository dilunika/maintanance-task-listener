package org.jkd.poc.maintnot.dataaccess;

import org.jkd.poc.maintnot.model.ReportingEvent;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

/**
 * Created by kd40173 on 22/06/14.
 */

@Component
public class ReportingEventRepository extends JdbcDaoSupport{


    private static final String INSERT_SQL = "INSERT INTO REPORTING_EVENTS (REQUEST_CORELATOR, OPERATION_NAME, REQUEST, RESPONSE) VALUES (?,?,?,?)";

    public void insert(ReportingEvent reportingEvent) {

        getJdbcTemplate().update(INSERT_SQL,new Object[]{reportingEvent.getRequestCorelator(),
                                                         reportingEvent.getOperationName(),
                                                         reportingEvent.getRequest(),
                                                         reportingEvent.getResponse()});

    }
}
