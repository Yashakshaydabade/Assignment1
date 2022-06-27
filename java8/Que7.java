package Assignments;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//WAP to print only those price which are even from the given item list

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> even=Arrays.asList(123,654,659,323,678,543,223,864,265);
		List<Integer> Evenp=even.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(Evenp);
	}

}
