package assignment;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sr ="hrushikeshjadhav";
		 for(int i =0; i<sr.length();i++) {
			 
			 char ch = sr.charAt(i);
			 int idx = sr.indexOf(ch,i+1);
			 
			 if (idx==-1) {
				 
				 System.out.print(ch);
				 
				 
			 }
		 }

	}

}
