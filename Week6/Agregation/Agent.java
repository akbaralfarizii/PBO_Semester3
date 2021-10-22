
package Agregation;

public class Agent {
    int agent_id;
    String name;
    Ability skill;
    
    public Agent(int agent_id, String name, Ability skill){
        this.agent_id = agent_id;
        this.name = name;
        this.skill = skill;
    }
    
    void print(){
        System.out.println("Agent id        :"+ agent_id);
        System.out.println("Agent name      :"+ name);
        System.out.println("Agent ability   :"+ skill.skill1 + ", " + skill.skill2 + ", " + skill.ultimate);
    }
    
    public static void main (String[] args){
        Ability ability = new Ability ("Dismiss", "Lure", "Empress");
        Agent agent = new Agent(1002, "Reyna", ability);
        
        agent.print();
    }
}
