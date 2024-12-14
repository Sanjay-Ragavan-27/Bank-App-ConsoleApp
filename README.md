# Banking System Console Application

A simple Java console application simulating a banking system where users can perform basic banking operations such as deposit, withdrawal, balance inquiry, and view mini statements. The application features user authentication via username and password.

## Features

- **User Authentication**: Users must enter a valid username and password to access their account.
- **Deposit Money**: Users can deposit money into their account.
- **Withdraw Money**: Users can withdraw money from their account.
- **Balance Inquiry**: Users can check their current balance.
- **Mini Statement**: Users can view the last 5 transactions.
- **Exit**: The user can exit the application.

## Methods

### 1. `displayOperations(Map<String, User> users, String uname)`
This method is responsible for displaying the available banking operations (deposit, withdraw, balance inquiry, mini statement) and handles user inputs to trigger the respective operations.

### 2. `depositMoney(Map<String, User> users, String uname)`
This method allows users to deposit money into their account. The deposit is added to the user's balance, and the transaction is logged in the mini statement.

### 3. `withdrawMoney(Map<String, User> users, String uname)`
This method allows users to withdraw money from their account. The withdrawn amount is deducted from the balance, and the transaction is logged in the mini statement.

### 4. `balanceInquiry(Map<String, User> users, String uname)`
This method allows users to check their current balance in the bank.

### 5. `displayMiniStatements(Map<String, User> users, String uname)`
This method displays the last 5 transactions made by the user. If there are fewer than 5 transactions, it shows all transactions made.

## Class Structure

### `User` Class
The `User` class represents an individual user of the banking system. It contains the following fields:
- `id`: The user’s unique ID.
- `username`: The user’s login username.
- `password`: The user’s password.
- `balance`: The current balance of the user.
- `transaction`: A list of strings that stores transaction details.
- `transactionCounter`: A counter to track the number of transactions made by the user.

### `Main` Class
The `Main` class contains the main logic for handling user authentication, displaying operations, and calling the methods for deposit, withdrawal, balance inquiry, and mini statement.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("admin", new User(1, "admin", "admin", 2000)); // Adding a sample user

        System.out.println("Enter your username: ");
        Scanner sc = new Scanner(System.in);
        String uname = sc.nextLine();
        
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();

        if (users.containsKey(uname) && users.get(uname).password.equals(pass)) {
            displayOperations(users, uname); // Access banking operations after login
        } else {
            System.out.println("Invalid username or password");
        }
    }
}
