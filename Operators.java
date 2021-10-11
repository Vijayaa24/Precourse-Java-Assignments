package PrecourseJavaProgramming;

public class Operators {
	public static void main (String args[]) {

		int num1 = 100;
		int num2 = 50;
		int num3 = 80;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);      //100
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);      //50
		}else {
			System.out.println(num3);     //80
		}

		int my_num = 10;
		System.out.println(my_num);    // 10
		my_num = my_num + 10;       // my_num += 10;
		System.out.println(my_num);    //20  


		int my_num2 = 100;
		System.out.println(my_num2); // 100
		my_num2 = my_num2 / 20;    // my_num2 /= 20;
		System.out.println(my_num2); //5


		int my_num3 = 60;
		System.out.println(my_num3); // 60
		my_num3 = my_num3 *20;  // my_num3 *= 20;
		System.out.println(my_num3); //1200

		int my_num4 = 50;
		System.out.println(my_num4); // 50
		my_num4 = my_num4 - 20;  //my_num4 -= 20;
		System.out.println(my_num4); //30

	}
}


