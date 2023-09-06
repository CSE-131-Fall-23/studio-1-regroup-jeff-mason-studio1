package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type in a year plz");
		int n1 = in.nextInt();// TODO Auto-generated method stub
		boolean h = (n1%4==0);
		boolean j = (n1%100!=0);
		boolean k = (n1%400==0);
		boolean l = (h&&j||k);
		System.out.println(n1+" is a leap year: "+l);

	}

}
