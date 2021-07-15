/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectslab;

/**
 *
 * @author olanrewaju4401
 */
public class Rectangle {
    
    private double height;
    private double width;

    /**
     * @return the height
     */
    public Rectangle() {}   
          
    
    @Override  //optional
    public String toString(){
        
        String c = "H: "+height+"\n";
        c+= "W: " + width +"\n";
        c+= "C:"+computeperimeter()+"\n";
         
        return c;
    }
    
    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {        
         if (height <=0){
            this.height = 1;
        }
        else{
        this.height = height;
         }
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {        
        if (width <=0){
            this.width = 1;
        }
        else{
        this.width = width;
        }
    }
    
    public double computeperimeter( ) {
        
       return (2 * height) + (2 * width); 
    }
    
    public double computearea( ) {
        
       return height* width; 
    }
}
