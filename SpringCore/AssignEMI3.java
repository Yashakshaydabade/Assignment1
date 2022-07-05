package Assignment3;

public class AssignEMI3 {

	int loanamt;
	int years;
	double rate;
	public int getLoanamt() {
		return loanamt;
	}
	public void setLoanamt(int loanamt) {
		this.loanamt = loanamt;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void emicalc()
	{
		double total=getLoanamt()*getRate()/100 * getYears();
		
		double totalamount=loanamt+total;
		double emi=totalamount/(getYears()*12);
		int totalemi=getYears()*12;
		System.out.println("Amount per EMI="+emi);
		System.out.println("Total no of Emi="+totalemi);
	}
}
