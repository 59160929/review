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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author 59160929
 */
public class ReviewPostDao {
    
    private int idRestaurant1 ;
    private int count ;
    private int point ;
    
    public ReviewPostDao(int idRestaurant, int count,int point){
        this.idRestaurant1 = idRestaurant;
        this.count = count;
        this.point = point;
    }
    
    public int idRestaurant1(){
        return idRestaurant1;
    }
    
    
    public static int getCountRestaurant(String NameRestaurant)  throws SQLException {
        PreparedStatement pst;

        
        try {
            String serverName = "db144.hostinger.in.th";
            String mydatabase = "u300081131_rev";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "u300081131_rev";
            String password = "password0880";
            Connection connection = DriverManager.getConnection(url, username, password);
            connection.createStatement();

            
            String sql = "SELECT count FROM Restaurant where idRestaurant=1IDRestaurant";
            pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            int columnCount = rs.getMetaData().getColumnCount();
            System.out.print(columnCount);
            while (rs.next()) {
            String count   = rs.getString("count");
            int returncount = Integer.parseInt(count);
            return returncount;
       
        
          }
        }
        catch (Exception e) {

        }

        
        
        int count =0;
        
        
       
        return count;
        //คืนค่า count ของ restaurant
    }
    
        
       public static boolean InsertPointAndCount(int IDRestaurant,int count,int point)  throws SQLException {
            PreparedStatement pst;
        Connection connection;
            int countdatabase;
            int pointdatabase;
            
              connection = DriverManager.getConnection(db.url, db.username, db.password);
             connection.createStatement();
                
   
        
           Statement st = connection.createStatement();
           
            String countfromdatabase = "Select count From Restaurant WHERE idRestaurant= IDRestaurant";
           // pst=connection.prepareStatement(countfromdatabase);
            ResultSet rs = st.executeQuery(countfromdatabase);
           if(rs.next()) {
               
               countdatabase = rs.getInt("count");
                        count = countdatabase+count;  // เอาค่าเก่ามาบวกกับบค่าใหม่ที่ส่งไป จำนวนครั้ง

           }


          
            
            
            
            String pointfromdatabase = "Select point From Restaurant WHERE idRestaurant= IDRestaurant";
            rs = st.executeQuery(pointfromdatabase);
                        
             if(rs.next()) {
               
               pointdatabase = rs.getInt("point");
                        point = pointdatabase+point;  // เอาค่าเก่ามาบวกกับบค่าใหม่ที่ส่งไป จำนวนครั้ง

           }
                                 
            
            
            
           String sql ="update Restaurant SET count = ? , point= ? WHERE idRestaurant = IDRestaurant";
           pst=connection.prepareStatement(sql);
           
            pst.setInt(1, count);
            pst.setInt(2, point);
            pst.executeUpdate();
            System.out.print( pst);
                    
        System.out.print(rs.next());

           System.out.println(IDRestaurant);
        
        
        
        return true;
     
    }
         
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                try {
                    InsertPointAndCount(1,2,3);
                } catch (SQLException ex) {
                    Logger.getLogger(ReviewPostDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                   try {
                    InsertPointAndCount(2,10,13);
                } catch (SQLException ex) {
                    Logger.getLogger(ReviewPostDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                      try {
                    InsertPointAndCount(3,100,100);
                } catch (SQLException ex) {
                    Logger.getLogger(ReviewPostDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                         try {
                    InsertPointAndCount(4,5000,2243);
                } catch (SQLException ex) {
                    Logger.getLogger(ReviewPostDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                new Review().setVisible(true);
            }
        });
    }
      
      
      
  
}
