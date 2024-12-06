import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.ArrayList;
import java.util.Arrays;

class User{
    int id;
    String username;
    String password;
    int balance;
    ArrayList<String> transcation = new ArrayList<>();
    int transcationCounter = 0;
    User(int id, String username, String password, int balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
}
public class Main {
    static void displayOperations(Map <String, User> users,String uname){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("Welcome to the Bank App");
            System.out.println("Enter 1 deposit money");
            System.out.println("Enter 2 withdraw money");
            System.out.println("Enter 3 balance inquiry");
            System.out.println("Enter 4 mini statement");
            System.out.println("Enter 5 exit");
            option = sc.nextInt();
            if(option == 1){
                depositMoney(users, uname);
            }
            if (option == 2){
                withdrawMoney(users, uname);
            }
            if (option == 3){
                balanceInquiry(users, uname);
            }
            if (option == 4){
                displayMiniStatements(users,uname);
            }
        }while(option != 5);
    }

    static void depositMoney(Map <String, User> users, String uname){
        users.get(uname).transcationCounter +=1;
        Scanner sc = new Scanner(System.in);
        int deposit;
        System.out.println("Enter deposit amount");
        deposit = sc.nextInt();
        users.get(uname).balance += deposit;
        System.out.println("Amount Desposited");
        users.get(uname).transcation.add("Desposit amount Rs."+deposit+" Balance Rs."+users.get(uname).balance);
        System.out.println();
    }

    static void withdrawMoney(Map <String, User> users, String uname){
        users.get(uname).transcationCounter +=1;
        Scanner sc = new Scanner(System.in);
        int withdraw;
        System.out.println("Enter withdraw amount");
        withdraw = sc.nextInt();
        users.get(uname).balance -=withdraw;
        System.out.println("Amount Withdrawn");
        System.out.println();
        users.get(uname).transcation.add("Withdraw amount Rs."+withdraw+" Balance Rs."+users.get(uname).balance);
    }

    static void balanceInquiry(Map <String, User> users, String uname){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Balance: Rs. "+users.get(uname).balance);
        System.out.println();
    }

    static void displayMiniStatements(Map <String, User> users, String uname){
        System.out.println("Mini Statements:\n-------------------------");
        int n = users.get(uname).transcationCounter;
        if(n==0){
            System.out.println("No transcation detected");
        }
        else if(n <= 5){
            for(int i=0; i<n;i++){
                System.out.println(users.get(uname).transcation.get(i));
            }
        }
        else{
            for(int i= n-5;i<n;i++){
                System.out.println(users.get(uname).transcation.get(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Map<String,User> users = new HashMap<String,User>();
        users.put("admin", new User(1,"admin","admin",2000));
        System.out.println("Enter your username: ");
        Scanner sc = new Scanner(System.in);
        String uname = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();
        if(users.containsKey(uname) && users.get(uname).password.equals(pass)) {
            displayOperations(users,uname);
        }
        else{
            System.out.println("Invalid username or password");
        }
    }
}