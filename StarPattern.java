package projec2;

public class StarPattern {
	public static void main(String[] args) {
		int rows = 8;
		for(int i=1;i<=rows;i++) {
			int stars =0;
			if(i==1||i==2) {
				stars =4;
			}
			else if(i==3||i==5||i==7) {
				stars=2;
				
			}
			else if(i==4) {
				stars=3;
				
			}
			else {
				stars=1;
			}
			
			for(int j=1;j<=stars;j++) {
				System.out.print('*' + "");
				
			}
			System.out.println();
		}
	}
	

}
