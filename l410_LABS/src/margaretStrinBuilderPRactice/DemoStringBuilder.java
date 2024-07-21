package margaretStrinBuilderPRactice;

import java.util.Arrays;
import java.util.List;

public class DemoStringBuilder {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List <String> trees = Arrays.asList("oak", "pine", "ash");
	System.out.println(listToString(trees));
	
	}
 private static String listToString(List<String> list) {
	 
	 StringBuilder sb = new StringBuilder(32);
	 
	 for(String el: list)
	 {
		 sb.append(el).append(" ");
	 }
	 return sb.toString();
 }
 
	}


