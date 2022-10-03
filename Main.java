import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	static DecimalFormat df=new DecimalFormat("0.00");
	private static String doubleToString(double value)
	{
		String ans=String.valueOf(value);
		return ans;
		
	}
	public static String salesTaxCalculation(double billAmount) {
		  double taxAmount = 0.0;
	        if (billAmount <= 1000) {
	            taxAmount = billAmount * 0.125;
	        } else if (billAmount > 1000 && billAmount <= 2500) {
	            taxAmount = billAmount * 0.10;
	        } else {
	            taxAmount = billAmount * 0.075;
	        }
	        String tax = doubleToString(taxAmount);
	        return tax;
	}

	public static void main(String[] args) throws IOException {
		List<OrderedItem>list=new ArrayList<>();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String name=s.next();
		System.out.println("Enter number of items the customer purchases:");
		int n=s.nextInt();
		ItemData t=new ItemData();
		t.getAllItems();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter name and quantity (comma separate format) of purchased item no:"+i);
			String w=s.next();
			String h[]=w.split(",");
			String itemName=h[0];
			 boolean x=ItemData.isAvailable(itemName);
			 if(x==false)
			 {
				 System.out.println("Sorry!!! This item is not available for today");
				 continue;
			 }
			String qty=h[1];
			SnackItem gh=ItemData.getItem(h[0]);
			String discAmount="";
			Double price=Double.parseDouble(gh.getRate())*Double.parseDouble(qty);
			if(gh.getDiscountRate().equals("0")||Double.parseDouble(h[1])<Double.parseDouble(gh.getDiscountqty()))
				{
					discAmount=doubleToString(0);	
				}
			 else if(Double.parseDouble(h[1])>=Double.parseDouble(gh.getDiscountqty()))
			    {
				Double discRate=Double.parseDouble(gh.getDiscountRate());
				Double discA1=price/discRate;
				discAmount=doubleToString(discA1);	
			    }
			Double amount=price-Double.parseDouble(discAmount);
			OrderedItem f=new OrderedItem(gh.getItemName(),gh.getRate(),h[1],discAmount,doubleToString(amount));
			f.setPrice(doubleToString(price));
			list.add(f);
		}
	
	double billAmount=0.0;
	for(OrderedItem d:list)
	{
		billAmount=billAmount+Double.parseDouble(d.getPayAmount());
	}
	String ans=String.format("%10s %10s %10s  %10s  %10s  %10s", "ItemName", "Rate", "OrderQty","Price","Discount","Amount");
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
    String formatDateTime = dateTime.format(format);     
	System.out.println("Customer Name:"+name+"                                         "+"Date:"+formatDateTime);
	System.out.println(ans);
    list.forEach(d->System.out.println(d));
    System.out.println("                                                               "+"Bill Amount:"+df.format(billAmount));
    double t1=Double.parseDouble( salesTaxCalculation(billAmount));
    System.out.println("                                                               "+"Add: Sales Tax:"+df.format(t1));
    double tu=t1+billAmount;
    System.out.println("                                                               "+"Final Amount:"+df.format(tu));

}
}
