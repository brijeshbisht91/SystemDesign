package DTDL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sort {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
//		
//		
//		String str = "rock234";
//		String s = str.replaceAll("[^0-9]", "");
//	System.out.print(s);
		
		
		
		String arr[] = {"rock_234", "jon_123", "drow_654", "axe_543", "rush_231", "ather_456"};
		
		
		Pattern p = Pattern.compile("^\\d");
		
		
		
		Comparator<String>  x = new Comparator<String>()
				{

					@Override
					public int compare(String object1, String object2) {
					
					Matcher m = p.matcher(object1);
						
						
						if(!m.find())
						{
							return object1.compareTo(object2);
						}
						
						else
						{
							int number2 = Integer.parseInt(m.group());
						m=	p.matcher(object2);
							
							if(!m.find())

							{

								return object1.compareTo(object2);
							}
						}
						return 0;

	

					}
				
	};
	
	List<String> list =new ArrayList<String>(Arrays.asList(arr));
	Collections.sort(list,x);
	
	System.out.println(list);
	
	}
}