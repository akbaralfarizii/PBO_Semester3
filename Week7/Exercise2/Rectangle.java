package Exercise2;

public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    
    public Rectangle(double w, double l){
        this.width=w;
        this.length=l;
    }
    
    public Rectangle(double w, double l, String c, boolean f){
        super(c,f);
        this.width=w;
        this.length=l;
    }
    
    //return the width
    public double getWidth(){
        return this.width;
    }
    
    //set width
    public void setWidth(double width){
        this.width=width;
    }
    
    //return the length
    public double getLength(){
        return this.length;
    }
    
    //set Length
    public void setLength(double length){
        this.length=length;
    }
    
    public double getArea(){
        return width*length;
    }
    
    public double getPerimeter(){
        return 2*(length+width);
    }
    
    public String toString(){
        return "A Rectangle with width= " + getWidth() + "and length = "+ getLength() +" which is a subclass of "+ super.toString();
    }
}