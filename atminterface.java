import java.util.Scanner;

public class atminterface
{
    public static void main(String[] args)
    {
        int balance = 100000, Withdraw, deposit, transaction;
        Scanner sc = new Scanner(System.in);
        System.out.print(System.lineSeparator() + "Enter Account Holder Name : ");
        String AccountHolder = sc.nextLine();
        int pin = 4545;
        System.out.print("Enter your PIN number : ");
        int pin_No = sc.nextInt();
        if (pin_No != 4545) {
            System.out.println(System.lineSeparator() + "Wrong pin number !! ");
            System.exit(0);
        }
        if (pin_No == 4545) {
            while (true) {
                System.out.println(System.lineSeparator() + "**** Welcome to Account**** "
                        + System.lineSeparator());
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 to Transfer money");
                System.out.println("Choose 4 to Quit" + System.lineSeparator());
                System.out.print("Choose Banking option : ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(System.lineSeparator() + "Account Holder Name: " + AccountHolder
                                + System.lineSeparator());
                        System.out.print("Enter amount for withdrawn: ");
                        Withdraw = sc.nextInt();
                        if (balance >= Withdraw) {
                            balance = balance - Withdraw;
                            System.out.println("Your Balance is Rs." + balance + System.lineSeparator());
                            System.out.println("Please collect your money");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println(System.lineSeparator() + "Account Holder Name: " + AccountHolder
                                + System.lineSeparator());
                        System.out.print("Enter amount for deposit: ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Total balance is Rs." + balance + System.lineSeparator());
                        System.out.println("Your amount is successfully deposited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println(System.lineSeparator() + "Account Holder Name: " + AccountHolder
                                + System.lineSeparator());
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Enter the Name to transfer money to: ");
                        String Name = scan.nextLine();
                        System.out.print("Enter the amount to transfer: ");
                        int transferAmount = sc.nextInt();
                        balance -= transferAmount;
                        System.out.println("Available balance is Rs." + balance + System.lineSeparator());
                        System.out.println(Name + " " + transferAmount + " Amount is Successfully Transferred");
                        break;

                    case 4:
                        System.exit(0);
                }
            }
        }
    }
}