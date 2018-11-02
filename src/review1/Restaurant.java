/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

/**
 *
 * @author 59160929
 */
public class Restaurant {

   

    private int idRestaurant;
    private String NameRestaurant;
    private String AddressRestaurant;
    private String DescribtionRestaurant;
    private float Longtitude;
    private float Latitude;
    private int Count;
    private int Point;
    
    
    public Restaurant(int idRestaurant, String NameRestaurant,String AddressRestaurant,String DescribtionRestaurant,
    float Longtitude, float Latitude,int Count,int Point) {
        
        this.idRestaurant = idRestaurant;
        this.NameRestaurant = NameRestaurant;
        this.AddressRestaurant = AddressRestaurant;
        this.DescribtionRestaurant = DescribtionRestaurant;
        this.Longtitude = Longtitude;
        this.Latitude = Latitude;
        this.Count = Count;
        this.Point = Point;

    }

    Restaurant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Restaurant(String u, String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public int getIDRestaurant() {
        return idRestaurant;
    }
    public String NameRestaurant() {
        return NameRestaurant;
    }
    public void setIDRestaurant(int idRestaurant) {
        this.idRestaurant = idRestaurant;
    }
    public void setNameRestaurant(String NameRestaurant) {
        this.NameRestaurant = NameRestaurant;
    }
    
    
    
    
}
