package homework7;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject c1= new Circle(5);
		GeometricObject c2= new Circle(7);
		
		System.out.println(GeometricObject.max(c1, c2));
		
		GeometricObject r1 = new Rectangle(2,4,"blue", true);
		GeometricObject r2 = new Rectangle(4,8,"orange", false);
		
		System.out.println(GeometricObject.max(r1, r2));

	}

}
