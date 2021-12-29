package com.sist.oracle;

import oracle.jdbc.logging.annotations.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DB202112271622_midium?TNS_ADMIN=/Users/kimheejun/Documents/Wallet_DB202112271622",
                    "admin",
                    "Gmlwnsskgus!@1208");
        }catch (Exception e){}
    }
}
