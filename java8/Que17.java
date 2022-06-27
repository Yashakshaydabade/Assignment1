package Assignments;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//User will enter employee detail like emp name, date of birth , date of joining, date of resign,
//work location, department, salary. Now we will check following details.
//a. Employee in a particular department.
//b. Average salary of each department.
//c. Highest and lowest salary of each department.
//d. Department with highest no of employee and lowest no of employee.
//e. Total number of years of experience of each employee.
//f. Upcoming birthday and job anniversary in current month from current date to last
//date of month. 


public class Que17 {

	String empname;
	String wl;
	LocalDate doj;
	LocalDate dob;
	LocalDate dor;
	String dept;
	int sal;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getWl() {
		return wl;
	}
	public void setWl(String wl) {
		this.wl = wl;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Que17(String empname, String wl, LocalDate doj, LocalDate dob, LocalDate dor, String dept, int sal) {
		super();
		this.empname = empname;
		this.wl = wl;
		this.doj = doj;
		this.dob = dob;
		this.dor = dor;
		this.dept = dept;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Que17 [empname=" + empname+",worklocation="+wl+",doj="+doj+",dob="+dob+",dor="+dor+",dept="+dept+",sal="+"]";
	}
	public static void main(String[] args) 
	{
		List<Que17> l=new ArrayList<>();
		l.add(new Que17("Akshay","Pune",LocalDate.of(2022, 02, 02),LocalDate.of(2022, 03, 04),LocalDate.of(2025, 05, 01),"Hindi",25000));
		l.add(new Que17("Akash","Indore",LocalDate.of(2022, 03, 03),LocalDate.of(2022, 04, 05),LocalDate.of(2027, 01, 02),"Marathi",50000));
		l.add(new Que17("Shubham","Delhi",LocalDate.of(2022, 01, 02),LocalDate.of(2022, 02, 03),LocalDate.of(2030, 05, 06),"Hindi",5000));
		l.add(new Que17("Anil","Mumbai",LocalDate.of(2022, 04, 02),LocalDate.of(2022, 03, 05),LocalDate.of(2026, 06, 01),"Hindi",33000));
		l.add(new Que17("Sunil","Goa",LocalDate.of(2022, 06, 01),LocalDate.of(2022, 04, 02),LocalDate.of(2024, 07, 03),"Marathi",22000));
		l.add(new Que17("Nikhil","Kochi",LocalDate.of(2022, 07, 05),LocalDate.of(2022, 01, 07),LocalDate.of(2029, 07, 07),"Hindi",20000));
	
		System.out.println(l);
		
		//Avg sal
		
		double totalavgBydept1=l.stream().filter(Dept->"Hindi"== Dept.getDept()).collect(Collectors.averagingDouble(Que17::getSal));
	double totalavgBydept2=l.stream().filter(Dept->"Marathi"== Dept.getDept()).collect(Collectors.averagingDouble(Que17::getSal));
		
		System.out.println("Total Emp sal of Hindi dept="+totalavgBydept1);
		System.out.println("Total Emp sal of Marathi dept="+totalavgBydept2);
		
		//----------Highest & Lowest Sal----------//
		int maxSalary=l.stream().filter(deptm->"Hindi"==deptm.getDept())
				.map(Que17::getSal)
				.max(Integer::compare).get();
		System.out.println("max sal by dept="+maxSalary);
		
		String department1=l.stream().map(Que17::getDept).max(String::compareTo).get();
		String department2=l.stream().map(Que17::getDept).max(String::compareTo).get();
		
		System.out.println("dept highest no employee="+department1);
		System.out.println("dept highest no employee="+department2);
		
		//Total no of years Experience of each Emp
		for(Que17 emp:l)
		{
			if(emp.dor!=null)
			{
				int expiry=Period.between(emp.doj, emp.dor).getYears();
				System.out.println(emp.empname+" has experience="+expiry+" years");
			}
		}
		
	}
}


