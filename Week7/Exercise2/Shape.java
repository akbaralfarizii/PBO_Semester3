package Exercise2;

public class Shape {
    //private atribut
    private String color;
    private boolean filled;
    
    //default constructor
    public Shape(){
        this.color="blue";
        this.filled=true;
    }
    
    //constructor with given color, filled
    public Shape(String c, boolean f){
        this.color=c;
        this.filled=f;
    }
    
    //return the color
    public String getColor(){
        return this.color;
    }
    
    //set color
    public void setColor(String color){
        this.color=color;
    }
    
    //return the filled
    public boolean isFilled(){
        return this.filled;
    }
    //set filled
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    
    public String toString(){
        if(isFilled()){
            return "A shape with color of "+ color + " is filled";
        }else{
            return "A shape with color of "+ color + " isn't filled";
        }
    }
}