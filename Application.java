import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter a base");
		
		int base = sc.nextInt();
		
		System.out.println("Please enter a power");
		
		int power = sc.nextInt();
		
		int result = 1;
		
		
		
		for(int i = power; i > 0; i--) {
			result = result * base;
		}
		  System.out.println(result); 
	}
}