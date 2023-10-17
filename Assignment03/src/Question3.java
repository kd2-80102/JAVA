import java.util.*;



class Driving {
	
	private int distance;
	private int cost;
	private int average;
	private int parking_fees;
	private int tolls;

	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getParking_fees() {
		return parking_fees;
	}
	public void setParking_fees(int parking_fees) {
		this.parking_fees = parking_fees;
	}
	public int getTolls() {
		return tolls;
	}
	public void setTolls(int tolls) {
		this.tolls = tolls;
	}
	public Driving(int distance, int cost, int average, int parking_fees, int tolls) {
		super();
		this.distance = distance;
		this.cost = cost;
		this.average = average;
		this.parking_fees = parking_fees;
		this.tolls = tolls;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("************MENU******************");
		System.out.println("1.Total miles driven per day.");
		System.out.println("2.Cost per gallon of gasoline.");
		System.out.println("3.Average miles per gallon.");
		System.out.println("4.Parking fees per day.");
		System.out.println("5.Tolls per day.");
		System.out.print("Please Enter your choice : ");
		int choice = sc.nextInt(); 
		return choice;
	}
	
	
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		Driving d1 = new Driving(450, 2000, 8, 50, 5);
		while ((choice = d1.menu()) != 0)
		{
			switch (choice) {
			case 1:
				System.out.println(d1.getDistance());
				break;
			case 2:
				System.out.println(d1.getCost());
				break;
			case 3:
				System.out.println(d1.getAverage());
				break;
			case 4:
				System.out.println(d1.getParking_fees());
				break;
			case 5:
				System.out.println(d1.getTolls());
				break;
			default:
				System.out.println("PLS TRY AGAIN");
				break;
			}
		}
		
		
		
		
	}


}
