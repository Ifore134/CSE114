package homework7;

public class CloneableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject r1 = new Rectangle(2,4, "yellow",true);
		GeometricObject r2 = (GeometricObject)r1.clone();
		System.out.print(r2.getArea());

	}

}
