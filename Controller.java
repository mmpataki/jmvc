import java.util.*;

public class Controller {
	public View v;
	public Model m;
	public Controller(Model m) {
		this.m=m;
	}
	public void register(View v) {
		this.v=v;
		m.register(this);
	}
	public ArrayList<Student> getData() {
		return m.getData();
	}
	public void xnotify() {
		v.xnotify();
	}
}