import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ItemData {

	static Map<String,SnackItem> itemMap=new LinkedHashMap<>();
	public static  Map<String,SnackItem> getAllItems() throws IOException
	{
	FileReader a=new FileReader("C:\\Users\\suhas.s\\Downloads\\SnackItem.txt");
	BufferedReader br=new BufferedReader(a);
	
	String line;
	  while((line=br.readLine())!= null) {
		 
	        String z[]=line.split("-");
	        String itemName=z[0];
	        String rate=z[1];
	        String status =z[2];
	        String discountQty=z[4]; 
	        String discountRate=z[3];
	        SnackItem b=new SnackItem(itemName,rate,status,discountRate,discountQty);
	        	itemMap.put(itemName,b);
	           
	        
	    }
	  return itemMap;
	}
	public static SnackItem getItem(String itemName)
	{    SnackItem g1=itemMap.get(itemName);

		SnackItem g=new SnackItem(g1.getItemName(),g1.getRate(),g1.getStatus(),g1.getDiscountRate(),g1.getDiscountqty());
		return g;
	}
	public static boolean isAvailable(String itemName)
	{
		if(!itemMap.containsKey(itemName))
		{
			return false;
		}
		  SnackItem g1=itemMap.get(itemName);
		  if(g1.getStatus().equals("A"))
		  {
			  return true;
		  }
		  return false;
	}

}

