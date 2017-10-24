
public class IfElseSwitch {
	
	public static void main(String[] args){
		compare3Numbers(1,2,3);
	}
	
	//Aufgabe 2a
	
	public static void compare3Numbers(int x, int y, int z){
		if(x<y&&y<z){
			System.out.println(z + " " + y + " " + x);
		}
		if(z<y&&y<x){
			System.out.println(x + " " + y + " " + z);
		}
		if(y<z&&z<x){
			System.out.println(x + " " + z + " " + y);
		}
		if(y<x&&x<z){
			System.out.println(z + " " + x + " " + x);
		}
		if(z<x&&x<y){
			System.out.println(y + " " + x + " " + z);
		}
		if(x<z&&z<y){
			System.out.println(y + " " + z + " " + x);
		}
	}
	
	public static boolean isLeapYear(int year) {
		if(year<2970&&year>1470) {
			if(year % 100 == 0 && year % 400 != 0) return false;
			if(year % 4 == 0) return true;
		}
		
		
		return false;
	}
}
