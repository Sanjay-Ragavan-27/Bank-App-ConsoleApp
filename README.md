# Bank Application in Java

## Overview

This project implements a **Banking Application** in Java. Users can securely log in to their accounts and perform banking operations such as deposits, withdrawals, balance inquiries, and view mini statements. The application stores user data and transactions dynamically using Java collections.

---

## Features

1. **User Authentication**: Validates username and password for secure access.  
2. **Deposit Money**: Users can deposit money into their accounts.  
3. **Withdraw Money**: Users can withdraw money, with the amount deducted from their balance.  
4. **Balance Inquiry**: Displays the current account balance.  
5. **Mini Statement**: Shows the last five transactions of the user.  
6. **Interactive Menu**: Provides a menu-driven interface for user operations.  

---

## Code Structure

### **Classes**

| Class      | Description                                                                  |
|------------|------------------------------------------------------------------------------|
| `User`     | Represents a bank user with attributes like ID, username, password, balance, and transactions. |
| `Main`     | Coordinates the application flow, handles user authentication, and banking operations. |

### **Main Class Methods**

| Method                  | Description                                                                  |
|-------------------------|------------------------------------------------------------------------------|
| `displayOperations()`   | Displays the menu of operations and handles user choices.                    |
| `depositMoney()`        | Handles depositing money into the user's account.                           |
| `withdrawMoney()`       | Handles withdrawing money from the user's account.                          |
| `balanceInquiry()`      | Displays the current balance of the user's account.                         |
| `displayMiniStatements()`| Displays the last five transactions of the user.                           |

---

## How to Use

1. Clone this repository or copy the code.  
2. Compile and run the `Main` class.  
3. Log in with a valid username and password.  
4. Perform banking operations through the interactive menu.  

### Example Code

```java
public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<String, User>();
        users.put("admin", new User(1, "admin", "admin", 2000));

        System.out.println("Enter your username: ");
        Scanner sc = new Scanner(System.in);
        String uname = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();

        if(users.containsKey(uname) && users.get(uname).password.equals(pass)) {
            displayOperations(users, uname);
        } else {
            System.out.println("Invalid username or password");
        }
    }
}
```

---

## Sample Output

```
Enter your username: admin
Enter your password: admin
Welcome to the Bank App
Enter 1 deposit money
Enter 2 withdraw money
Enter 3 balance inquiry
Enter 4 mini statement
Enter 5 exit
1
Enter deposit amount
500
Amount Deposited

Enter 3 balance inquiry
Your Balance: Rs. 2500

Enter 4 mini statement
Mini Statements:
-------------------------
Deposit amount Rs.500 Balance Rs.2500

Enter 5 exit
```

---

## Customization

- Add support for multiple users with unique IDs.  
- Implement overdraft protection and withdrawal limits.  
- Save user data and transaction history to a file for persistence.  
- Enhance the mini-statement functionality to display timestamps for each transaction.  

---
