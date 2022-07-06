package Assignment8;

	import java.util.Comparator;
	import java.util.List;
	import java.util.Map;
	import java.util.Set;
	import java.util.stream.Collectors;

	//WAP inject list of item to bean and after this arrange all of the, item name in ascending and 
	//descending order. Also remove any duplicate name of item if present.

	public class Item 
	{
		List<String> itemlist;

		public Item(List<String> itemlist)
		{
			this.itemlist = itemlist;
		}
		
		void show()//assending order
		{
			System.out.println("Item list Sorted in ascending order:- ");
			List<String> sortedlist = itemlist.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist);
System.out.println();
		}
		void decendingOrder()//decending order
		{
			System.out.println("Item list Sorted in descending order:-");
			
		
			List<String> sortlist = itemlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			System.out.println(sortlist);
		}
		void removeduplicate()
		{
			System.out.println();
			System.out.println("Remove duplicates from list:-");
			Set<String> itemset = itemlist.stream().collect(Collectors.toSet());
			System.out.println(itemset);
		}
		
	}

