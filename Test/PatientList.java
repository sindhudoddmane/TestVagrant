package Test;

import java.util.Date;
import Test.Doctor;
public class PatientList {
	//Encapsulation
	  	private String patientname;
	    private String patientlocation;
	    private Doctor Visited;

	    public String getName() {
	        return patientname;
	    }

	    public void setName(String patientname) {
	    	//this keyword
	        this.patientname = patientname;
	    }

	    public String getLocation() {
	        return patientlocation;
	    }

	    public void setLocation(String patientlocation) {
	        this.patientlocation = patientlocation;
	    }
	    
	    public Doctor getPatientDetails() 
	    {
	        return Visited;
	    }

	    public void setPatientDetails(Doctor Visited) {
	        this.Visited = Visited;
	    }
	
	    

}
