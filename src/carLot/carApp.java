package carLot;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class carApp {

	public static Scanner scnr = new Scanner(System.in);

	public static List<Car> cars = new ArrayList<>(); 

	public static void main(String[] args) {

		carTest carTest = new carTest ("Ford", "Taurus", 2000, 3000.00, 0);
	
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
		
		System.out.println("Current Inventory");
		
		//need to count the instances of cars
		for(int i=0; i < carTest.carMakeList.size(); i++) {
	        System.out.println("This is a test");
	            System.out.printf("%-12s %-12s %-12s $%-12s %-12s \n", carTest.carMakeList.get(i), carTest.carModelList.get(i), carTest.yearList.get(i), carTest.priceList.get(i), carTest.usedList.get(i));
	            //was able to pull the info from the first position in the ArrayList object. Was not able to add more objects into the array. Was not able to print by toString. 
	            //Wanted to make an array list object so that I could add new cars above, subtract out purchased cars, and print a list of all cars in inventory. I think I was really close to do this. 
	            //had issues with mileage and used car option of object. I think it needs to be a child of the carTest object. 
	            // the Car object also could be included into the carTest object. 
	            
	            
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
