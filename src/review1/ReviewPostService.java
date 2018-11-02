/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 59160929
 */
public class ReviewPostService {

    public static boolean addPointRestaurant(int IDrestaurant,int count,int point) throws SQLException {
        PreparedStatement pst;
        Connection connection;
        
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        connection.createStatement();
        pst = connection.prepareStatement("Select * from Restaurant where IDrestaurant = ? ");
        //pst.setString(1, IDrestaurantChange);

        String IDrestaurantChange = Integer.toString(IDrestaurant);
        
        ResultSet rs = pst.executeQuery();
        boolean result = rs.next();
        connection.close();
        return result;

    }
     public static boolean getPointRestaurant(int IDrestaurant,int point) throws SQLException {
         
        
        //User getDatamana = UserDao.getUsername(username);
       // System.out.println(getDatamana);
                
        
        return true;
    }
}
