
public class OrderedItem {
	public OrderedItem() {
		super();
		
	}
	private String itemName;
	private String rate;
	private String orderQty;
	private String price;
	@Override
	
	public String toString() {
		String ans=new String();
			
			ans=String.format("%10s %10s %10s  %10s  %10s  %10s", itemName, rate, orderQty,price,discountAmount,payAmount);
		return ans;
	}
	public OrderedItem(String itemName, String rate, String orderQty, String discountAmount, String payAmount) {
		super();
		this.itemName = itemName;
		this.rate = rate;
		this.orderQty = orderQty;
		this.discountAmount = discountAmount;
		this.payAmount = payAmount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	private String discountAmount;
	private String payAmount;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	

	
	
}
