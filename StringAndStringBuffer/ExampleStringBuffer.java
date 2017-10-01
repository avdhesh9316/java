class ExampleStringBuffer {
	public static void main (String args []) {
		StringBuffer sb = new StringBuffer();
		String firstname = "Avdhesh";
		String middlename = " Kumar";
		String lastname = " Sharma";
		sb.append(firstname);
		sb.insert(firstname.length(), middlename+lastname);
		System.out.println("The Full name is : " + sb);
		System.out.println("The Full reverse name is : " + sb.reverse());
		sb = sb.reverse();
		sb.replace(0, firstname.length(), "Ramesh");
		System.out.println("The New Name is : " + sb);
		sb.delete("Ramesh".length() + 1, "Ramesh".length() + 1 + middlename.length());
		System.out.println("Oops!!!Ramesh does not have middle name and his modified name is : " + sb);
		System.out.println("The capacity of StringBuffer is : " + sb.capacity());
		sb.deleteCharAt(0);
		System.out.println("New Name : " + sb);
	}
}