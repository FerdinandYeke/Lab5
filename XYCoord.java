import java.text.DecimalFormat;
import java.util.Scanner;

public class XYCoord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat Dformat = new DecimalFormat("0.##");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First X coord: ");
		double X1 = scan.nextDouble();
		
		System.out.println("Enter the First Y coord: ");
		double Y1 = scan.nextDouble();
		
		System.out.println("Enter the Second X coord: ");
		double X2 = scan.nextDouble();
		
		System.out.println("Enter the Second Y coord: ");
		double Y2 = scan.nextDouble();
		
		double dist1 = Math.pow((X2-X1),2);
		double dist2 = Math.pow((Y2-Y1),2);
		double dist = Math.sqrt(dist1 + dist2);
		
		
		
		System.out.println("The Distance between points "+X1+" , "+Y1+
				" and "+X2+" , "+Y2+" is: "+Dformat.format(dist));
		
		
		

	}

}
