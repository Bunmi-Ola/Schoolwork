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
public class Circle {
    
    private double radius;
  
    public Circle() {}
    
    @Override  //optional
    public String toString(){
        
        String c = "R:"+radius+"\n";
        c+= "C:"+computeCircumference()+"\n";
        c+= "A:"+computeArea()+"\n";       
        
        return c;
    }
    
    public Circle (double radius) {
        this.radius = radius;
       
    }
   
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    
    public void setRadius(int radius) {
        if (radius <=0){
            this.radius = 1;
        }
        else{
        this.radius = radius;
        }
    }

    /**
     * @return the MathPI
     */
    
    public double computeCircumference( ) {
        
       return 2 * 3.14159 * radius; 
    }
    public double computeArea() {
        
       return 3.14159 * radius * radius; 
    }
    
    
        
}
