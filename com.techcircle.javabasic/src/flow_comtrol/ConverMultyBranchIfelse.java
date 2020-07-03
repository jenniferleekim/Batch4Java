package flow_comtrol;

public class ConverMultyBranchIfelse {

	public static void main(String[] args) {
//		double balance = 5000.2512;
//		String accountType = "Saving";
//		
//		if (balance > 1000 && accountType == "Saving") {
//			balance = balance + (balance * 002)/12 ;
//		}
//		
//		System.out.println("Your saving account balance is $"+balance );

		double cartTotal = 179.98;
		String memberType = "Guest";
		double shippingCost = 6.98;
		
		if(cartTotal > 100 || memberType == "Premium"){
			System.out.println("You are qualify for free shipping");
			shippingCost = 0;
		}else {
			cartTotal = cartTotal + shippingCost;
		}
		
		System.out.println("Your shipping cost = "+ shippingCost);
		System.out.println("Your total = "+ cartTotal);
		
		
		
		
	}

}
