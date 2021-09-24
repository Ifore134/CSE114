package homework3;
import java.util.Scanner;
public class ArrayUtils {

	public static void main(String[] args) {
		int[] randarray = randomArray(100, 21);
		System.out.println(arraySum(randarray) + "  This is the sum of all the integers in the array");
		System.out.println (contains(randarray, 12));
		System.out.println(countMultiplesOf(randarray, 7));
		//print(randarray);

	}
	public static int[] randomArray(int a, int b) {
		//Scanner inputArr_size = new Scanner(System.in);
		//int ab = inputArr_size.nextInt();
		int[] ab = new int[a];
		
		//Scanner inputArr_range = new Scanner(System.in);
		//int ba = inputArr_range.nextInt();
		for(int i = 0; i < ab.length; i++){
			ab[i] =(int)(Math.random() * b);
			}
		return ab;
	}
	public static void print(int[] c) {
		for(int d = 0; d < c.length; d++){
			System.out.print(c[d] + " ");
			}
	}
	public static int arraySum(int[] arrayCalc) {
		int arrayVal = 0;
		for (int j = 0;j< arrayCalc.length; j++) {
			arrayVal += arrayCalc[j];
		}
		return arrayVal;
	}
	public static int contains(int[] arrayofInts, int theVal) {
		int nothingHere = 0;
		int searchInd = 0;
		for (int i2 = 0; i2 < arrayofInts.length; i2++) {
			int searchVal = arrayofInts[i2];
			if (searchVal == theVal) {
				searchInd = i2;
				nothingHere += 1;
				break;
			}
		}
		if (nothingHere == 0) {
			return  1;
		}
		else {
			return searchInd;
		}
	}
	public static int countMultiplesOf(int[] arrayUsed, int valToCount) {
		int theCount = 0;
		for ( int j2 = 0;j2 < arrayUsed.length; j2++) {
			if(arrayUsed[j2] == 0) {
				theCount+= 1;
			}
			else if ((valToCount %arrayUsed[j2])==0) {
				theCount+= 1;
			}
		}
	    /*for (int i3 = 0; i3 < arrayUsed.length; i3++) {
			if (arrayUsed[i3] == valToCount) {
				theCount++;
			}
		}*/
		return theCount;
	}

}
