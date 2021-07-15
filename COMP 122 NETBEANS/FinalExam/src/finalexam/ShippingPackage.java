/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author olanrewaju4401
 */
public class ShippingPackage {
    
    private int id;
    private String destination;
    private int height;
    private int width;
    private int depth;
    private double weight;
    private static int NumberOfPackages;

    /**
     * @return the id
     */
    public ShippingPackage() {}
    
    @Override  //optional
    public String toString(){
        
        String ShippingPackage = "ID: "+id+"\n";
        ShippingPackage+= "Destination: "+ destination +"\n";
        ShippingPackage+= "Height: "+ height +"\n";  
        ShippingPackage+= "Width: "+width+"\n"; 
        ShippingPackage+= "Depth: "+ depth +"\n";
        ShippingPackage+= "Weight: "+ weight +"\n";          
       
        NumberOfPackages++;
        
        return ShippingPackage;
    }
    
    public ShippingPackage (int id, String destination, int height, int width, int depth, double weight) {
        this.id = id;
        this.destination = destination;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
        NumberOfPackages++;
    }
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
          if (height < 1){
         this.height = 1; 
         }
         else{        
        this.height = height;
          }
    }

    /**
     * @return the Width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(int width) {
         if (width < 1){
         this.width = 1; 
         }
         else{
        this.width = width;
         }
    }
  
    /**
     * @return the depth
     */
    public int getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(int depth) {
         if (depth < 1){
         this.depth = 1; 
         }
         else{
        this.depth = depth;
         }
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

      
    public int computeVolume() {
        
       return depth * width * height; 
    }
    
    public double computeShipping() {
        int volume = depth * width * height;
        
       return (volume *0.001) + (0.5 * weight); 
    }
    
    public static int getNumberShipped() {
        int countnumberOfPackages=0; 
        for(int i = 0; i<ShippingPackage.NumberOfPackages; i++){
            
            countnumberOfPackages++;
        }
        return countnumberOfPackages++;
        
    }
    
}
 

 