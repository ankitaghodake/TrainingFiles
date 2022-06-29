package test;


public class VotingApp {
	int age;
	public void ageValidation() throws InvalidAgeException {
		if(age<18){
			throw new InvalidAgeException();
		}
		else{
			System.out.println("Age is valid for voting.");
		}
	}
}
