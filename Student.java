public class Student {
	String name;
	Student(String n) {
		name=n;
	}
	public void printDetail(String prefix) {
		System.out.println(prefix + " " + name);
	}
}
