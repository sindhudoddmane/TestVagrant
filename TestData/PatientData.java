package TestData;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import Test.Doctor;
import Test.PatientList;
import Base.DoctorDetails;
import	Base.PatientDetails;

public class PatientData 
{
	 	public List<PatientList> createPatient()
	 	{
	 		List<PatientList> allPatients = new ArrayList<>();

	 		Doctor patient1 = new DoctorDetails().DoctorName("dr.hema").visitedDate(new GregorianCalendar(2021, Calendar.JANUARY, 11).getTime()).data();
	 		Doctor patient2 = new DoctorDetails().DoctorName("dr.sheshagiri").visitedDate(new GregorianCalendar(2021, Calendar.JANUARY, 13).getTime()).data();
	 		Doctor patient3 = new DoctorDetails().DoctorName("dr.leela").visitedDate(new GregorianCalendar(2021, Calendar.JANUARY, 15).getTime()).data();
	 		Doctor patient4 = new DoctorDetails().DoctorName("dr.pavithra").visitedDate(new GregorianCalendar(2021, Calendar.JANUARY, 14).getTime()).data();
	 			
	 		allPatients.add(new PatientDetails().patName("rushabh").patLocation("mysore").patientInfo(patient1).data());
	 		allPatients.add(new PatientDetails().patName("prabha").patLocation("Bengaluru").patientInfo(patient2).data());
	 		allPatients.add(new PatientDetails().patName("hithesh").patLocation("kodagu").patientInfo(patient3).data());
	 		allPatients.add(new PatientDetails().patName("lalitha").patLocation("Bengaluru").patientInfo(patient4).data());
	
	        return allPatients;
	        
	 	}

}

