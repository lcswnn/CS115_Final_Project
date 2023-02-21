
public class ApplicationClass {

	public static void main(String[] args) {
		
		//creating objects
		Website website = new Website();
		Donor donor = new Donor();
		Patient patient = new Patient();
		
		
		//run methods
		website.signIn();
		website.askUserType();
		if (website.getUserType() == true) {
			donor.askName();
			donor.askDateOfBirth();
			donor.askBloodType();
			donor.checkBloodTypes();
			if (donor.checkParameters() == true) {
				donor.setSchedule();
				donor.StateInfo();
				donor.askState();
			}
			
			
		}
		else if (website.getUserType() == false) {
			patient.askName();
			patient.askDateOfBirth();
			patient.askBloodType();
			patient.checkBloodType();
			patient.requestBlood();
			patient.askMedicalCase();
			patient.StateInfo();
			patient.askState();
		}
		
		
		

	}

}