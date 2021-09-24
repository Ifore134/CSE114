package homework7;

public class TestHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(HexToDec.parseHex("A5"));
		}catch(HexFormatException ex) {
			System.out.println("Invalid input");
		}

	}

}
