package TestDemo;

public class cricketer {
	String cricketerName;
	int jerseyNo;
	static String countryName;// null
	static int countryID;// 0
	public static void main(String[] args) {
		System.out.println("Indian Cricket Team info  ");
		System.out.println("****OBject1 info ");
		cricketer msd = new cricketer();
		msd.jerseyNo = 7;
		msd.cricketerName = "Dhoni";
		// Initialization
		countryID = 91;
		countryName = "India";
		// Accessing the static data
		System.out.println("Country Name: " + countryName);
		System.out.println("COuntry ID : " + countryID);
		// Accessing the instance data with Object Reference variable
		System.out.println("Jersey Number : " + msd.jerseyNo);
		System.out.println("Cricketer Name : " + msd.cricketerName);
		System.out.println("****OBject2 info **********");
		cricketer virat = new cricketer();
		virat.jerseyNo = 18;
		virat.cricketerName = "Virat Kohli";
		System.out.println("Country Name: " + virat.countryName);// India
		System.out.println("COuntry ID : " + virat.countryID);// 91
		System.out.println("Jersey Number : " + virat.jerseyNo);// 0
		System.out.println("Cricketer Name : " + virat.cricketerName);// null
		System.out.println("****OBject3 info **********");
		cricketer rohit = new cricketer();
		rohit.jerseyNo = 45;
		rohit.cricketerName = "Rohit Sharama";
		System.out.println("Country Name: " + countryName);// India
		System.out.println("COuntry ID : " + countryID);// 91
		System.out.println("Jersey Number : " + rohit.jerseyNo);// 0
		System.out.println("Cricketer Name : " + rohit.cricketerName);// null
		System.out.println("****OBject4 info **********");
		cricketer kl = new cricketer();
		countryID = 92;
		countryName = "Bharath";
		System.out.println("Country Name: " + countryName);//
		System.out.println("COuntry ID : " + countryID);//
		System.out.println("Jersey Number : " + kl.jerseyNo);//
		System.out.println("Cricketer Name : " + kl.cricketerName);//
		
	}
}


