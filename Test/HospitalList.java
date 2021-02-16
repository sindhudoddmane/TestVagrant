package Test;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import TestData.PatientData;

public class HospitalList {
	//Encapsulation
	    private String hospitalname;
	    private String hospitallocation;

	    public String getName() {
	        return hospitalname;
	    }

	    public void setName(String hospitalname) {
	    	//this keyword
	        this.hospitalname = hospitalname;
	    }

	    public String getLocation() {
	        return hospitallocation;
	    }

	    public void setLocation(String hospitallocation) {
	        this.hospitallocation = hospitallocation;
	    }

	    public List<PatientList> patientInRange(Date fromDate, Date toDate) 
	    {
	        List<PatientList> allPatients = allPatients();

	        return allPatients.stream().filter(patient -> patient.getPatientDetails().getVisitDate().after(fromDate)&&
	                patient.getPatientDetails().getVisitDate().before(toDate)).collect(Collectors.toList());
	    }

	    private List<PatientList> allPatients() {
	        return new PatientData().createPatient();
	    }
}
