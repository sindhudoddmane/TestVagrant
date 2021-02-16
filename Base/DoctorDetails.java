package Base;
import java.util.Date;

import Test.Doctor;

public class DoctorDetails
{
	Doctor doc = new Doctor();
	
	public DoctorDetails visitedDate(Date date) {
        doc.setVisitDate(date);
        return this;
    }

    public DoctorDetails DoctorName(String name) {
        doc.setVisitingDoctorName(name);
        return this;
    }

    public Doctor data() {
        return doc;
    }

}
