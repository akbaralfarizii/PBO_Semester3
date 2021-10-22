package Association;

class Agent {
    private String name;
    private int agent_id;
    private Role role;
    
    public Agent(String name, int agent_id){
        this.name = name;
        this.agent_id = agent_id;
        role = null;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAgent_id() {
        return agent_id;
    }              
}

class Role{
    String roleName;
    private Agent agent;
    
    public Role(String roleName){
        this.roleName = roleName;
        agent = null;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getRoleName() {
        return roleName;
    }
    
}
public class Association {
    public static void main(String[] args){
        Agent agent = new Agent("Jett", 1001);
        Role role = new Role("Duelist");
        role.setAgent(agent);
        agent.setRole(role);
        System.out.println("Agent name  :" + agent.getName());
        System.out.println("Agent id    :" + agent.getAgent_id());
        System.out.println("Agent role  :" + role.getRoleName());
    }
}
