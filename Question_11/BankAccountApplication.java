import java.util.Scanner;

class Bank_account {
    private int Account_id;
    private String mobile_number;
    private String account_holder_name;
    private String account_type;
    private double account_balance;
    private double Credit_limit;

    // Overloaded constructors
    public Bank_account(int Account_id, String mobile_number, String account_holder_name, String account_type) {
        this(Account_id, mobile_number, account_holder_name, account_type, 0, 0);
    }

    public Bank_account(int Account_id, String mobile_number, String account_holder_name, String account_type,
            double account_balance, double Credit_limit) {
        this.Account_id = Account_id;
        this.mobile_number = mobile_number;
        this.account_holder_name = account_holder_name;
        this.account_type = account_type;
        this.account_balance = account_balance;
        this.Credit_limit = Credit_limit;
    }

    // Update account details
    public void update_account(double account_balance, double Credit_limit) {
        this.account_balance = account_balance;
        this.Credit_limit = Credit_limit;
    }

    @Override
    public String toString() {
        return "Account ID: " + Account_id + "\nMobile Number: " + mobile_number + "\nAccount Holder Name: "
                + account_holder_name + "\nAccount Type: " + account_type + "\nAccount Balance: " + account_balance
                + "\nCredit Limit: " + Credit_limit;
    }

    public int getAccount_id() {
        return Account_id;
    }
}

public class BankAccountApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Bank_account references
        Bank_account[] accounts = new Bank_account[3];

        // Initialize accounts
        accounts[0] = new Bank_account(1001, "1234567890", "vimal Singh", "Savings");
        accounts[1] = new Bank_account(1002, "9876543210", "ajay raj", "Checking");
        accounts[2] = new Bank_account(1003, "5555555555", "Bob Johnson", "Savings");

        System.out.println("Enter Account ID to display account details: ");
        int accountID = scanner.nextInt();

        // Find and display account details based on Account ID
        Bank_account selectedAccount = null;
        for (Bank_account account : accounts) {
            if (account != null && accountID == account.getAccount_id()) {
                selectedAccount = account;
                break;
            }
        }

        if (selectedAccount != null) {
            System.out.println(selectedAccount.toString());
        } else {
            System.out.println("Account not found.");
        }

        // Close the scanner
        scanner.close();
    }
}
