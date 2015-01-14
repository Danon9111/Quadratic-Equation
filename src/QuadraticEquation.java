import java.util.Scanner;


public class QuadraticEquation {

	public static void main(String[] args) {
		
		System.out.println("Please provide x1. ");
		Scanner firstRoot = new Scanner(System.in);
		double x1 = firstRoot.nextDouble();
		System.out.println("Please provide x2. ");
		Scanner secondRoot = new Scanner(System.in);
		double x2 = secondRoot.nextDouble();
		
		double a = 1;
		double b = - x1 - x2;
		double c = x1 * x2;
		double z = 2;
		double xs1, xs2, xp1, xp2;
		
//		school method
		if (x1 > x2) {
			xs1 = (- b + Math.sqrt(Math.pow(b, z) - (4 * a * c))) / (2 * a);
			xs2 = (- b - Math.sqrt(Math.pow(b, z) - (4 * a * c))) / (2 * a);
			System.out.println("\nSchool method - results:\n x1 is: " + xs1 + "\n x2 is: " + xs2);
		} else {
			xs1 = (- b - Math.sqrt(Math.pow(b, z) - (4 * a * c))) / (2 * a);
			xs2 = (- b + Math.sqrt(Math.pow(b, z) - (4 * a * c))) / (2 * a);
			System.out.println("\nSchool method - results:\n x1 is: " + xs1 + "\n x2 is: " + xs2);
		}

//		counting relative error

		double ae1 = x1 - xs1;
		double ae2 = x2 - xs2; //counting absolute error for school method
		
		if (ae1 < 0) {
			ae1 *= -1;
		} else if (ae2 < 0) {
			ae2 *= -1;
		}
		
		double re1 = (ae1 / x1) * 100;
		double re2 = (ae2 / x2) * 100;
		System.out.println("\nRelative error for x1 in school method is: " + re1 + "\nRelative error for x2 in school method is: " + re2);

//		better precision method
		if (x1 > x2) {
			xp1 = (- 2 * c) / (b + Math.sqrt(Math.pow(b, z) - (4 * a * c)));
			xp2 = (- 2 * c) / (b - Math.sqrt(Math.pow(b, z) - (4 * a * c)));
			System.out.println("\nBetter precision method method - results:\n x1 is: " + xp1 + "\n x2 is: " + xp2);
		} else {
			xp1 = (- 2 * c) / (b - Math.sqrt(Math.pow(b, z) - (4 * a * c)));
			xp2 = (- 2 * c) / (b + Math.sqrt(Math.pow(b, z) - (4 * a * c)));
			System.out.println("\nBetter precision method method - results:\n x1 is: " + xp1 + "\n x2 is: " + xp2);			
		}
		
//		counting relative error
		
		ae1 = x1 - xp1;
		ae2 = x2 - xp2; //counting absolute error for better precision method
		
		if (ae1 < 0) {
			ae1 *= -1;
		} else if (ae2 < 0) {
			ae2 *= -1;
		}
		
		re1 = (ae1 / x1) * 100;
		re2 = (ae2 / x2) * 100;
		System.out.println("\nRelative error for x1 in better precision method is: " + re1 + "\nRelative error for x2 in better precision method is: " + re2);
		
		
	}

}
