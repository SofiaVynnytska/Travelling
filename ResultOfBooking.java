package travelling;

import java.util.List;

public class ResultOfBooking {
	static void resultOfOwnTravelling(int days){
		System.out.println("� ����� ����� ���� : " + days + " ���.");
	}
	static void resultOfTravelAgenceTravelling(boolean result){
		if(result){
			System.out.println("�� ������ ����������� ������.");
		} else{
			System.out.println("�� ������� ������ ��� ����������.");
		}
	}
	static void excursionDisplay(String excursion){
		System.out.println("������� �������� : " + excursion);
	}
	static void dateDisplay(String checkIn, String checkOut){
		System.out.println("���� ������ : " + checkIn + ", ���� ����� : " + checkOut);
	}
	static void fuelDisplay(String fuel){
		System.out.println("������� ������ : " + fuel);
	}
	static void spendingOfFuelDisplay(double spendingOfFuel){
		System.out.println("������� �������� : " + spendingOfFuel);
	}
	static void destinationDisplay(String destination){
		System.out.println("�������� ����� ����������� :  " + destination);
	}
	static void hotelDisplay(String hotel){
		System.out.println("�������� ������ : " + hotel);
	}
	static void spendingOfFuel(){
		System.out.println("��� ������� �������� �� 1 ��?");
	}
	static void chooseFuel(List<String>listOfFuel){
		int count = 1;
		System.out.println("������ ����� ��������");
		for(String fuel : listOfFuel){
			System.out.println(fuel + " : " + count);
			count++;
		}
	}
	static void chooseDestination(List<String>listOfDestinations){
		int count = 1;
		System.out.println("������ ����� ������ �����������");
		for(String destination : listOfDestinations){
			System.out.println(destination + " : " + count);
			count++;
		}
	}
	static void touristDisplay(Tourist tourist){
		System.out.println(tourist);
	}
	static void checkInDisplay(){
		System.out.println("������ ���� ������ (dd.mm.yyyy)");
	}
	static void checkOutDisplay(){
		System.out.println("������ ���� ����� (dd.mm.yyyy)");
	}
	static void excursionDisplay(){
		System.out.println("���� ������� ��������? (���/�)");
	}
	static void chooseNumbOfExcursion(String confirmation, List<String>listOfExcursions){
		if(confirmation.trim().equals("���")){
			System.out.println("������� ����� �������");
			int count = 1;
			for(String excursion : listOfExcursions){
				System.out.println(excursion + " : " + count);
				count++;
			}
		}
	}
	static void displayHotels(Tourist tourist, List<String> chosenHotel){
		int count = 1;
		System.out.println("������� ������ � ����� : " + tourist.getDestination());
		for(String hotel : chosenHotel){
			System.out.println(hotel + " : " + count);
			count++;
		}
	}
}
