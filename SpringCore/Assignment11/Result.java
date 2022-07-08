package springcore_assignment.Q11;

public class Result {

	 float maths;
     float hindi;
     float english;
     float science;
     public float totalMarks;
	public Result(float maths, float hindi, float english, float science) {
		super();
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.totalMarks = maths+hindi+english+science;
	}
     
}
