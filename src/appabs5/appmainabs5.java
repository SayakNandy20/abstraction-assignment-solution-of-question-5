package appabs5;

import java.util.Scanner;

import parentchildabs5.magazine;

public class appmainabs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ISBN Number");
		int ISBN=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Book name");
		String bookname=sc.nextLine();
		System.out.println("Enter the price");
		int price=sc.nextInt();
		sc.nextLine();
		System.out.println("Enterf the magazine type");
		String magazinetype=sc.nextLine();
		magazine Magazine=new magazine(ISBN,bookname,price,magazinetype);
		System.out.println("ISBN Number-"+Magazine.getISBNNumber());
		System.out.println("Discount Amount-"+Magazine.calculateDiscount());
		
		

	}

}
