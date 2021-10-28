package Exercise2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 =new Shape();
        System.out.println(s1.toString());
        
        Shape s2 = new Shape("blue", true);
        System.out.println(s2.toString());
        
        s2.setFilled(false);
        s2.setColor("red");
        System.out.println(s2.toString());
        
        
    }
}