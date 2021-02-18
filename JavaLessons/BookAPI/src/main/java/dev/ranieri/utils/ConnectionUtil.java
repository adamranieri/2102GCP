package dev.ranieri.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection createConnection(){

        //"jdbc:postgresql://34.86.126.212:5432/bookDB?user=user&password=password"
        // It is really bad practice to store any sensitive information in your code
        // environment variables key value pairs on your computer you can make whenever
        String details = System.getenv("CONN_DETAILS");

        try {
            Connection conn = DriverManager.getConnection(details); // a factory. pass in string details for any type of datbase
            // anywhere and the DriverManger factory will give you back a connection implementation specifically for postgres
            return  conn;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

    }


}
