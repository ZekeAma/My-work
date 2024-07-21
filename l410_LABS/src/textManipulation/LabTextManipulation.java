package textManipulation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class LabTextManipulation {
	
	private static String updateSpelling(String text) {
		String[] words = text.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(String Words : words) {
			String SetlowerCase = Words.toLowerCase(); 
			String firstLetterUppercase = SetlowerCase.substring(0,1).toUpperCase() + SetlowerCase.substring(1);
			sb.append(firstLetterUppercase).append(" ");
		
			
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
   List <String> parks = new ArrayList<>();
   System.out.println("please enter your favorite National Parks or DOne to stop: ");
  StringBuilder sb = new StringBuilder(32);
   String UserInput = scan.nextLine();
   
   while(!UserInput.equals("done"))
		   {
	   parks.add(UserInput);
	   System.out.println("please enter your favorite National Parks or DOne to stop: ");
	   UserInput = scan.nextLine();
	   
	   
   }
   for(String park: parks) {
	   sb.append(park).append(" | ");
	  
	   
   }
   if (sb.length() > 0){
	   sb.setLength(sb.length()- 3);
   }
   String nationalParks = sb.toString();
 
  String UpdatedText = updateSpelling(nationalParks);
  System.out.println(UpdatedText);
   

 
	}

}
