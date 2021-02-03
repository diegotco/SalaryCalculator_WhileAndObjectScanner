/* We are working in an If statment
1. All salespeople are gonna be paid 1000 dollars a week
2. Salespeople who exceed 10 sales within a week, will get an additional bonus of 250 dollars
*/ 

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    // Initialize the known values
    int salary = 1000;
    int bonus = 250;

String flag = "yes";
while (flag == "yes"){
    //Get values for the unknow
    System.out.println("How many sales did the employee this week");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
   

    //Quick detour for the bonus earners
    if(sales >= 10){
    salary = salary + bonus;
    }


    //Output
    System.out.println("The employee's pay is $" + salary);
    System.out.println("Do you want to continue? Write yes or no");
    flag = scanner.next();
    scanner.close();
  }

    }
    
}