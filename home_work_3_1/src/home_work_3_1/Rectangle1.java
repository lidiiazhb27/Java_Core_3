package home_work_3_1;

public class Rectangle1 {
	private int width;
	private int height;
	
	Rectangle1 (){
		this.width = 3;
		this.height = 5;
	}
	Rectangle1 (int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*public String toString() {
		return "Прямокутник: \nШирина=" + width + "см,\nВисота=" + height + "см"; 
	}*/
	public void S_Rectangle() {
		int S = width * height;
		System.out.println("Площа прямокутника:" + S); 
	}
	public void P_Rectangle1() {
		int P = 2*(width + height);
		System.out.println("Периметр прямокутника:" + P); 
	}
}
