package Assignments;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//User will enter item name, price, date of manufacturing, date of expiring, category name.
//Now user will enter the name of the category and you need to print the item detail on the
//basis of the category name. User can enter starting letter of the item and you need to print
//the detail of items. User can also enter either date of manufacturing and date of expiring
//you need to find the item details on the basis of the date entered. User may ask to print the
//item on the basis of the price range. 


public class Que16 
{
	String iname;
	String category;
	double price;
	LocalDate dom;
	LocalDate eom;
	public Que16(String iname, String category, double price, LocalDate dom, LocalDate eom) {
		super();
		this.iname = iname;
		this.category = category;
		this.price = price;
		this.dom = dom;
		this.eom = eom;
	}
	public static void main(String[] args) 
	{
		List<Que16> ilist=new ArrayList<>();
		ilist.add(new Que16("Tv", "Electronics", 30000, LocalDate.of(2022, 02, 03), null));
		ilist.add(new Que16("Jenas", "Clothes", 1000, LocalDate.of(2022, 03, 15), null));
		ilist.add(new Que16("Pepsi", "SoftDrink", 100, LocalDate.of(2022, 04, 15), LocalDate.of(2022, 01, 03)));
		ilist.add(new Que16("Bed", "Furniture", 1000, LocalDate.of(2022, 03, 15), LocalDate.of(2022, 06, 17)));
		///////--------------////////////
		
		Scanner sc=new Scanner(System.in);
		LocalDate monthdate=LocalDate.parse(sc.nextLine());
		System.out.println(monthdate);
		String DATE_FORMAT="yyyy,mm,dd";
		DateTimeFormatter fmatter=DateTimeFormatter.ofPattern(DATE_FORMAT);
		String l=sc.nextLine();
		LocalDate monthdate2=LocalDate.parse(l,fmatter);
		List<Que16> names=ilist.stream().filter(e->e.dom.compareTo(monthdate)==0).collect(Collectors.toList());
		for(Que16 l1:names)
		{
			System.out.println("Item name="+l1.iname+"price="+l1.price+"date of Manufacture="+l1.dom+"date of Expiry="+l1.eom);
		}
		
		
		
		//---------------------------////////////////////
		System.out.println("Enter Category");
		String c=sc.next();
		List<Que16> l2=ilist.stream().filter(e->e.category.equals(c)).collect(Collectors.toList());
		for(Que16 l1:ilist)
		{
			System.out.println("Item Name= "+l1.iname+"price="+l1.price+"Date of Manufacturing"+l1.dom+"date of exp"+l1.dom);
		}
		////////------------////////
		System.out.println("Enter 1st letter");
		String start=sc.next();
		List<Que16> itemname=ilist.stream().filter(e->e.iname.startsWith(start.toLowerCase())).collect(Collectors.toList());
		for(Que16 s:itemname)
		{
			System.out.println("Strat letter="+"item Name="+s.iname+"category"+s.category+"price "+s.price+"date of manufacturing"+s.dom+"date of eom"+s.eom);
		}
		
		//------------------//
		
		System.out.println("Enter price to check the item under price");
		double sprice=sc.nextDouble();
		double eprice=sc.nextDouble();
		List<Que16> plist=ilist.stream().filter(e->e.price>=sprice && e.price<=eprice).collect(Collectors.toList());
		for(Que16 i:plist)
		{
			System.out.println("item name="+i.iname+"price="+i.price+"date Of Manufacture="+i.dom+"date of Expiry="+i.eom);
		}
		
	}
	
	
}
