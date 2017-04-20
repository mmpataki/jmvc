import java.util.*;

public class Controller {
	public View v;
	public Model m;
	public Controller(Model m) {
		this.m=m;
		m.register(this);
	}
	public void register(View v) {
		this.v=v;
	}
	public ArrayList<Student> getData() {
		return m.getData();
	}
	public void xnotify() {
		v.xnotify();
	}
}
