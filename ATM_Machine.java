package Lab_4;

import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int info[][] = new int[5][3];

        info[0][0] = 111;
        info[0][1] = 1111;
        info[0][2] = 5000;

        info[1][0] = 112;
        info[1][1] = 2222;
        info[1][2] = 4500;

        info[2][0] = 113;
        info[2][1] = 3333;
        info[2][2] = 9000;

        info[3][0] = 114;
        info[3][1] = 4444;
        info[3][2] = 3500;

        info[4][0] = 115;
        info[4][1] = 5555;
        info[4][2] = 6000;

        int Account_no, Pin;
        System.out.println("\t\t===============o==== Welcome to SBI ATM  Service ====o================");
        System.out.println("\n\nEnter  Your Account no and Mpin :");
        Account_no = sc.nextInt();
        Pin = sc.nextInt();
        System.out.println("----------------------------------------------------------");
        int option = 0;
        boolean is_checked = true;
        int i, j, k = 0;
        int deposit_Amt, available_Bal = 0, withdrawal_Amt = 0;
        while (true) {
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 2; j++) {
                    if (info[i][j] == Account_no && info[i][j + 1] == Pin) {
                        System.out.println("\n\n\t\t Dear! Customer \nYour Account_no :" + info[i][j]);
                        System.out.println("Choose the related option for your desired service:");
                        System.out.println("=====================o======================o==============");
                        System.out.println("1.Deposite money :");
                        System.out.println("2.Withdraw money :");
                        System.out.println("3.fast withdral  :");
                        System.out.println("4.check balance :");
                        System.out.println("5.change ATM pin :");
                        System.out.println("6.Mini statement:");
                        System.out.println("7.Exit ");
                        System.out.println("-----------------------------------------------------------------");
                        option = sc.nextInt();
                        available_Bal = info[i][2];
                        k = i;
                        is_checked = false;
                        break;
                    }
                }
                j = 0;
            }
            if (is_checked)
                System.out.println("invalid user! check your Account number or Mpin");

            switch (option) {
                case 1:
                    System.out.println("Enter deposite amount :");
                    deposit_Amt = sc.nextInt();
                    info[k][2] = info[k][2] + deposit_Amt;
                    System.out.println("Amount deposited successfully .");
                    System.out.println("Your current balance is " + info[k][2]);
                    System.out.println("------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount :");
                    withdrawal_Amt = sc.nextInt();
                    if (info[k][2] > withdrawal_Amt) {
                        info[k][2] = info[k][2] - withdrawal_Amt;
                        System.out.println("After withdrawal, Your available balance is " + info[k][2]);
                        System.out.println("--------------------------------------------------");

                    } else {
                        System.out.println("Dear Customer! You have insuffcient fund!");
                        System.out.println("---------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Welcome to fast withdral service  .");
                    System.out.println("1.  200 ");
                    System.out.println("2.  500 ");
                    System.out.println("3.  1000  ");
                    System.out.println("4.  5000");
                    System.out.println("5.  10000");
                    System.out.println("Select the desired option  for fast withdrawal:");
                    int opt = sc.nextInt();

                    System.out.println("===========================================================");
                    if (opt == 1)
                        withdrawal_Amt = 200;
                    else if (opt == 2)
                        withdrawal_Amt = 500;
                    else if (opt == 3)
                        withdrawal_Amt = 1000;
                    else if (opt == 4)
                        withdrawal_Amt = 5000;
                    else if (opt == 5)
                        withdrawal_Amt = 10000;
                    else
                        System.out.println("You have selected invalid choice.");
                    if (opt == 1 || opt == 2 || opt == 3 || opt == 4 || opt == 5) {

                        if (info[k][2] > withdrawal_Amt) {// bug
                            info[k][2] = info[k][2] - withdrawal_Amt;
                            System.out.println("Amount Withdrawn  successfully.");
                            System.out.println(" Your available balance:" + info[k][2]);
                            System.out.println("-------------------------------------------------------");
                        } else {
                            System.out.println("Insufficient fund .");
                            System.out.println("-------------------------------------------------------");
                        }
                    }
                    else{
                        System.out.println("=====Thank You for using SBI ATM service======");
                    }
                    break;
                case 4:
                    System.out.println("Available balance is " + available_Bal);
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 5:

                    System.out.println("Enter your current pin :");
                    Pin = sc.nextInt();
                    if (info[k][1] == Pin) {
                        System.out.println("Enter your new pin :");
                        Pin = sc.nextInt();
                        System.out.println("Re-enter your pin :");
                        int pin_check = sc.nextInt();
                        if (Pin == pin_check) {
                            info[k][1] = Pin;
                            System.out.println("Your Pin changed successfully .");
                            System.out.println("Your New pin: " + info[k][1]);
                        } else {
                            System.out.println("You have enter a wrong pin\nPlease try again!");
                        }

                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        System.out.println("You have enter a wrong pin");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    break;
                case 6:
                System.out.println("Account Number\t\t operation type\t\t\tAmount\t\t\t  Date");
                System.out.println("");
                String transactions[][] = {
                    {" 111", "Deposit", "   + 500", "2023-10-10"},
                    {" 112", "Withdrawal", "- 200", "2023-10-09"},
                    {" 113", "Transfer", "  - 300", "2023-10-08"},
                    {" 114", "Deposit", "   + 100", "2023-10-07"},
                    {" 115", "Withdrawal", "- 250", "2023-10-06"} };

                for (i=0;i<5;i++) {
                    for (j=0;j<4;j++){
                        System.out.print(transactions[i][j]+ "                     ");
                    }
                    System.out.println();
                }
        
                    break;
                default:
                    System.out.println("======Thank you for using SBI ATM service.======");
                    System.exit(0);
            }
        }

    }

}