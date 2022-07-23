import java.io.*;
import java.util.*;

public class TestAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner input =  new Scanner(System.in);

		Account[] accounts = new Account[10];
		double balance = 1000;

		try {
			for(int i=0; i<accounts.length; i++) {
				System.out.println("Enter name of account holder # " + (i+1));
				String name = input.next();
				System.out.println("Enter id of account holder # " + (i+1));
				int id = input.nextInt();
				accounts[i] = new Account(name, id, balance);
				accounts[i].setAnnualInterestRate(15);
			}
			
		}catch(Exception a) {
			System.out.println("Account not created " +a);
		}

		try {
			for(int i=0; i<accounts.length; i++) {
				double withdraw;
				System.out.println("Account holder # "+(i+1));

					System.out.println("How much do you want to withdraw ?");
					withdraw = input.nextDouble();
					accounts[i].withdraw(withdraw);
			}
		}catch(Exception a) {
			System.out.println("Withdraw unsuccessful");
		}

		try {
			for(int i=0; i<accounts.length; i++) {
				double deposit;
				System.out.println("Account holder # "+(i+1));

					System.out.println("How much do you want to deposit ?");
					deposit = input.nextDouble();
					accounts[i].withdraw(deposit);

			}
		}catch(Exception a) {
			System.out.println("Deposit unsuccessful");
		}
		
		try{
			File file = new File("Accounts.txt");
			PrintWriter output = new PrintWriter(file);
			
			for(int i=0;i<accounts.length;i++) {
				output.print(accounts[i].getName());
				output.println();
				output.print(accounts[i].getMonthlyInterest());
				output.println();
				for(int j=0; j<accounts[i].getTransaction().size();j++) {
					output.print((accounts[j].getTransaction()).get(j).getType());
					output.println();
					output.print((accounts[j].getTransaction()).get(j).getDate());
					output.println();
					output.print((accounts[j].getTransaction()).get(j).getAmount());
					output.println();
					output.print((accounts[j].getTransaction()).get(j).getBalance());
					output.println();
					output.print((accounts[j].getTransaction()).get(j).getDescription());
					output.println();
					output.println();
				}
			}
			output.close();
		}catch(Exception a) {
			System.out.println("File not found" +a);
			}
	}	
}
