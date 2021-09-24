package homework7;

public class HexFormatException extends java.lang.NumberFormatException {

	public HexFormatException(){
		
	}
	public HexFormatException(String err) {
		System.out.println(err);
	}
	
	
}
class HexToDec {
	public static int parseHex(String conv) throws HexFormatException{
		int hold =0;
		for(int i=0;i<conv.length();i++) {
			if(conv.charAt(i)=='A') {
				if(hold==0) {
					hold=10;
				}
				else
				hold=hold* 16+ 10;
			}
			else if (conv.charAt(i)=='B') {
				if(hold==0) {
					hold=11;
				}
				else
				hold=hold*16+ 11;
			}
			else if (conv.charAt(i)=='C') {
				if(hold==0) {
					hold=12;
				}
				else
				hold=hold*16+ 12;
			}
			else if (conv.charAt(i)=='D') {
				if(hold==0) {
					hold=13;
				}
				else
				hold=hold*16+ 13;
			}
			else if (conv.charAt(i)=='E') {
				if(hold==0) {
					hold=14;
				}
				else
				hold=hold*16+ 14;
			}
			else if (conv.charAt(i)=='F') {
				if(hold==0) {
					hold=15;
				}
				else
				hold=hold*16+ 15;
			}
			else if (conv.charAt(i)=='G') {
				if(hold==0) {
					hold=16;
				}
				else
				hold=hold*16+ 16;
			}
			else if((conv.charAt(i)-'0'>=0) & (((int)conv.charAt(i)-'0') <=9)) {
				if(hold==0) {
					hold=conv.charAt(i)-'0';
				}
				else
				hold=hold*16+ (conv.charAt(i)-'0');
			}
			else {
				throw new HexFormatException("not found");
			}
			
			
		}
		return hold;
	}
}