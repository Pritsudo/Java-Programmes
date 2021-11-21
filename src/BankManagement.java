import java.sql.SQLOutput;
import java.util.*;

public class BankManagement {

    public static void main(String[] args) {
    show sh=new show("Prit","IamGenius");
    sh.showMenu();
    }

}

class show{
    Scanner sc=new Scanner(System.in);

    int money,previoustransection;
    String customername,customerid;

    show(String customername,String customerid)
    {
        this.customername=customername;
        this.customerid=customerid;

    }

    void withdrawl(int amount){
        if(amount!=0) {
            money = money - amount;
            previoustransection = -amount;
            //System.out.println("Left Money" + money);
        }
    }
    void deposite(int amount){
        if(amount!=0) {
            money = money + amount;
            previoustransection = amount;
            //System.out.println("Left Money" + money);
        }
    }
    void balance()
    {
        System.out.println("Balance in " + customerid + " account is :"+money);
    }

    void showTransection()
    {
        if(previoustransection>0) {
            System.out.println("Deposited Money is :"+previoustransection);
        }

        else if(previoustransection<0)
        {
            System.out.println("Withdrawl Money is"+Math.abs(previoustransection));
        }
        else {
            System.out.println("No Record Found");
        }
    }

    void showMenu()
    {
        int choice,money=0;
        do {

            System.out.println("\n1.) Do You Want Withdrawl Money? ");
            System.out.println("2.) Do You Want Deposite Money? ");
            System.out.println("3.) Do You Want to show previouse transections? ");
            System.out.println("4.) Do You Want to see balance?");
            System.out.println("5.) Cancel Transaction? \n");

            System.out.println("Enter Your Choice ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    if(money!=0)
                    {
                        System.out.println("\nEnter How many money you want to withdrawl");
                        money = sc.nextInt();
                        withdrawl(money);
                        break;
                    }
                   else {
                        System.out.println("\nPlease Deposite some money");
                        break;
                    }
                }
                case 2: {
                    System.out.println("\nEnter How many money you want to Deposite");
                    money = sc.nextInt();
                    deposite(money);
                    break;
                }
                case 3: {
                    System.out.println("\nPreviouse transection history");
                    showTransection();
                    break;
                }

                case 4: {
                    balance();

                    break;
                }
                case 5: {
                    System.out.println("\nNice To see you!");
                    break;

                }
            }
        }
        while(choice!=5);

            System.out.println("Thanks for visit");

        }
    }



