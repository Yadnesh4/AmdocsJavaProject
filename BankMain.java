package BankProject;

import java.util.Scanner;  

public class BankMain {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
        //create accounts for n number of customers
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        Details C[] = new Details[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new Details();  
            C[i].openAccount();  
        }  
        // loop runs until number 5 is not pressed to exit  
        int ch;  
        do {  
            System.out.println("\n ----- Welcome to ABC Bank -----");  
            System.out.println("======================================="); 
            System.out.println(" 1. Display all account details \n "
            		+ "2. View Balance\n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Exit ");  
            System.out.println("======================================="); 
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                        
                    case 2:  
                        System.out.print("Enter account no. for viewing balance: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Invalid Input!!! No Account exist for given input..!!!");  
                        }  
                        break;  
                        
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Invalid Input!!! No Account exist for given input..!!!");  
                        }  
                        break;  
                        
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Invalid Input!!! No Account exist for given input..!!!");  
                        }  
                        break;  
                        
                    case 5:  
                        System.out.println("Goodbye!!!, Have a nice Day...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }  