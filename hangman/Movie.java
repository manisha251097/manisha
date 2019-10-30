class Movie{
    String name;
    String level;
    String hint;
    String actor;
    


Movie(String name, String level,String hint,String actor){
    this.name=name;
    this.level=level;
    this.hint=hint;
    this.actor=actor;

}

public String getname(){
       return this.name;
    }
public void setName(String name) {
		 this.name=name;
    }
public String getLevel() {
        return this.level;
    }   

public void setLevel(String level) {
		this.level = level;
    }

public String getHint() {
		return this.hint ;
	}

public void setHint(String hint) {
		 this.hint=hint;
	}

public String getActor() {
		return this.actor;
	}

public void setActor(String actor) {
		this.actor = actor;
    }
    
public String toString() {
        return this.name + " - " + this.level; 
    }

}





