package Dependencies;

public class Live {    
    public void alive(){
        System.out.println("you're alive");
    }
    
    public void respawn(){
        System.out.println("dont worry ill bring u back");
    }
}

class Enjoy{
    public void start(Live n){
        n.alive();
    }
    
    public void Shooted(){
        System.out.println("you are shooted, you are dead");
    }
    public void stop (Live n){
        n.respawn();
    }
}

class main{
    public static void main(String[] args){
        Enjoy enjoy = new Enjoy();
        Live live = new Live();
        enjoy.start(live);
        enjoy.Shooted();
        enjoy.stop(live);
    }
}