package org.example.DAO;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class DBfunctions {

    public static Connection getSQLConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc","system", "password");
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public static ResultSet method(String query) throws SQLException {
        ResultSet result = getSQLConnection().createStatement().executeQuery(query);
        return result;
    }



}
