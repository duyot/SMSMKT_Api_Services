package com.vivas.persistent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created by duyot on 9/16/2016.
 */
public class DBUtils {
    public static Logger log = LoggerFactory.getLogger(DBUtils.class);

    public static Connection getConnection(){
        Context initContext = null;
        try {
            initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/ConnectionPool");
            return ds.getConnection();
        } catch (Exception e) {
            log.error("Get connection fail caused: "+ e.toString());
            e.printStackTrace();
        }
        return null;
    }
}
