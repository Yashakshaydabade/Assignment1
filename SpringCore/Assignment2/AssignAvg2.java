package Assignment2;

public class AssignAvg2 {

	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;
	int sub6;
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getSub4() {
		return sub4;
	}
	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}
	public int getSub5() {
		return sub5;
	}
	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}
	public int getSub6() {
		return sub6;
	}
	public void setSub6(int sub6) {
		this.sub6 = sub6;
	}
	
	public void avrage()
	{
		int avg=(sub1+sub2+sub3+sub4+sub5+sub6)/6;
		System.out.println("Average of number="+avg);
	}
}
