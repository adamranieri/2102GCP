package dev.ranieri.utiltests;

import dev.ranieri.utils.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.Map;

public class ConnectionTest {

    @Test
    void generates_connection(){
        Map<String,String> env = System.getenv();
        for(String envName : env.keySet()){
            System.out.println(envName);
        }

        Connection conn = ConnectionUtil.createConnection();
        System.out.println(conn);
        Assertions.assertNotNull(conn);
    }

    @Test
    void get_environment_variable(){
        String env = System.getenv("greeting");
        System.out.println(env);
    }
}
