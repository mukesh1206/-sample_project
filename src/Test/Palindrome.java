package Test;

public class Palindrome {
	String str="pop";
	String rev="";
	void checkPlindrome() {
		for(int i=str.length()-1;i>0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("String is plindrome");
		}else
			System.out.println("not plindrome");
			
		
	}
	public static void main(String args[]) {
		Palindrome obj=new Palindrome();
		obj.checkPlindrome();
	}

}
