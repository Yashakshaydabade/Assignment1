package Assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//WAP to create list of item price whose price is less than avg price of all item.

public class Que6 
{
	int iid;
	String iname;
	double iprice;
	
	public Que6(int iid, String iname, double iprice) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iprice = iprice;
	}

	public static void main(String[] args) 
	{
		List<Que6> list=new ArrayList<Que6>();
		list.add(new Que6(1,"Ac",10));
		list.add(new Que6(2,"refrigerator",11000));
		list.add(new Que6(3,"Iron",100));
		list.add(new Que6(4,"Bulb",15));
		list.add(new Que6(5,"Lamp",25));
		list.add(new Que6(6,"Tv",10000));
		
		double avgprice=list.stream().collect(Collectors.averagingDouble(s1->s1.iprice));
		List<Double> List=list.stream().filter(p -> p.iprice>=avgprice).map(p -> p.iprice).collect(Collectors.toList());
		System.out.println(list);
	}
}
