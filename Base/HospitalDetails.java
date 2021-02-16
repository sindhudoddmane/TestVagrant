package Base;
import Test.HospitalList;

public class HospitalDetails 
{
	HospitalList hospital = new HospitalList();

	  public HospitalDetails Name(String name){
	        hospital.setName(name);
	        return this;
	    }


	    public HospitalDetails Location(String location){
	        hospital.setLocation(location);
	        return this;
	    }

	    public HospitalList data() {
	        return hospital;
	    }
}
