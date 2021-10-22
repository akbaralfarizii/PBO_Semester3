package Composition;

public class ApexLegend {
    private String name;

    public void legendName(){
        System.out.printf(name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Command{
    ApexLegend apex;
    public void attack(){
        System.out.println(", Launch attack!");
    }
    public void retreat(){
        System.out.println( ", Initiate Retreat!");
    }
}

class Legends extends ApexLegend{
    Command cmd = new Command();
    public void setAttack(){
        cmd.attack();
    }
    public void setRetreat(){
        cmd.retreat();
    }
}