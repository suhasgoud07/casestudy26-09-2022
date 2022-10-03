
public class SnackItem {
	private String itemName;
	private String rate;
	private String status; 
	private String discountqty;
	private String discountRate;

	public SnackItem(String itemName, String rate, String status, String discountRate,String discountqty) {
		super();
		this.itemName = itemName;
		this.rate = rate;
		this.status = status;
		this.discountqty = discountqty;
		this.discountRate = discountRate;
	}
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDiscountqty() {
		return discountqty;
	}
	public void setDiscountqty(String discountqty) {
		this.discountqty = discountqty;
	}
	public String getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}
	
	public SnackItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
