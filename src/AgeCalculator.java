import java.util.Scanner;  

public class AgeCalculator {

	public static void main(String[] args) {
		
		int day[] = new int[50];  
		int month[] = new int[50]; 
		int year[] = new int[50];;
		String go = "yes"; 
		int i= 0; 
		int age = 0; 
		int today = 2017;
		
	
		
		Scanner keyboard = new Scanner(System.in);
		
		while(go.equals("yes")){ 
		
			System.out.println("Enter the day of birth");
			day[i] = keyboard.nextInt(); 
			
			System.out.println("Enter month"); 
			month[i] = keyboard.nextInt();
			
			
			System.out.println("Enter year of birth"); 
			year[i] = keyboard.nextInt(); 
			
			i++;
			
			System.out.println("Would you like to enter details for another client?"); 
			go= keyboard.next(); 
			} 
		
		
		for(int counter =0; counter<i; counter++){ 
			age = today - year[counter];
			System.out.printf("%d-%d-%d \t", day[counter], month[counter], year[counter]); 
			System.out.println(age);
		
		}
		
	
	} 
	
	

}
