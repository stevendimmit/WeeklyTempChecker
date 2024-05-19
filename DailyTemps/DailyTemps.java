import java.util.ArrayList;
import java.util.Scanner;

public class DailyTemps {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	    ArrayList<String> daysOfWeek = new ArrayList<String>();
	    ArrayList<Double> avgTemp = new ArrayList<Double>();
	    double sumTemps = 0;
	    
	    
	    //Add days of week to arrayList
	    daysOfWeek.add("Monday");
	    daysOfWeek.add("Tuesday");
	    daysOfWeek.add("Wednesday");
	    daysOfWeek.add("Thursday");
	    daysOfWeek.add("Friday");
	    daysOfWeek.add("Saturday");
	    daysOfWeek.add("Sunday");
	    
	    //Add average daily temp to arrayList
	    avgTemp.add(23.43);
	    avgTemp.add(22.73);
	    avgTemp.add(25.01);
	    avgTemp.add(21.64);
	    avgTemp.add(20.33);
	    avgTemp.add(23.41);
	    avgTemp.add(24.44);
	    
	   
	    
	    //List options to user
	    System.out.println("Enter day of week to view daily average in degrees Celcius\n"
	    		+ "Enter week to view all and weekly average\n"
	    		+ "Enter quit to exit:");
	    // while loop to allow the user to keep running the program
	    while (true) { 
	    	// switch statement to deal with the possible inputs 
	    	switch (scnr.next()) {
	    		case "Monday": 
	    			System.out.println(daysOfWeek.get(0) + ": " + avgTemp.get(0) + "°C"); 
	    			break;
	    		case "Tuesday": 
	    			System.out.println(daysOfWeek.get(1) + ": " + avgTemp.get(1) + "°C"); 
	    			break;
	    		case "Wednesday": 
	    			System.out.println(daysOfWeek.get(2) + ": " + avgTemp.get(2) + "°C"); 
	    			break;
	    		case "Thursday": 
	    			System.out.println(daysOfWeek.get(3) + ": " + avgTemp.get(3) + "°C"); 
	    			break;
	    		case "Friday": 
	    			System.out.println(daysOfWeek.get(4) + ": " + avgTemp.get(4) + "°C"); 
	    			break;
	    		case "Saturday": 
	    			System.out.println(daysOfWeek.get(5) + ": " + avgTemp.get(5) + "°C"); 
	    			break;
	    		case "Sunday": 
	    			System.out.println(daysOfWeek.get(6) + ": " + avgTemp.get(6) + "°C"); 
	    			break;	
	    		case "week":
	    			for (int i = 0; i < avgTemp.size(); i++) {
	    				sumTemps = sumTemps + avgTemp.get(i);
	    			}
	    			for (int i = 0; i < avgTemp.size(); i++) {
	    				System.out.println(daysOfWeek.get(i) + ": " + avgTemp.get(i) + "°C");
	    			}
	    			
	    			System.out.println(("Weekly Average: " + sumTemps / avgTemp.size() + "°C"));
	    			break;
	    		case "quit":
                    System.out.println("Exiting program.");
                    scnr.close(); // Close the scanner
                    return; // Exit the main method	
	    			
	    		default: 
	    			System.out.println("Not Valid, try again.");
	    		
	    	}

	    }    
	    
	}

}
