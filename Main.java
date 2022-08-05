package java_job_app_tracker;

import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//------initialize variables------------------
		String fileName="job_apps_list.csv";
		String filepath=""; //if a filepath is desired
		
		//-----------initialize array objects-------------
	
		Applicant[] arrAppl = new Applicant[] {new Applicant("Bisrat", "Belay", "")};
		Job[] arrJob = new Job[] {new Job()};
		
		//-------record user input-----------
		
		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Enter jobURL: ");
		arrJob[0].jobURL = scanner1.nextLine();
		
		System.out.println("Enter companyName: ");
		arrJob[0].companyName = scanner1.nextLine();
		
		System.out.println("Enter jobTitle: ");
		arrJob[0].jobTitle = scanner1.nextLine();
		
		System.out.println("Enter location: ");
		arrJob[0].location = scanner1.nextLine();
	
		arrJob[0].timestamp = new Date();
		
		System.out.println("Enter interview: (true/false) ");
		arrJob[0].interview = scanner1.nextBoolean();
		
		System.out.println("Enter replied: (true/false) ");
		arrJob[0].replied = scanner1.nextBoolean();
		
		System.out.println("Enter jobReq: ");
		arrJob[0].jobReq = scanner1.next();
		
		scanner1.close();
		
		//-----create new file---------//
		try {
		      File newFile = new File(fileName);
		      if (newFile.createNewFile()) {
		        System.out.println("\nFile created: " + newFile.getName());
		      } else {
		        System.out.println("\nFile already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("\nError has occurred.");
		      e.printStackTrace();
		    }
		//----------write to new file---------------//
		
		try {
		      FileWriter newWriter = new FileWriter(fileName, true);
		      for(Job i: arrJob) {
		    	  newWriter.write("\n" + arrAppl[0].firstName + " " + arrAppl[0].lastName + ", " + i.jobURL + ", " + i.companyName + ", " + i.jobTitle + ", " + i.location + ", "+ new Date() + ", " + i.interview + ", " + i.replied + ", " + i.jobReq);
		      }
		      newWriter.close();
		      System.out.println("\nWrote to the file.");
		    } catch (IOException e) {
		      System.out.println("\nError has occurred.");
		      e.printStackTrace();
		    }
	}

}
