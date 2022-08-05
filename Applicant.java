package java_job_app_tracker;

public class Applicant {

	String firstName;
	String lastName;
	String emailAddress;
	
	public Applicant() {
		this.firstName="0";
		this.lastName="0";
		this.emailAddress="0";
		
	}
	
	public Applicant(String firstName, String lastName, String emailAddress)  {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailAddress=emailAddress;
	}
}

