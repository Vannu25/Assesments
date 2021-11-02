
public class ServiceCentre {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bike Washing Begin...");
		
		Bike b1 = new Bike();
		b1.setBikeType("Two Wheeler");
		b1.setBikeName("Jupiter");
		b1.setBikeColor("Grey");
		b1.setBikeCost(400);
		b1.setBikeStatus("Dirty");
		
		Bike b2 = new Bike();
		b2.setBikeType("Two wheeler");
		b2.setBikeName("Activa");
		b2.setBikeColor("White");
		b2.setBikeCost(1000);
		b2.setBikeStatus("Very Dirty");
		
		System.out.println("Before wash : Jupiter : "+b1); //will invoke toString()
		System.out.println("Before wash : Activa  : "+b2);

  ServiceCent washBike = new ServiceCent();

b1 = washBike.fuzzyWash(30, b1);
b2 = washBike.fuzzyWash(50, b2);

System.out.println("After wash :  Jupiter : "+b1); //will invoke toString()
System.out.println("After wash :  Activa : "+b2); //will invoke toString()

	}
}
class Bike //pojo - plain old java object 
{
	
	private String BikeType; //jeans
	private String BikeName; //levis
	private String BikeColor; // blue
	private float BikeCost; // 4000
	private String BikeStatus;
	public String getBikeType() {
		return BikeType;
	}
	public void setBikeType(String bikeType) {
		BikeType = bikeType;
	}
	public String getBikeName() {
		return BikeName;
	}
	public void setBikeName(String bikeName) {
		BikeName = bikeName;
	}
	public String getBikeColor() {
		return BikeColor;
	}
	public void setBikeColor(String bikeColor) {
		BikeColor = bikeColor;
	}
	public float getBikeCost() {
		return BikeCost;
	}
	public void setBikeCost(float bikeCost) {
		BikeCost = bikeCost;
	}
	public String getBikeStatus() {
		return BikeStatus;
	}
	public void setBikeStatus(String bikeStatus) {
		BikeStatus = bikeStatus;
	}
	@Override
	public String toString() {
		return "Bike [BikeType=" + BikeType + ", BikeName=" + BikeName + ", BikeColor=" + BikeColor
				+ ", BikeCost=" + BikeCost + ", BikeStatus=" + BikeStatus + "]";
	}
}
class Mechanic
{
	
}
class ServiceCent extends Mechanic //isA
{
	private OilingTub oilTub = new OilingTub(); //hasA
	
	void fuzzyWash() {
		System.out.println("Fuzzy wash program set for undefined minutes");
		System.out.println("Washing...dont know... ");
		oilTub.wash();
	}
	
	//producesA				//usesA (int,    String)
		String fuzzyWash(int minutes, String Bike) {
			System.out.println("Fuzzy wash program set for "+minutes+" minutes");
			System.out.println("Washing... "+Bike);
			oilTub.wash();
			return "Washed "+Bike;
		}
		//producesA				//usesA (int,    String)
		Bike fuzzyWash(int minutes, Bike theBike) {
			System.out.println("Fuzzy wash program set for "+minutes+" minutes");
			System.out.println("Washing... "+theBike.getBikeType()+ " which is "+theBike.getBikeStatus());
			oilTub.wash();
			theBike.setBikeStatus("Washed");
			return theBike;
		}

}
class Tub 
{
	
}
class OilingTub  extends Tub {
	void wash() {
		System.out.println("Washing....");
		
	}
	void oilchanging () {
		System.out.println("oilchanging....");
		
	}
	void refilling() {
		System.out.println("refilling....");
	}
}



