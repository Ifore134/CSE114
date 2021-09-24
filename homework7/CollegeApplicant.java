package homework7;

public abstract class CollegeApplicant {
	private String name;
	private String college;
	protected CollegeApplicant() {
		
	}
	
	public CollegeApplicant(String name, String college) {
		this.college = college;
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCollege() {
		return this.college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}

}

class UndergradApp extends CollegeApplicant{
	private String SAT;
	private String GPA;
	public UndergradApp(String name, String college,String SAT, String GPA) {
		super(name, college);
		this.SAT = SAT;
		this.GPA = GPA;	
	}
	
	public String getSAT() {
		return this.SAT;
	}
	public void setSAT(String SAT) {
		this.SAT = SAT;
	}
	
	public String getGPA() {
		return this.GPA;
	}
	
}


class GraduateApp extends CollegeApplicant{
	private String collegeOrigin,college,name;
	public GraduateApp(String name, String college,String collegeOrigin) {
		//super(name,college);
		this.college = college;
		this.name = name;
		this.collegeOrigin = collegeOrigin;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCollege() {
		return this.college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getCollegeOrigin() {
		return this.collegeOrigin;
	}
	public void setCollegeOrigin(String collegeOrigin) {
		this.collegeOrigin = collegeOrigin;
	}
	
	public String determineOrigin() {
		if(this.collegeOrigin.equals(this.college)) {
			return "from inside";
		} else {
			return "from outside";
		}
	}
	
	
}
