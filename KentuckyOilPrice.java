import java.text.NumberFormat;

public class KentuckyOilPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberFormat format1 = NumberFormat.getCurrencyInstance();
		NumberFormat format2 = NumberFormat.getPercentInstance();
		
		double oilprice = 2.99;
		
		double priceincrse = 0.10;
		
		System.out.println("The Oil price of Kentucky is: "+format1.format(oilprice));
		System.out.println("The Oil price increased by "+format2.format(priceincrse)+""
					+" than last year");
		

	}

}
