package gittest1;

public class Tp {
	
	public static void main(String[] args) {
		
		String a = "malayalam";
		int len = a.length();
		String rev ="";
		for(int i=len-1;i>=0;i--) 
		{
		 rev= rev + a.charAt(i);
		}
		if(rev.equals(a)==true) 
		{
			System.out.println("String is palendrom");
		}
		else 
		{
			System.out.println("String is not a palendrom");
		}
	}

}
