package Test;

import java.util.Date;
import java.util.List;

import Base.HospitalDetails;
import Base.dateandtime;

public class WithTestNG 
{

	@test
	public void hospitalTC()
	{
		Date fromDate = dateandtime.getFromTime(2021, 01);
		Date toDate = dateandtime.getToTime(2021, 01);
		
			HospitalList hospital = new HospitalDetails().Name("chinmay").Location("Bengaluru").data();
			
			List<PatientList> patients = new HospitalList().patientInRange(fromDate, toDate);
			
			long citypayients = patients.stream().filter(p->p.getLocation().equalsIgnoreCase(hospital.getLocation())).count();
		    long ruralPatient = patients.size() - citypayients;		    
			
        
        
	}


}
