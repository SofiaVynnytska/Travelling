package travelling;

import java.util.List;

public class ResultOfBooking {
	static void resultOfOwnTravelling(int days){
		System.out.println("В готелі можна жити : " + days + " днів.");
	}
	static void resultOfTravelAgenceTravelling(boolean result){
		if(result){
			System.out.println("Ви успішно забронювали поїздку.");
		} else{
			System.out.println("Не вистачає грошей для бронювання.");
		}
	}
	static void excursionDisplay(String excursion){
		System.out.println("Вибрана екскурсія : " + excursion);
	}
	static void dateDisplay(String checkIn, String checkOut){
		System.out.println("Дата приїзду : " + checkIn + ", Дата відїзду : " + checkOut);
	}
	static void fuelDisplay(String fuel){
		System.out.println("Вибране пальне : " + fuel);
	}
	static void spendingOfFuelDisplay(double spendingOfFuel){
		System.out.println("Витрата пального : " + spendingOfFuel);
	}
	static void destinationDisplay(String destination){
		System.out.println("Вибраний пункт призначення :  " + destination);
	}
	static void hotelDisplay(String hotel){
		System.out.println("Вибраний готель : " + hotel);
	}
	static void spendingOfFuel(){
		System.out.println("Яка витрата пального на 1 км?");
	}
	static void chooseFuel(List<String>listOfFuel){
		int count = 1;
		System.out.println("Введіть номер пального");
		for(String fuel : listOfFuel){
			System.out.println(fuel + " : " + count);
			count++;
		}
	}
	static void chooseDestination(List<String>listOfDestinations){
		int count = 1;
		System.out.println("Введіть номер пункту призначення");
		for(String destination : listOfDestinations){
			System.out.println(destination + " : " + count);
			count++;
		}
	}
	static void touristDisplay(Tourist tourist){
		System.out.println(tourist);
	}
	static void checkInDisplay(){
		System.out.println("Введіть дату приїзду (dd.mm.yyyy)");
	}
	static void checkOutDisplay(){
		System.out.println("Введіть дату відїзду (dd.mm.yyyy)");
	}
	static void excursionDisplay(){
		System.out.println("Буде потрібна екскурсія? (так/ні)");
	}
	static void chooseNumbOfExcursion(String confirmation, List<String>listOfExcursions){
		if(confirmation.trim().equals("так")){
			System.out.println("Виберіть номер екскурсії");
			int count = 1;
			for(String excursion : listOfExcursions){
				System.out.println(excursion + " : " + count);
				count++;
			}
		}
	}
	static void displayHotels(Tourist tourist, List<String> chosenHotel){
		int count = 1;
		System.out.println("Виберіть готель у пункті : " + tourist.getDestination());
		for(String hotel : chosenHotel){
			System.out.println(hotel + " : " + count);
			count++;
		}
	}
}
