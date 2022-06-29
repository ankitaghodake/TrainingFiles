package test;

import java.util.Scanner;


public class Execute {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println("Please enter the age: ");
		
		VotingApp vp=new VotingApp();
		try{
		vp.ageValidation();
		}catch(InvalidAgeException e){
			System.out.println("Age is not valid for voting.");
		}

	}

}
