import java.util.*;

public class Model {
	ArrayList<Student> data;
	ArrayList<Controller> clist;
	Model() {
		data = new ArrayList<>();
		clist= new ArrayList<>();
	}
	public void register(Controller c) {
		clist.add(c);
	}
	public int viewCount() {
		return clist.size();
	}
	public void push(Student s) {
		data.add(s);
		for(int i=0; i<clist.size(); i++) {
			clist.get(i).xnotify();
		}
	}
	public ArrayList<Student> getData() {
		return data;
	}
}
