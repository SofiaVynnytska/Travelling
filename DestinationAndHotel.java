package travelling;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class DestinationAndHotel {
	static List<String> listOfDestinations;
	static double distance;
	static Map<String, List<String>> mapOfHotels;
	static Map<String, Double> mapOfHotelPrice;

	static String setDestination(Tourist tourist, int numbOfDestination){
		tourist.setDestination(listOfDestinations.get(numbOfDestination-1));
		return listOfDestinations.get(numbOfDestination-1);
	}
	static List<String> chooseHotel(Tourist tourist){
		List<String> chosenHotel = null;
		for(Map.Entry<String, List<String>> entry : mapOfHotels.entrySet()){

			if(entry.getKey().trim().equals(tourist.getDestination().trim())){
				chosenHotel = entry.getValue();
			}
		}
		return chosenHotel;
	}
	static String setHotel(Tourist tourist, int numbOfHotel, List<String> chosenHotel){
		tourist.setChosenHotel(chosenHotel.get(numbOfHotel-1));
		return chosenHotel.get(numbOfHotel-1);
	}
	static double getHotelPrice(Tourist tourist){
		double hotelPrice = 0;
		for(Map.Entry<String, Double> entry : mapOfHotelPrice.entrySet()){
			if(entry.getKey().trim().equals(tourist.getChosenHotel().trim())){
				hotelPrice = entry.getValue();
				break;
			}
		}
		return hotelPrice;
	}
	static double getDistance(Tourist tourist){
		Random r = new Random();
		distance = 100 + (1000 - 100) * r.nextDouble();
		return distance;
	}
}
