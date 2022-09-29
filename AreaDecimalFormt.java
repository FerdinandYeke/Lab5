import java.text.DecimalFormat;
import java.util.Scanner;


public class AreaDecimalFormt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat Dformat = new DecimalFormat("0.##");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Length of Side A: ");
		int SideA = scan.nextInt();
		
		System.out.println("Enter Length of Side B: ");
		int SideB = scan.nextInt();
		
		System.out.println("Enter Length of Side C: ");
		int SideC = scan.nextInt();
		
		int S = SideA + SideB + SideC / 2;
		
		int area1 = S-SideA;
		int area2 = S-SideB;
		int area3 = S-SideC;
		int area4 = SideA*SideB*SideC;
		int area5 = S * area4;
		
		double areaF = Math.sqrt(area5);
		
		System.out.println("The Area of the triangle is "+Dformat.format(areaF));
		
				
		
		
	}

}
