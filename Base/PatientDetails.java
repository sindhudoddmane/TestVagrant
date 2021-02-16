package Base;
import java.util.Date;

//inheritance 
import Test.PatientList;
import Test.Doctor;

public class PatientDetails 
{
	PatientList	patient=new PatientList();
	
	public PatientDetails patName(String name) 
	{
        patient.setName(name);
        return this;
    }
	
	  public PatientDetails patLocation(String location) 
	  {
	        patient.setLocation(location);
	        return this;
	    }
	  
	  public PatientDetails patientInfo(Doctor doc) {
	        patient.setPatientDetails(doc);
	        return this;
	    }
	  
	  public PatientList data() {
	        return patient;
	    }
	  
	
}


