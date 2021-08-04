package travelling;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dispatcher {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		//Own travelling
		String [] destTemp = {"Париж", "Київ", "Львів", "Болгарія", "Туреччина"};
		String [] fuelTemp = {"A-95", "A-92", "A-98", "дизель", "газ"};
		String [] excursionsTemp = {"Exc1", "Exc2", "Exc3", "Exc4", "Exc5"};

		Map<String, List<String>> mapOfHotels = new TreeMap<>();
		Map<String, Double> mapOfHotelPrice = new TreeMap<>();
		Map<String, Double> mapOfFuelPrice = new TreeMap<>();
		Map<String, Double> mapOfExcursionPrice = new TreeMap<>();

		mapOfExcursionPrice.put("Exc1", 150.0); mapOfExcursionPrice.put("Exc2", 200.0);
		mapOfExcursionPrice.put("Exc3", 350.0); mapOfExcursionPrice.put("Exc4", 100.0); mapOfExcursionPrice.put("Exc5", 650.0);

		List<String> hotels = new ArrayList<>();
		hotels.add("Metropol"); hotels.add("Novotel"); hotels.add("Luna Park");
		mapOfHotels.put("Париж", hotels);
		hotels = new ArrayList<>();
		hotels.add("Florida"); hotels.add("Lybid"); hotels.add("Kiev");
		mapOfHotels.put("Київ", hotels);
		hotels = new ArrayList<>();
		hotels.add("Dream Hostel"); hotels.add("Palma"); hotels.add("Mars");
		mapOfHotels.put("Львів", hotels);
		hotels = new ArrayList<>();
		hotels.add("Balcanci"); hotels.add("Compliment"); hotels.add("Nasco");
		mapOfHotels.put("Болгарія", hotels);
		hotels = new ArrayList<>();
		hotels.add("Delphin"); hotels.add("Crystal"); hotels.add("Asteria");
		mapOfHotels.put("Туреччина", hotels);

		mapOfHotelPrice.put("Metropol", 1500.0); mapOfHotelPrice.put("Novotel", 1200.0); mapOfHotelPrice.put("Luna Park", 500.0);
		mapOfHotelPrice.put("Florida", 1000.0); mapOfHotelPrice.put("Lybid", 900.0); mapOfHotelPrice.put("Kiev", 850.0);
		mapOfHotelPrice.put("Dream Hostel", 1100.0); mapOfHotelPrice.put("Palma", 1110.0); mapOfHotelPrice.put("Mars", 1550.0);
		mapOfHotelPrice.put("Balcanci", 750.0); mapOfHotelPrice.put("Compliment", 1220.0); mapOfHotelPrice.put("Nasco", 1700.0);
		mapOfHotelPrice.put("Delphin", 2500.0); mapOfHotelPrice.put("Crystal", 500.0); mapOfHotelPrice.put("Asteria", 1900.0);

		mapOfFuelPrice.put("A-95", 28.50); mapOfFuelPrice.put("A-92", 24.0); mapOfFuelPrice.put("A-98", 35.50);
		mapOfFuelPrice.put("дизель", 10.50); mapOfFuelPrice.put("газ", 18.0);

		OwnTravelling.mapOfHotels = mapOfHotels;
		OwnTravelling.mapOfHotelPrice = mapOfHotelPrice;
		OwnTravelling.mapOfFuelPrice = mapOfFuelPrice;
		OwnTravelling.listOfDestinations  = Arrays.asList(destTemp);
		OwnTravelling.listOfFuel = Arrays.asList(fuelTemp);

		Tourist t = new Tourist("Sofia", 17, 10000, "Lwiw");
		ResultOfBooking.chooseDestination(OwnTravelling.listOfDestinations);
		int numbOfDestination = scan.nextInt();
		ResultOfBooking.destinationDisplay(OwnTravelling.setDestination(t, numbOfDestination));
		List<String> chosenHotel = OwnTravelling.chooseHotel(t);
		ResultOfBooking.displayHotels(t, chosenHotel);
		int numbOfHotel = scan.nextInt();
		ResultOfBooking.hotelDisplay(OwnTravelling.setHotel(t, numbOfHotel, chosenHotel));
		ResultOfBooking.chooseFuel(OwnTravelling.listOfFuel);
		int numbOfFuel = scan.nextInt();
		ResultOfBooking.fuelDisplay(OwnTravelling.setFuel(t, numbOfFuel));
		ResultOfBooking.spendingOfFuel();
		double spending = scan.nextDouble();
		ResultOfBooking.spendingOfFuelDisplay(OwnTravelling.setSpendingOfFuel(t, spending));
		int days = OwnTravelling.returnDaysToStay(t, OwnTravelling.getDistance(t), OwnTravelling.getHotelPrice(t), OwnTravelling.getFuelPrice(t));
		ResultOfBooking.resultOfOwnTravelling(days);
		ResultOfBooking.touristDisplay(t);

		//Travel agency travelling
		TravelAgencyTravelling.mapOfExcursionPrice = mapOfExcursionPrice;
		TravelAgencyTravelling.listOfExcursions = Arrays.asList(excursionsTemp);

		Tourist t1 = new Tourist("Sofia", 17, 1050, "Lwiw");
		ResultOfBooking.chooseDestination(TravelAgencyTravelling.listOfDestinations);
		int numbOfDestination1 = scan.nextInt();
		ResultOfBooking.destinationDisplay(TravelAgencyTravelling.setDestination(t1, numbOfDestination1));
		List<String> chosenHotel1 = TravelAgencyTravelling.chooseHotel(t1);
		ResultOfBooking.displayHotels(t1, chosenHotel1);
		int numbOfHotel1 = scan.nextInt();
		ResultOfBooking.hotelDisplay(TravelAgencyTravelling.setHotel(t1, numbOfHotel1, chosenHotel1));
		ResultOfBooking.checkInDisplay();
		String checkIn = scan.next();
		ResultOfBooking.checkOutDisplay();
		String checkOut = scan.next();
		String [] date = TravelAgencyTravelling.setDate(t1, checkIn, checkOut);
		ResultOfBooking.dateDisplay(date[0], date[1]);

		ResultOfBooking.excursionDisplay();
		String confirmation = scan.next();
		ResultOfBooking.chooseNumbOfExcursion(confirmation, TravelAgencyTravelling.listOfExcursions);
		int numbOfExcursion = 0;
		if(TravelAgencyTravelling.checkConfirmation(confirmation)){
			numbOfExcursion = scan.nextInt();
		}
		String excursion1 = TravelAgencyTravelling.setExcurcion(t1, confirmation, numbOfExcursion);
		ResultOfBooking.excursionDisplay(excursion1);

		boolean result = TravelAgencyTravelling.getConfirmation(t1, TravelAgencyTravelling.getDistance(t1), TravelAgencyTravelling.getPriceOfHotelAllTime(t1, TravelAgencyTravelling.getHotelPrice(t1)), TravelAgencyTravelling.getPriceOfExcursion(t1));
		ResultOfBooking.resultOfTravelAgenceTravelling(result);
		ResultOfBooking.touristDisplay(t1);
		scan.close();
	}

}
