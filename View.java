import java.util.*;

public class View {
	Controller c;
	String prefix;
	public View(Controller c, String prefix) {
		this.c = c;	
		this.prefix = prefix;
		c.register(this);
	}
	public void display() {
		ArrayList<Student> data = c.getData();
		for(int i=0; i<data.size(); i++) {
			data.get(i).printDetail(prefix);
		}
	}
	public void xnotify() {
		display();
	}
}