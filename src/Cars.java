
public class Cars {
	String carType;
	String carBrand; 
	String color;
	int carModel;
	int rentPrice;
	
	public Cars() {
		carType="";
		carBrand="";
		color="";
		carModel=0;
		rentPrice=0;
	}
	public Cars(String cT, String cB, String color,int cM, int rP) {
		this.carType = cT;
		this.carBrand = cB;
		this.color = color;
		this.carModel = cM;
		this.rentPrice = rP;
	}
	
	public String getCategory() {
		return carType;
	}
	public void setCategory(String cT) {
		this.carType = cT;
	}
	public String getName() {
		return carBrand;
	}
	public void setName(String cB) {
		this.carBrand = cB;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModel() {
		return carModel;
	}
	public void setModel(int cM) {
		this.carModel = cM;
	}
	public int getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(int rP) {
		this.rentPrice = rP;
	}
	
	
}
