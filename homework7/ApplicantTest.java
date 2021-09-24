package homework7;

public class ApplicantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollegeApplicant c1 = new UndergradApp("Ian", "Stony Brook","1320" ,"3.90" );
		GraduateApp c2 = new GraduateApp("Ian","Stony Brook", "Stony Brook");
		
		System.out.println(c2.determineOrigin());
		System.out.println(c1.getCollege());
		System.out.println(c2.getCollege());

	}

}
