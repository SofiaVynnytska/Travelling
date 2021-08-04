package travelling;

import java.util.Arrays;

public class Tourist {
	private String name;
	private int age;
	private double balanceOfMoney;
	private String startPoint;
	private String destination;
	private String chosenHotel;
	private String fuel;
	private double spendingOfFuel;
	private String [] dateAndTime;
	private String excursions;

	@Override
	public String toString() {
		return "Tourist [name=" + name + ", age=" + age + ", balanceOfMoney=" + balanceOfMoney + ", startPoint="
				+ startPoint + ", destination=" + destination + ", chosenHotel=" + chosenHotel + ", fuel=" + fuel
				+ ", spendingOfFuel=" + spendingOfFuel + ", dateAndTime=" + Arrays.toString(dateAndTime)
				+ ", excursions=" + excursions + "]";
	}
	public String getExcursions(){
		return excursions;
	}
	public void setExcursion(String excursion){
		this.excursions = excursion;
	}
	public String [] getDateAndTime(){
		return dateAndTime;
	}
	public void setDateAndTime (String checkIn, String checkOut){
		String [] temp = new String[2];
		temp[0] = checkIn;
		temp[1] = checkOut;
		this.dateAndTime = temp;
	}
	public String getFuel(){
		return fuel;
	}
	public void setFuel(String fuel){
		this.fuel = fuel;
	}
	public double getSpendingOfFuel(){
		return spendingOfFuel;
	}
	public void setSpendingOfFuel(double spendingOfFuel){
		this.spendingOfFuel = spendingOfFuel;
	}
	public String getChosenHotel(){
		return chosenHotel;
	}
	public void setChosenHotel(String chosenHotel){
		this.chosenHotel = chosenHotel;
	}
	public String getDestination(){
		return destination;
	}
	public void setDestination(String destination){
		this.destination = destination;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalanceOfMoney() {
		return balanceOfMoney;
	}
	public void setBalanceOfMoney(double balanceOfMoney) {
		this.balanceOfMoney = balanceOfMoney;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public Tourist(String name, int age, double balanceOfMoney, String startPoint) {
		this.name = name;
		this.age = age;
		this.balanceOfMoney = balanceOfMoney;
		this.startPoint = startPoint;
	}
	public Tourist(String name, int age, double balanceOfMoney, String startPoint, String destination,
			String chosenHotel, String fuel, double spendingOfFuel) {
		this.name = name;
		this.age = age;
		this.balanceOfMoney = balanceOfMoney;
		this.startPoint = startPoint;
		this.destination = destination;
		this.chosenHotel = chosenHotel;
		this.fuel = fuel;
		this.spendingOfFuel = spendingOfFuel;
	}
	public Tourist(){

	}
}
