package Assignment4;

public class Department {

	int did;
	String dname;
	
	public Department() {
		
	}
	public Department(int did, String dname) {
	
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
//	public void show()
//	{
//		System.out.println("Id is="+getDid());
//		System.out.println("Department name is="+dname);
//		System.out.println();
//	}
}
