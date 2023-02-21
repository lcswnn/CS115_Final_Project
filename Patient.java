import java.util.Scanner;

public class Patient {

	Scanner scan = new Scanner(System.in);
	
	//instance variables
	private String name;
	private String bloodType;
	private char bloodSign;
	private String dateOfBirth;
	
	private String medicalCase;
	private boolean request;
	
	
	//Defualt Constructor
	Patient () {
		setName("Carter");
		setBloodType("O-");
		setDateOfBirth("11/29/2000"); 
		setMedicalCase("Trauma");
	}
	
	
	//setters
	public void setName(String name1) {
		name = name1;
	}
	
	public void setBloodType(String bloodType1) {
		bloodType = bloodType1;
	}
	
	public void setDateOfBirth (String dateOfBirth1) {
		dateOfBirth = dateOfBirth1;
	}
	
	public void setMedicalCase(String medicalCase1) {
		medicalCase = medicalCase1;
	}
	
	public void setBloodSign(char bloodSign1) {
		bloodSign = bloodSign1;
	}
	
	public void setRequest(boolean request1) {
		request = request1;
	}
	
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public String getMedicalCase() {
		return medicalCase;
	}
	
	public char getBloodSign() {
		return bloodSign;
	}
	
	public boolean getRequest() {
		return request;
	}
	
	
	//ask name
	public void askName() {
		System.out.println("What is your name?: ");
		String name = scan.next();
		setName(name);
		System.out.println("Welcome " + name + "!");
	}
		
	//ask blood type
	public void askBloodType() {
		System.out.println("What is your blood type? (A, B, AB, O): ");
		String bloodType = scan.next();
		setBloodType(bloodType);
		System.out.println("Positive or Negative? (+/-):  ");
		char bloodSign = scan.next().charAt(0);
		setBloodSign(bloodSign);
		System.out.println("Your blood type is: " + bloodType + bloodSign);
	}
		
	//ask date of birth
	public void askDateOfBirth() {
		System.out.println("What is your date of birth? (format: ##/##/####): ");
		String dateOfBirth = scan.next();
		setDateOfBirth(dateOfBirth);
		System.out.println("Your birth date is: " + dateOfBirth);
	}
	
	
	//ask medical case
	public void askMedicalCase() {
		System.out.println("What is your medical case?: ");
		String medicalCase = scan.next();
		setMedicalCase(medicalCase);
	}
	
	
	//check blood type for reception
	public void checkBloodType() {
		if (getBloodType().equalsIgnoreCase("AB") && getBloodSign() == '+') {
			System.out.println("You can recieve all positive blood types!");
		}
		else if (getBloodType().equalsIgnoreCase("AB") && getBloodSign() == '-') {
			System.out.println("You can recieve ALL blood types!");
		}
		else if (getBloodType().equalsIgnoreCase("A") && getBloodSign() == '+') {
			System.out.println("You can recieve blood types: A+, AB+");
		}
		else if (getBloodType().equalsIgnoreCase("A") && getBloodSign() == '-') {
			System.out.println("You can recieve blood types: A+, A-, AB+, AB-");
		}
		else if (getBloodType().equalsIgnoreCase("B") && getBloodSign() == '+') {
			System.out.println("You can recieve blood types: B+, AB+");
		}
		else if (getBloodType().equalsIgnoreCase("B") && getBloodSign() == '-') {
			System.out.println("You can recieve blood types: B+, B-, AB+, AB-");
		}
		else if (getBloodType().equals("AB") && getBloodSign() == '+') {
			System.out.println("You can recieve blood type: AB+");
		}
		else if (getBloodType().equals("AB") && getBloodSign() == '-') {
			System.out.println("You can recieve blood type: AB+, AB-");
		}
		else if (getBloodType().equalsIgnoreCase("O") && getBloodSign() == '+') {
			System.out.println("You can recieve blood type: O+, O-");
		}
		else if (getBloodType().equalsIgnoreCase("O") && getBloodSign() == '-') {
			System.out.println("You can recieve blood type: O-");
		}
	}
	
	
	//request blood
	public void requestBlood() {
		System.out.println("Would you like to request blood? (Yes/No): ");
		String answer = scan.next();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("Blood is on the way!");
			setRequest(true);
		}
		else if (answer.equalsIgnoreCase("Y")) {
			System.out.println("Blood is on the way!");
			setRequest(true);
		}
		else {
			System.out.println("Sit, and we'll be right with you.");
			setRequest(false);
		}
		
	}
	
	
	//keep track of state blood units
	public void StateInfo() {
		System.out.println("Available Blood Units Per State: \n");
		//10
		System.out.println(StateInfo.States[0] + ": " + StateInfo.AlabamaNumber + " units available");
		System.out.println(StateInfo.States[1] + ": " + StateInfo.AlaskaNumber + " units available");
		System.out.println(StateInfo.States[2] + ": " + StateInfo.ArizonaNumber + " units available");
		System.out.println(StateInfo.States[3] + ": " + StateInfo.ArkansasNumber + " units available");
		System.out.println(StateInfo.States[4] + ": " + StateInfo.CaliforniaNumber + " units available");
		System.out.println(StateInfo.States[5] + ": " + StateInfo.ColoradoNumber + " units available");
		System.out.println(StateInfo.States[6] + ": " + StateInfo.ConnecticutNumber + " units available");
		System.out.println(StateInfo.States[7] + ": " + StateInfo.DelawareNumber + " units available");
		System.out.println(StateInfo.States[8] + ": " + StateInfo.FloridaNumber + " units available");
		System.out.println(StateInfo.States[9] + ": " + StateInfo.GeorgiaNumber + " units available");
		//20
		System.out.println(StateInfo.States[10] + ": " + StateInfo.HawaiiNumber + " units available");
		System.out.println(StateInfo.States[11] + ": " + StateInfo.IdahoNumber + " units available");
		System.out.println(StateInfo.States[12] + ": " + StateInfo.IllinoisNumber + " units available");
		System.out.println(StateInfo.States[13] + ": " + StateInfo.IndianaNumber + " units available");
		System.out.println(StateInfo.States[14] + ": " + StateInfo.IowaNumber + " units available");
		System.out.println(StateInfo.States[15] + ": " + StateInfo.KansasNumber + " units available");
		System.out.println(StateInfo.States[16] + ": " + StateInfo.KentuckyNumber + " units available");
		System.out.println(StateInfo.States[17] + ": " + StateInfo.LouisianaNumber + " units available");
		System.out.println(StateInfo.States[18] + ": " + StateInfo.MaineNumber + " units available");
		System.out.println(StateInfo.States[19] + ": " + StateInfo.MarylandNumber + " units available");
		//30
		System.out.println(StateInfo.States[20] + ": " + StateInfo.MassachusettsNumber + " units available");
		System.out.println(StateInfo.States[21] + ": " + StateInfo.MichiganNumber + " units available");
		System.out.println(StateInfo.States[22] + ": " + StateInfo.MinnesotaNumber + " units available");
		System.out.println(StateInfo.States[23] + ": " + StateInfo.MississippiNumber + " units available");
		System.out.println(StateInfo.States[24] + ": " + StateInfo.MissouriNumber + " units available");
		System.out.println(StateInfo.States[25] + ": " + StateInfo.MontanaNumber + " units available");
		System.out.println(StateInfo.States[26] + ": " + StateInfo.NebraskaNumber + " units available");
		System.out.println(StateInfo.States[27] + ": " + StateInfo.NevadaNumber + " units available");
		System.out.println(StateInfo.States[28] + ": " + StateInfo.NewHampshireNumber + " units available");
		System.out.println(StateInfo.States[29] + ": " + StateInfo.NewJerseyNumber + " units available");
		//40
		System.out.println(StateInfo.States[30] + ": " + StateInfo.NewMexicoNumber + " units available");
		System.out.println(StateInfo.States[31] + ": " + StateInfo.NewYorkNumber + " units available");
		System.out.println(StateInfo.States[32] + ": " + StateInfo.NorthCarolinaNumber + " units available");
		System.out.println(StateInfo.States[33] + ": " + StateInfo.NorthDakotaNumber + " units available");
		System.out.println(StateInfo.States[34] + ": " + StateInfo.OhioNumber + " units available");
		System.out.println(StateInfo.States[35] + ": " + StateInfo.OklahomaNumber + " units available");
		System.out.println(StateInfo.States[36] + ": " + StateInfo.OregonNumber + " units available");
		System.out.println(StateInfo.States[37] + ": " + StateInfo.PennsylvaniaNumber + " units available");
		System.out.println(StateInfo.States[38] + ": " + StateInfo.RhodeIslandNumber + " units available");
		System.out.println(StateInfo.States[39] + ": " + StateInfo.SouthCarolinaNumber + " units available");
		//50
		System.out.println(StateInfo.States[40] + ": " + StateInfo.SouthDakotaNumber + " units available");
		System.out.println(StateInfo.States[41] + ": " + StateInfo.TennesseeNumber + " units available");
		System.out.println(StateInfo.States[42] + ": " + StateInfo.TexasNumber + " units available");
		System.out.println(StateInfo.States[43] + ": " + StateInfo.UtahNumber + " units available");
		System.out.println(StateInfo.States[44] + ": " + StateInfo.VermontNumber + " units available");
		System.out.println(StateInfo.States[45] + ": " + StateInfo.VirginiaNumber + " units available");
		System.out.println(StateInfo.States[46] + ": " + StateInfo.WashingtonNumber + " units available");
		System.out.println(StateInfo.States[47] + ": " + StateInfo.WestVirginiaNumber + " units available");
		System.out.println(StateInfo.States[48] + ": " + StateInfo.WisconsinNumber + " units available");
		System.out.println(StateInfo.States[49] + ": " + StateInfo.WyomingNumber + " units available");
	}
	
	
	//ask state of user
	public void askState() {
		System.out.println("What state are you from?: ");
		String userState = scan.next();
		
		if (userState.equalsIgnoreCase(StateInfo.States[0])) {
			System.out.println("Chosen State: " + StateInfo.States[0]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.AlabamaNumber - userNumber));
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[1])) {
			System.out.println("Chosen State: " + StateInfo.States[1]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.AlaskaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[2])) {
			System.out.println("Chosen State: " + StateInfo.States[2]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.ArizonaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[3])) {
			System.out.println("Chosen State: " + StateInfo.States[3]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.ArkansasNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[4])) {
			System.out.println("Chosen State: " + StateInfo.States[4]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.CaliforniaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[5])) {
			System.out.println("Chosen State: " + StateInfo.States[5]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.ColoradoNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[6])) {
			System.out.println("Chosen State: " + StateInfo.States[6]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.ConnecticutNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[7])) {
			System.out.println("Chosen State: " + StateInfo.States[7]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.DelawareNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[8])) {
			System.out.println("Chosen State: " + StateInfo.States[8]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.FloridaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[9])) {
			System.out.println("Chosen State: " + StateInfo.States[9]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.GeorgiaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[10])) {
			System.out.println("Chosen State: " + StateInfo.States[10]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.HawaiiNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[11])) {
			System.out.println("Chosen State: " + StateInfo.States[11]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.IdahoNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[12])) {
			System.out.println("Chosen State: " + StateInfo.States[12]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.IllinoisNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[13])) {
			System.out.println("Chosen State: " + StateInfo.States[13]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.IndianaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[14])) {
			System.out.println("Chosen State: " + StateInfo.States[14]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.IowaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[15])) {
			System.out.println("Chosen State: " + StateInfo.States[15]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.KansasNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[16])) {
			System.out.println("Chosen State: " + StateInfo.States[16]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.KentuckyNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[17])) {
			System.out.println("Chosen State: " + StateInfo.States[17]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.LouisianaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[18])) {
			System.out.println("Chosen State: " + StateInfo.States[18]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MaineNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[19])) {
			System.out.println("Chosen State: " + StateInfo.States[19]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MarylandNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[20])) {
			System.out.println("Chosen State: " + StateInfo.States[20]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MassachusettsNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[21])) {
			System.out.println("Chosen State: " + StateInfo.States[21]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MichiganNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[22])) {
			System.out.println("Chosen State: " + StateInfo.States[22]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MinnesotaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[23])) {
			System.out.println("Chosen State: " + StateInfo.States[23]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MississippiNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[24])) {
			System.out.println("Chosen State: " + StateInfo.States[24]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MissouriNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[25])) {
			System.out.println("Chosen State: " + StateInfo.States[25]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.MontanaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[26])) {
			System.out.println("Chosen State: " + StateInfo.States[26]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NebraskaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[27])) {
			System.out.println("Chosen State: " + StateInfo.States[27]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NevadaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[28])) {
			System.out.println("Chosen State: " + StateInfo.States[28]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NewHampshireNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[29])) {
			System.out.println("Chosen State: " + StateInfo.States[29]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NewJerseyNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[30])) {
			System.out.println("Chosen State: " + StateInfo.States[30]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NewMexicoNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[31])) {
			System.out.println("Chosen State: " + StateInfo.States[31]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NewYorkNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[32])) {
			System.out.println("Chosen State: " + StateInfo.States[32]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NorthCarolinaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[33])) {
			System.out.println("Chosen State: " + StateInfo.States[33]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.NorthDakotaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[34])) {
			System.out.println("Chosen State: " + StateInfo.States[34]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.OhioNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[35])) {
			System.out.println("Chosen State: " + StateInfo.States[35]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.OklahomaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[36])) {
			System.out.println("Chosen State: " + StateInfo.States[36]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.OregonNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[37])) {
			System.out.println("Chosen State: " + StateInfo.States[37]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.PennsylvaniaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[38])) {
			System.out.println("Chosen State: " + StateInfo.States[38]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.RhodeIslandNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[39])) {
			System.out.println("Chosen State: " + StateInfo.States[39]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.SouthCarolinaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[40])) {
			System.out.println("Chosen State: " + StateInfo.States[40]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.SouthDakotaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[41])) {
			System.out.println("Chosen State: " + StateInfo.States[41]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.TennesseeNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[42])) {
			System.out.println("Chosen State: " + StateInfo.States[42]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.TexasNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[43])) {
			System.out.println("Chosen State: " + StateInfo.States[43]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.UtahNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[44])) {
			System.out.println("Chosen State: " + StateInfo.States[44]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.VermontNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[45])) {
			System.out.println("Chosen State: " + StateInfo.States[45]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.VirginiaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[46])) {
			System.out.println("Chosen State: " + StateInfo.States[46]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.WashingtonNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[47])) {
			System.out.println("Chosen State: " + StateInfo.States[47]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.WestVirginiaNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[48])) {
			System.out.println("Chosen State: " + StateInfo.States[48]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.WisconsinNumber - userNumber));
			
		}
		else if (userState.equalsIgnoreCase(StateInfo.States[49])) {
			System.out.println("Chosen State: " + StateInfo.States[49]);
			System.out.println("How many units would you like to recieve?");
			int userNumber = scan.nextInt();
			System.out.println("The new units available is: " + (StateInfo.WyomingNumber - userNumber));
			
		}
	}
}