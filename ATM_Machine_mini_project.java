import java.util.*;
public class ATM_Machine_mini_project{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int correct_pin = 2006;
        int attempts = 3;
        int account_balance = 127000;
        int last_withdrawn = 0;
        int last_deposited = 0;
        int choice;
        int fast_cash_choice;
        while(attempts > 0){
            System.out.print("enter you pin: ");
            int user_pin = sc.nextInt();
            if(user_pin == correct_pin){
                System.out.println("how would you like to proceed: ");
                do{
                    System.out.println("1. check balance");
                    System.out.println("2. withdraw money");
                    System.out.println("3. deposit money");
                    System.out.println("4. fast cash");
                    System.out.println("5. check last deposited and withdrawn amount");
                    System.out.println("6. change pin");
                    System.out.println("7. exit");
                    System.out.print("enter your choice: ");
                    choice = sc.nextInt();
                    switch(choice){
                        case 1: System.out.println("account balance: " + account_balance);
                                break;
                        case 2: System.out.print("enter amount: ");
                                int withdraw_amount = sc.nextInt();
                                last_withdrawn = withdraw_amount;
                                if(account_balance >= withdraw_amount){
                                    account_balance -= withdraw_amount;
                                    System.out.println(withdraw_amount + " is successfully debited from your account.");
                                    System.out.println("updated account balance: " + account_balance);
                                }
                                else{
                                    System.out.println("insufficient balance.");
                                }
                                break;
                        case 3: System.out.print("enter amount: ");
                                int deposit_amount = sc.nextInt();
                                last_deposited = deposit_amount;
                                account_balance += deposit_amount;
                                System.out.println(deposit_amount + " is successfully credited to your account.");
                                System.out.println("updated account balance: " + account_balance);
                                break;
                        case 4: do{
                                    System.out.println("1. 500");
                                    System.out.println("2. 1000");
                                    System.out.println("3. 1500");
                                    System.out.println("4. 2000");
                                    System.out.println("5. exit fast cash");
                                    System.out.print("enter your choice: ");
                                    fast_cash_choice = sc.nextInt();
                                switch(fast_cash_choice){
                                    case 1: if(account_balance >= 500){
                                               account_balance -= 500;
                                               System.out.println(500 + " Rs is successfully debited from your account.");
                                               System.out.println("updated account balance: " + account_balance);
                                            }
                                            else{
                                                System.out.println("insufficient balance.");
                                            }
                                            break;
                                    case 2: if(account_balance >= 1000){
                                               account_balance -= 1000;
                                               System.out.println(1000 + " Rs is successfully debited from your account.");
                                               System.out.println("updated account balance: " + account_balance);
                                            }
                                            else{
                                                System.out.println("insufficient balance.");
                                            }
                                            break;
                                    case 3: if(account_balance >= 1500){
                                               account_balance -= 1500;
                                               System.out.println(1500 + " Rs is successfully debited from your account.");
                                               System.out.println("updated account balance: " + account_balance);
                                            }
                                            else{
                                                System.out.println("insufficient balance.");
                                            }
                                            break;
                                    case 4: if(account_balance >= 2000){
                                               account_balance -= 2000;
                                               System.out.println(2000 + " Rs is successfully debited from your account.");
                                               System.out.println("updated account balance: " + account_balance);
                                            }
                                            else{
                                                System.out.println("insufficient balance.");
                                            }
                                            break;
                                    case 5: System.out.println("exiting fast cash...");
                                            break;
                                    default : System.out.println("invalid choice");
                                              break;
                                }
                            }while(fast_cash_choice != 5);
                            break;
                        case 5: System.out.println("last deposited amount: " + last_deposited);
                                System.out.println("last withdrawn amount: " + last_withdrawn);
                                System.out.println("current account balance: " + account_balance);
                                break;
                        case 6: System.out.print("enter new pin: ");
                                int new_pin = sc.nextInt();
                                correct_pin = new_pin;
                                System.out.println("pin updated successfully");
                                break;
                        case 7: System.out.println("exiting...");
                                break;
                        default: System.out.println("invalid choice");
                                 break;
                    }
                }while(choice != 7);
                break;
            }
            else{
                attempts--;
                System.out.println("incorrect pin! you have " + attempts + " attempts remaining.");
            }
        }
        if(attempts == 0){
            System.out.println("ATM blocked! Too many wrong attempts.");
        }
        sc.close();
    }    
}
