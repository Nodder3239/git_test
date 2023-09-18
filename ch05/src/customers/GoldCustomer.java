package customers;

//고객 - 골드 고객
public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer() {
		customerGrade = "Gold";
		saleRatio = 0.1;
		bonusRatio = 0.02;
	}
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "Gold";
		saleRatio = 0.1;
		bonusRatio = 0.02;
	}
	@Override
	public int calcPrice(int price) {
		price -= (int) price*saleRatio;	//구매 가격 = 가격 - (가격*할인율)
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	
	
	
}
