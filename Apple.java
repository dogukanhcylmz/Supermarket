package java2lab03;

public class Apple implements Fruit {
  
	private double getPrice;
	private String getArrivalDay;
	
	Apple(double getPrice, String getArrivalDay){
		this.getPrice = getPrice;
		this.getArrivalDay = getArrivalDay;
		
	}
	
	
	@Override
	public double getPrice() {
		return getPrice ;
	}

	@Override
	public String getArrivalDay() {
		return getArrivalDay;
	}

}
