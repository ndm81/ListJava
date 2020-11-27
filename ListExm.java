import java.awt.*;
class ListExm{
	ListExm(){
		Frame f=new Frame();
		List l=new List(5);
		l.setBounds(80,100,100,80);
		l.add("history");
		l.add("Geography");
		l.add("Civics");
		l.add("Political");
		l.add("Social Study");
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
	

	}
	public static void main(String[] args) {
		new ListExm();
}}