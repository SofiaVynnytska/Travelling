package travelling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TravelAgencyTravelling extends DestinationAndHotel{
	static double priceBus = 20;
	static double excPrice = 0;
	static List<String> listOfExcursions;
	static Map<String, Double> mapOfExcursionPrice;
	static boolean confirmed;

	static String [] setDate(Tourist tourist, String checkIn, String checkOut){
		tourist.setDateAndTime(checkIn, checkOut);
		String [] date = new String [2];
		date[0] = checkIn;
		date[1] = checkOut;
		return date;
	}
	static double getPriceOfHotelAllTime(Tourist t, double oneDayPrice) throws ParseException{
		String [] temp = t.getDateAndTime();
		SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date1 = myFormat.parse(temp[0]);
	    Date date2 = myFormat.parse(temp[1]);
	    int daysBetweenDates = (int) ((date2.getTime() - date1.getTime()) / (1000 * 60 * 60* 24));
		return oneDayPrice*daysBetweenDates;
	}
	static String setExcurcion(Tourist tourist, String confirmation, int numbOfExcursion){
		String excursionChosen = new String();
		if(confirmation.trim().equals("так")){
			tourist.setExcursion(listOfExcursions.get(numbOfExcursion-1));
			excursionChosen = listOfExcursions.get(numbOfExcursion-1);
		} else{
			tourist.setExcursion("не заброньовано");
			excursionChosen = "не заброньовано";
		}
		return excursionChosen;
	}
	static boolean checkConfirmation(String confirmation){
		boolean flag = false;
		if(confirmation.trim().equals("так")){
			flag = true;
		}
		return flag;
	}
	static double getPriceOfExcursion(Tourist tourist){
		for(Map.Entry<String, Double> entry : mapOfExcursionPrice.entrySet()){
			if(entry.getKey().trim().equals(tourist.getExcursions().trim())){
				excPrice = entry.getValue();
			}
			break;
		}
		return excPrice;
	}
	static boolean getConfirmation(Tourist tourist, double distance, double hotelPrice, double excPrice){
		confirmed = false;

		if(((int)(tourist.getBalanceOfMoney() - priceBus*distance - hotelPrice - excPrice))  >= 0){
			confirmed = true;
		}
		return confirmed;
	}
}
