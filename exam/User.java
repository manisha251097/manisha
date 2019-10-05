import java.util.*;

public class User {
    String User_name;
    User[] connections;
    int NoOfConnectionss;
    
    
    User(final String n,final int nc){
        this.User_name=n;
        this.connections = new User[100];
        this.NoOfConnections=nc;
    }

/**
     * getters
     */
    public String getUserName(){
        return this.User_name;
    }
    /**
     * setters
     */
    public void setUserName(final String name) {
        this.name=name;

    }
    public User[] getConnections(){
        return connections;

    }

}


