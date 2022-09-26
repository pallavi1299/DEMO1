package day2;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		String name;
		char gender;
		int age;
		float salary;

		Scanner s=new Scanner(System.in);
		System.out.println("enter name age salary");
		name=s.nextLine();
		gender=s.next().charAt(2);
		age=s.nextInt();
		salary=s.nextFloat();
		s.close();

	}

}
