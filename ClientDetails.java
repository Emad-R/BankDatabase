
import java.util.Scanner;
// Purpose: develop bank database storing customers info and save to file
// this class holds all the methods ~ is not the driver class

public class ClientDetails {
    private String accountNumber;  
    private String customerName;  
    private String typeOfAccount;  
    private double balance;  
    Scanner sc = new Scanner(System.in);  
   

    //method to open new account  
    public void openAccount() {  
      
	        System.out.print("Enter Name: ");  
	        customerName = sc.next();  
	        System.out.print("Enter Account No: ");  
	        accountNumber = sc.next();  
	        System.out.print("Enter Account type: ");  
	        typeOfAccount = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextDouble(); 

		} 
		
        

     
    //method to display account details  
    public void showAccount() {  
        System.out.println("Name of account holder: " + customerName);  
        System.out.println("Account no.: " + accountNumber);  
        System.out.println("Account type: " + typeOfAccount);  
        System.out.println("Balance: " + balance);  
    }  
    //method to deposit money  
    public void deposit() {  
        double amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    //method to withdraw money  
    public void withdrawal() {  
        double amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accountNumber.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
    public String toString() {
        // Return a formatted string representing the client's information
        return "Customer: " + customerName +
               "\nAccount Number: " + accountNumber +
               "\nType of Account: " + typeOfAccount + 
               "\nBalance: " + balance + "\n";
               
    }
}  
