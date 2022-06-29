package Excep;
import java.util.Scanner;
//import Excep.InvalidAgeException;
//import Excep.VotingApp;

public class Test {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println("Please enter the ag: ");
		
		VotingApp vp=new VotingApp();
		try{
		vp.ageValidation();
		}catch(InvalidAgeException e){
			System.out.println("Age is not valid for voting.");
		}

	}

}
