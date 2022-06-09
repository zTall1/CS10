package JavaProject;

import java.util.Scanner;

public class JavaProject 
{

	public static void main(String[] args) 
	{
		System.out.println("Please enter your desired courses or 'view' to view the course catalog or 'exit' to leave");	
		Scanner userinput = new Scanner(System.in); //allows program to scan and saves user input
		String input = userinput.nextLine();
		String a = "Aboriginal Studies 10_5cr";
		String b = "CALM";
		String b2 = "CALM_online";
		String c = "English as a Second Language 10-Level 2";
		String c2 = "English as a Second Language 10-Level 3";
		String c3 = "English as a Second Language 10-Level 4";
		String d = "English Language Arts 10-2";
		String d2 = "English Language Arts 10-1";
		String d3 = "English Language Arts 10-1_cohort a";
		String d4 = "English Language Arts 10-1_cohort AP";
		String d5 = "English Language Arts 10-1_SciSchool";
		String d6 = "English Language Arts 10-2_cohort ELL";
		String d7 = "English Language Arts 10-4";
		String e = "Art 10_5 cr";
		String e2 = "Drama 10_5 cr";
		String e3 = "Instrumental Music 10_5 cr";
		String e4 = "Dance 15_5 cr";
		String e5 = "Band 15_5 cr";
		String e6 = "Technical Theatre 15";
		String g = "Chinese L&C 10-3Y";
		String g2 = "French 10-3Y";
		String g3 = "French 10-9Y";
		String g4 = "German L&C 10-3Y";
		String g5 = "Spanish L&C 10-3Y";
		String h = "Mathematics 10C";
		String h2 = "Mathematics 10C_cohort b";
		String h3 = "Mathematics 10C_cohort AP";
		String h4 = "Mathematics 10C_SciSchool";
		String h5 = "Mathematics 10-3";
		String h6 = "Mathematics 10-3_cohort ELL";
		String h7 = "Mathematics 10-4";
		String i = "Physical Education 10cr5_cohort a";
		String i2 = "Physical Education 10cr5_cohort b";
		String j = "Science 10";
		String j2 = "Science 10_cohort a";
		String j3 = "Science 10_SciSchool";
		String j4 = "Science 14";
		String j5 = "Science 10-4";
		String k = "Social Studies 10-1";
		String k2 = "Social Studies 10-1_cohort a";
		String k3 = "Social Studies 10-1_cohort AP";
		String k4 = "Social Studies 10-1_SciSchool";
		String k5 = "Social Studies 10-2";
		String k6 = "Social Studies 10-2_cohort ELL";
		String k7 = "Social Studies 10-4";
		String l = "Leadership, Character & Soc Resp 15-5";
		String m = "Yoga 15_5 cr";
		while(input != "view") //creates a loop
		{
		
			if (input == a)
	       	{
	        	System.out.println("This GPA doesn't exist.");
	        	System.out.println("Enter another course, or type end to exit:");
	        	input = userinput.nextLine();
	       	}
	      
	       	else
	       	{
	        	System.out.println("The available courses are recognized by its letter, the corresponding letter to each course is as follows. \r\n"
	        			+ "                a = \"Aboriginal Studies 10_5cr\";\r\n"
	        			+ "		b = \"CALM\";\r\n"
	        			+ "		b2 = \"CALM_online\";\r\n"
	        			+ "		c = \"English as a Second Language 10-Level 2\";\r\n"
	        			+ "		c2 = \"English as a Second Language 10-Level 3\";\r\n"
	        			+ "		c3 = \"English as a Second Language 10-Level 4\";\r\n"
	        			+ "		d = \"English Language Arts 10-2\";\r\n"
	        			+ "		d2 = \"English Language Arts 10-1\";\r\n"
	        			+ "		d3 = \"English Language Arts 10-1_cohort a\";\r\n"
	        			+ "		d4 = \"English Language Arts 10-1_cohort AP\";\r\n"
	        			+ "		d5 = \"English Language Arts 10-1_SciSchool\";\r\n"
	        			+ "		d6 = \"English Language Arts 10-2_cohort ELL\";\r\n"
	        			+ "		d7 = \"English Language Arts 10-4\";\r\n"
	        			+ "		e = \"Art 10_5 cr\";\r\n"
	        			+ "		e2 = \"Drama 10_5 cr\";\r\n"
	        			+ "		e3 = \"Instrumental Music 10_5 cr\";\r\n"
	        			+ "		e4 = \"Dance 15_5 cr\";\r\n"
	        			+ "		e5 = \"Band 15_5 cr\";\r\n"
	        			+ "		e6 = \"Technical Theatre 15\";\r\n"
	        			+ "		g = \"Chinese L&C 10-3Y\";\r\n"
	        			+ "		g2 = \"French 10-3Y\";\r\n"
	        			+ "		g3 = \"French 10-9Y\";\r\n"
	        			+ "		g4 = \"German L&C 10-3Y\";\r\n"
	        			+ "		g5 = \"Spanish L&C 10-3Y\";\r\n"
	        			+ "		h = \"Mathematics 10C\";\r\n"
	        			+ "		h2 = \"Mathematics 10C_cohort b\";\r\n"
	        			+ "		h3 = \"Mathematics 10C_cohort AP\";\r\n"
	        			+ "		h4 = \"Mathematics 10C_SciSchool\";\r\n"
	        			+ "		h5 = \"Mathematics 10-3\";\r\n"
	        			+ "		h6 = \"Mathematics 10-3_cohort ELL\";\r\n"
	        			+ "		h7 = \"Mathematics 10-4\";\r\n"
	        			+ "		i = \"Physical Education 10cr5_cohort a\";\r\n"
	        			+ "		i2 = \"Physical Education 10cr5_cohort b\";\r\n"
	        			+ "		j = \"Science 10\";\r\n"
	        			+ "		j2 = \"Science 10_cohort a\";\r\n"
	        			+ "		j3 = \"Science 10_SciSchool\";\r\n"
	        			+ "		j4 = \"Science 14\";\r\n"
	        			+ "		j5 = \"Science 10-4\";\r\n"
	        			+ "		k = \"Social Studies 10-1\";\r\n"
	        			+ "		k2 = \"Social Studies 10-1_cohort a\";\r\n"
	        			+ "		k3 = \"Social Studies 10-1_cohort AP\";\r\n"
	        			+ "		k4 = \"Social Studies 10-1_SciSchool\";\r\n"
	        			+ "		k5 = \"Social Studies 10-2\";\r\n"
	        			+ "		k6 = \"Social Studies 10-2_cohort ELL\";\r\n"
	        			+ "		k7 = \"Social Studies 10-4\";\r\n"
	        			+ "		l = \"Leadership, Character & Soc Resp 15-5\";\r\n"
	        			+ "		m = \"Yoga 15_5 cr\";\r\n"
	        			+ "		    \"Please enter your desired course or 'exit' to leave\";");
	        			input = userinput.nextLine();
	       	}
	  
	             	 
		}
	  	 
	
	}

}
