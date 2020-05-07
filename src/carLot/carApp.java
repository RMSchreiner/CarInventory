package carLot;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class carApp {

	public static Scanner scnr = new Scanner(System.in);

	public static List<Car> cars = new ArrayList<>(); 
	public static List<UsedCar>usedCars=new ArrayList<>();    
	public static void main(String[] args) {

		usedCars.add( new UsedCar("Ford", "Taurus", 2003, 2000.00, 150000));
		usedCars.add( new UsedCar("Chevy", "Festiva", 2000, 1000.00, 100000));
		usedCars.add( new UsedCar("Toyota", "Celica", 2005, 2400.00, 175000));
		cars.add(new Car("Chevy", "Equinox", 2019, 25000));
		cars.add(new Car("Toyota", "Tacoma", 2019, 35000));
		cars.add(new Car("Chrysler", "Malibu", 2019, 20000));
		
		System.out.println("Welcome to Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering:");

		int carsEntered = scnr.nextInt();
            scnr.nextLine();
       
		for(int i=0; i < carsEntered; i++){
		        addCar();	
		        
		}
		System.out.println("Added to inventory:");
		
		for(Car car: cars) {
			System.out.printf("%-12s %-12s %-12s $%-12s \n", car.getMake(), car.getModel(), car.getYear(), car.getPrice());	    
			
		}	
		
		boolean shouldContinue = true;//boolean original true
		while(shouldContinue) {	
		
		System.out.println("Current Inventory");
	   
	   int i = 0;
	   for(Car car: cars) {
			System.out.printf( ++i + " %-12s %-12s %-12s $%-12s \n", car.getMake(), car.getModel(), car.getYear(), car.getPrice());	    
		}	
	   for(UsedCar usedcar: usedCars) {
			System.out.printf( ++i + " %-12s %-12s %-12s $%-12s(Used) %-12s \n", usedcar.getMake(), usedcar.getModel(), usedcar.getYear(), usedcar.getPrice(), usedcar.getMileage());	    
		}	
	   
	   System.out.println("Enter the number of the car you would like to buy:");
	   int carSelection = 1;
	   carSelection = scnr.nextInt()-1; 
	    
	   
	   System.out.println("You selected to purchase:");
	   System.out.println("  Make         Model        Year        Price         Mileage");
	   
	   
	   
	   //Here I used an if else statement to take the input of the number of car selected and compared them to the array list. This way I could keep used cars and new cars separate.
	   
	   if(carSelection < cars.size()) {
		   System.out.println(cars.get(carSelection));
		   cars.remove(carSelection);}
	   else if ((carSelection - cars.size()) < usedCars.size()) {
		   System.out.println(usedCars.get(carSelection - cars.size()));
		   usedCars.remove((carSelection - cars.size()));
	   }else {System.out.println("Some Error Try again.");}
	   System.out.println("Great choice! Our financing department will reach out to you soon.");
	   System.out.println("Would you like to select another vehicle to purchase? y/n");
	   String response = scnr.next();
		
		
		//bottom of the loop asking if they would like to continue
		shouldContinue = response.equals("y");
		
		System.out.println("Thanks for visiting. Come back again!");
		
		scnr.close();
		}
	   
	   
	   
	   }
	   
	  
	
	
	    
	public static void addCar() {

		Car car = new Car();

		System.out.println("Enter info for car.");
		
		System.out.print("Make: ");       
		car.setMake(scnr.nextLine());

		System.out.print("Model: ");
		car.setModel(scnr.nextLine());

		System.out.print("Year: ");
		car.setYear(scnr.nextInt());

		System.out.print("Price: ");
		car.setPrice(scnr.nextDouble());
		
		System.out.println(".......");

		scnr.nextLine();

		cars.add(car);

	}

}
