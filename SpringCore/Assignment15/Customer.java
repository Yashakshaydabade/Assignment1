package Assignment15;

public class Customer 
{
	String custname;//custname
	Item item;

	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void show()
	{
		
		System.out.println("category="+item.getCat());
		//System.out.println("category="+item.cat);
		System.out.println("Item id="+item.getItemid());
		System.out.println("Item name="+item.getItemname());
		System.out.println("Item price="+item.getItemprice());
		System.out.println("Customer name="+getCustname());
	}
}
