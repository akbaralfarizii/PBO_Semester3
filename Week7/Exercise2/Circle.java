package Exercise2;

public class Circle extends Shape{
    //private variable
    private double radius;
    
    public Circle(){
        this.radius=1.0;
    }
    
    public Circle(double r){
        this.radius=r;
    }
    
    public Circle(double r, String c, boolean f){
        super(c,f);
        this.radius=r;
        
    }
    
    //return the radius
    public double getRadius(){
        return this.radius;
    }
    // set radius
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString(){
        return "A Circle with radius= " + getRadius() + ", which is subclass of " + super.toString();
    }
}