package nuisance;

import java.util.Objects;



public class Friend extends Person{
 private Hobby hobby;
	
	public Friend(String name, int age, Hobby hobby) {
		super(name, age);
		this.hobby = hobby;
		// TODO Auto-generated constructor stub
	}
	public String chill(){
		return getName() + "is chilling";
	}
	public String play(Friend[] friends) {
	StringBuilder result = new StringBuilder("playing" + hobby.toString());
	if (friends.length == 0) {
		return "playing " + hobby;
	}else if(friends.length == 1) {
		result.append(" with ").append(friends[0].getName());
		//"[P|p]laying MUSIC with Billy.?"//
		}
	else if(friends.length == 2) {
       result.append(" with " ).append(friends[0].getName()).append(" and ").append(friends[1].getName());
      // result.append(" with ").append(friends[0].getName())
     //  .append(" and ").append(friends[1].getName());
	}
	else {
		result.append(" with ").append(friends[0].getName())
		.append(", ").append(friends[1].getName());
	    
		for(int i = 2; i < friends.length -1; i++ ) {
			result.append(", ").append(friends[i].getName());
		}
		result.append(", and").append(friends[friends.length - 1].getName());
	}
	return result.toString();
	}
	


	
	
	
	@Override
	public String toString() {
		return "Friend []";
	}
	
}