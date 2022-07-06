package Assignment1;

public class item {

	private void item()
	{
		System.out.println("Constructor of item is called");
	}
	public static item getObjA()
	{
		return new item();
	}
	public void show()
	{
		System.out.println("This is show method");
	}
}
