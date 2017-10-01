class GetPropertyDemo{
	public static void main(String [] args){
		String user_home=System.getProperty("user.home");
		String java_version=System.getProperty("java.version");
		String java_home=System.getProperty("java.home");
		String class_path=System.getProperty("java.class.path");
		String os_name=System.getProperty("os.name");
		String user_name=System.getProperty("user.name");
		String user_dir=System.getProperty("user.dir");
		System.out.println("The user home directory is : "+user_home);
		System.out.println("The java version is : "+java_version);
		System.out.println("The Java Home directory is : "+java_home);
		System.out.println("The class path is set to : "+class_path);
		System.out.println("The Operating System is : "+os_name);
		System.out.println("The user name is : "+user_name);
		System.out.println("The working directory is : "+user_dir);
	}
}