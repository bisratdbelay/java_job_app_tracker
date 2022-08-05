package java_job_app_tracker;

import java.util.Date;

public class Job {
	
	String jobURL;
	String companyName;
	String jobTitle;
	String location;
	Date timestamp;
	Boolean interview;
	Boolean replied;
	String jobReq;
	
	public Job() {
		this.jobURL="0";
		this.companyName="0";
		this.jobTitle="0";
		this.location="0";
		this.timestamp=new Date();
		this.interview=true;
		this.replied=true;
		this.jobReq="0";
	}
	
	public Job(String jobURL, String companyName, String jobTitle, String location, Date timestamp, boolean interview, boolean replied, String jobReq) {
		this.jobURL=jobURL;
		this.companyName=companyName;
		this.jobTitle=jobTitle;
		this.location=location;
		this.timestamp=timestamp;
		this.interview=interview;
		this.replied=replied;
		this.jobReq=jobReq;
	}

}

