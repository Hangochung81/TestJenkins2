package test;

public class DemoClass2 {
	public static String getProjectPath() {
		String workingDir = System.getProperty("user.dir");
		return workingDir;
	}
}