package java2lab03;

public class Orange implements Fruit{
	private double getPrice;
	private String getArrivalDay;
	
	Orange(double getPrice, String getArrivalDay){
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
