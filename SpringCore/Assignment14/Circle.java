package Assignment14;

public class Circle implements Shape
{
	double r;


	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double Area() {
		
		return (3.14*r*r);
	}

	@Override
	public double Sides() {
		
		return (2*3.14*r);
	}
	
	
}

