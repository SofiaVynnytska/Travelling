package travelling;

import java.util.List;
import java.util.Map;

public class OwnTravelling extends DestinationAndHotel{
	static List<String> listOfFuel;
	static int daysToStay;
	static double fuelPrice;
	static Map<String, Double> mapOfFuelPrice;

	static String setFuel(Tourist tourist, int numbOfFuel){
		tourist.setFuel(listOfFuel.get(numbOfFuel-1));
		return listOfFuel.get(numbOfFuel-1);
	}
	static double setSpendingOfFuel(Tourist tourist, double spending){
		tourist.setSpendingOfFuel(spending);
		return spending;
	}
	static double getFuelPrice(Tourist tourist){
		for(Map.Entry<String, Double> entry : mapOfFuelPrice.entrySet()){
			if(entry.getKey().trim().equals(tourist.getFuel().trim())){
				fuelPrice = entry.getValue();
			}
			break;
		}
		return fuelPrice;
	}
	static int returnDaysToStay(Tourist tourist, double distance, double hotelPrice, double fuelPrice){
		double leftForHotel = tourist.getBalanceOfMoney() - tourist.getSpendingOfFuel()*distance*fuelPrice;
		daysToStay = (int) ((int) leftForHotel / hotelPrice);
		return daysToStay;
	}
}
