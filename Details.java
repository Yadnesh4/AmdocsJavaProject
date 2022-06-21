package BankProject;

import java.util.Scanner;  

class Details {  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Customer Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Customer Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Customer Name: ");  
        name = sc.next();  
        System.out.print("Enter Initial Balance: ");  
        balance = sc.nextLong();  
    }  
    
    //method to display account details  
    public void showAccount() {  
        System.out.println("---------------------------------------"); 
        System.out.println("Name of Customer: " + name);  
        System.out.println("Customer Account no.: " + accno);  
        System.out.println("Customer Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
        System.out.println("---------------------------------------"); 
    }  
    
    //method to deposit money  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    
    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!!" );  
        }  
    }  
    
    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  