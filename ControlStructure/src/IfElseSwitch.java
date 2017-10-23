
public class IfElseSwitch {
	
	public static void main(String[] args){
		compare3Numbers(1,2,3);
	}
	
	public static void compare3Numbers(int x, int y, int z){
		if(x<y&&y<z){
			System.out.println(z + " " + y + " " + x);
		}
		if(z<y&&y<x){
			System.out.println(x + " " + y + " " + z);
		}
	}
}
