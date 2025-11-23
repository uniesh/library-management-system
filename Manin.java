package lib;

import java.util.*;
import java.sql.*;

public class main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);


		System.out.println("\t\t \t\t\tWELCOME TO STUDET'S LIBRARY ");
		System.out.println();

		while (true) {
			System.out.println("1)Register\n2)Login\n3)Exit");
			System.out.println();
			System.out.println("Enter your choice:");

			int reg=sc.nextInt();
			if(reg==1) {
				regs obj=new regs();
				obj.regs();
			}
			else if(reg==2) {
				login obj=new login();
				obj.login();

			}
			else if(reg==3) {
				break;
			}
			else {
				System.out.println("Please ckeck the number");
				System.out.println();
			}

		}
	}
}


