
public class uppgift2 {
	
	public static void main(String[] args) {
		System.out.println(rev("sorlos"));
	}

	public static String rev (String str) {
		if (str.length() == 1) {
			return str;
		}
		else {
			return rev(str.substring(1)) + str.charAt(0) ;
		}
	}
	//Förklaring
	//rev(Hello) = rev(ello) + H
	//rev(ello) = rev(llo) + e
	//rev(llo) = rev(lo) + l
	//rev(lo) = rev(o) + l
	//rev(o) = o
}



	