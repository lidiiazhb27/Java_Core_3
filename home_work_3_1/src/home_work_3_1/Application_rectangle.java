package home_work_3_1;

public class Application_rectangle {
	public static void main(String[] args) {
		
		Rectangle1 r1 = new Rectangle1();
		Rectangle1 r2 = new Rectangle1(2, 5);
		
		/*System.out.println(r1);
		System.out.println("-----");	
		System.out.println(r2);
		System.out.println("-----");*/	
		r1.S_Rectangle();
		r1.P_Rectangle1();
		System.out.println("-----");
		r2.S_Rectangle();
		r2.P_Rectangle1();
		
		}
}
