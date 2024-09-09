package CodeAlpha;



import Project.ATM.ATM;

import java.util.Scanner;

public class Task2_Banking {
    private double balance;
    private int pin = 7232;

    Task2_Banking(){
        System.out.println("Welcome To ATM");

        Scanner sc = new Scanner(System.in);
        int enteredpin;
        do{
            System.out.println("Enter PIN : ");
            enteredpin = sc.nextInt();
            if (enteredpin == pin)
            {
                this.menu();
            }
            else{
                System.out.println("Enter valid Pin");
            }
        }while(enteredpin!=pin);
    }

    private void menu(){
        int option;
        do{
            System.out.println("**********MENU**********");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Withdrawl");
            System.out.println("3 - Deposit");
            System.out.println("4 - Exit");

            System.out.println("Enter option ");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            if(option == 1)
            {
                this.printBalance();
            }

            else if (option == 2)
            {
                System.out.println("Enter the withdrawl amount : ");
                double amt = sc.nextDouble();
                this.withdraw(amt);
            }

            else if (option == 3)
            {
                System.out.println("Enter amount to be dposited : ");
                double amt = sc.nextDouble();
                this.deposit(amt);
            }
            else if(option<1 || option>4)
            {
                System.out.println("Invalid option !!!");
            }
        }while(option!=4);
        System.out.println("Thanks for using the ATM.Please visit again !!!");
    }

    private void printBalance(){
        System.out.println("Your current balance is : "+this.balance);
    }

    private void withdraw(double amt){
        if (this.balance<amt)
        {
            System.out.println("Insufficient Balance !!!");
            return;
        }
        else{
            balance-=amt;
            System.out.println("Please collect your "+amt+" rupees");
        }
    }

    private void deposit(double amt)
    {
        balance+=amt;
    }


    public static void main(String[] args) {
        Task2_Banking obj1 = new Task2_Banking();
        obj1.menu();

    }
}


