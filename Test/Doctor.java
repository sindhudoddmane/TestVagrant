package Test;

import java.util.Date;

public class Doctor 
{
	private Date appointDate;
    private String DoctorName;

    public Date getVisitDate() {
        return appointDate;
    }

    public void setVisitDate(Date appointDate) {
        this.appointDate = appointDate;
    }

    public String getVisitingDoctorName() {
        return DoctorName;
    }

    public void setVisitingDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }
}
