class ExampleStringObject {
	public static void main (String args []) {
		String str1 = "Avdhesh";
		String str2 = "Avdhesh";
		if(str1.equals(str2)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are not same");
		}
		
		if (str1 == str2) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are not same");
		}
		
		String s1 = new String("Avdhesh");
		String s2 = new String("Avdhesh");
		if(s1 == s2) {
			System.out.println("String reference are same");
		} else {
			System.out.println("String reference are different");
		}
		
		if(s1.equals(s2)) {
			System.out.println("String are same");
		} else {
			System.out.println("String are different");
		}
		String str = "How was your day today?";
		System.out.println(str.indexOf('a', 6));
		System.out.println(str.indexOf("was", 3));
	}
}