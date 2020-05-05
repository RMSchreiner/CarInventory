package carLot;

import java.util.ArrayList;
public class carTest {
	
	public static ArrayList<String> carMakeList = new ArrayList<>();
    public static ArrayList<String> carModelList = new ArrayList<>(); 
    public static ArrayList<Integer> yearList = new ArrayList<>(); 
    public static ArrayList<Double> priceList = new ArrayList<>(); 
    public static ArrayList<Integer>usedList =  new ArrayList<>();
    
		protected String make;
		protected String model;
		protected int year;
		protected double price;
		protected int used;
		
		//carTest carTest = new carTest ("Ford", "Taurus", 2000, 3000.00);
	                   /* ("Chevy", "Cobalt", 2005, 3000.00, 15000);
		                 ("Ford", "Ranger", 2020, 35000.00);
		                 ("Dodge", "Dakota", 2016, 18000.00, 75000);
		                  ("Ford", "Mustang", 2020, 32000.00);*/
		
		public carTest() {
			
		}
		
		public carTest(String make, String model,int year,double price)  {
			carMakeList.add(make);	
			carModelList.add(model);	
			yearList.add(year);
			priceList.add(price);
		}
		
		
		public carTest(String make, String model,int year,double price, int used) {
		carMakeList.add(make);	
		carModelList.add(model);	
		yearList.add(year);
		priceList.add(price);	
		usedList.add(used);
		}
		
		public ArrayList<String> getCarMakeList() {
			return carMakeList;
		}
		public void setCarMakeList(ArrayList<String> carMakeList) {
			this.carMakeList = carMakeList;
		}
		public ArrayList<String> getCarModelList() {
			return carModelList;
		}
		public void setCarModelList(ArrayList<String> carModelList) {
			this.carModelList = carModelList;
		}
		public ArrayList<Integer> getYearList() {
			return yearList;
		}
		public void setYearList(ArrayList<Integer> yearList) {
			this.yearList = yearList;
		}
		public ArrayList<Double> getPriceList() {
			return priceList;
		}
		public void setPriceList(ArrayList<Double> priceList) {
			this.priceList = priceList;
		}
		public ArrayList<Integer> getUsedList() {
			return usedList;
		}
		public void setUsedList(ArrayList<Integer> usedList) {
			this.usedList = usedList;
		}
		
		@Override
		public String toString() {
			return "carTest [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", used="
					+ used + "]";
		}
	
		
}
		
	
	
	
	
	

