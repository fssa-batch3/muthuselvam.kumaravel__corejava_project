package day06.solved;

public class StringArray {

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";

		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
		System.out.println();
		
		cityArr[3]="Delhi";
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		System.out.println();
		
		for(int i=0; i<cityArr.length; i++) {
			if(cityArr[i]=="Bangalore") {
				
				cityArr[i]="Kolkata";
			}
			
		}
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		System.out.println();
		
		for(int i=0; i<cityArr.length-1; i++) {
			if(cityArr[i]=="Mumbai") {
				cityArr[i]=cityArr[i+1];
				cityArr[i+1] = "";
			}
			
		}
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
	}
}
