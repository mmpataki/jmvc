import java.util.*;

public class mvc {
	public static void main(String[] args) {
		Model m=new Model();
		//create 5 views.
		String prefixes[] = {">>>", "***", "@@@", "^^^", "???"};
		for(int i=0; i<5; i++) {
			Controller c = new Controller(m);
			View v= new View(c, prefixes[i]);
		}
		System.out.println("There are " + m.viewCount() + " views.");
		while(true) {
			System.out.println("Add student : ");
			Scanner sc = new Scanner(System.in);
			String name=sc.next();
			Student s=new Student(name);
			m.push(s);
		}
	}
}