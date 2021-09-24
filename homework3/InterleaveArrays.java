package homework3;

public class InterleaveArrays {

	public static void main(String[] args) {
		print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}));
		//print(interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}));
		//print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10}));

	}
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int newArrayLength = array1.length + array2.length;
		int[] interArray = new int[newArrayLength];
		for (int i = 0; i < newArrayLength/2; i++) {
			if (i==0) {
			
				int[] arrayhold = {array1[i], array2[i]};
				interArray[i] = array1[i];
				//interArray[i+1] = array2[i];
				//interArray +=
			}
			else if (i >1) {
				interArray[i] = array2[i];
				interArray[i+1]= array1[i];
				
			}
			else {
				//interArray[i] = array1[i];
				//interArray[i*2] = array1[i];
				//interArray[i+2] = array2[i];
			}
			
		}
		return interArray;
	}
	public static void print(int[] c) {
		for(int d = 0; d < c.length; d++){
			System.out.print(c[d] + " ");
			}
	}

}
