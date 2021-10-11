package PrecourseJavaProgramming;

public class Typecasting {
public static void main(String[] args) {
		
		short old_age = 23;
		int new_age = old_age;
		
		System.out.println(old_age);
		System.out.println(new_age);
		
		int  salary = 40000;
		float new_salary = salary;
		
		System.out.println(salary);
		System.out.println(new_salary);
		
		
		int cash = 40000;
		short new_cash = (short) cash;
		
		System.out.println(cash);
		System.out.println(new_cash);
		
		float num = 99.99f;
		int new_num = (int) num;
		
		System.out.println(num);
		System.out.println(new_num);
		

	}

}
