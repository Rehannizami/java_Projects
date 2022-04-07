import java.applet.*;

import java.util.Scanner;

class Main extends Applet
{
    void welcome()
    {
        System.out.println("     WELCOME");
        int rows=8;  
        for (int i= 0; i<= rows-1; i++)  
            {  
                for (int j=0; j<=i; j++)  
                    {  
                        System.out.print(" ");  
                    }  
                for (int k=0; k<=rows-1-i; k++)  
                    {  
                        System.out.print("*" + " ");  
                    }  
                System.out.println();  
            }  
    }

    void name()
    {
        System.out.println("To continue, we need to know you!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("PROCESSING...");

        System.out.println("Hello! "+name);
    }



    void buffering()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


    }

    void calculator()
    {
        System.out.println("THE CALCULATOR");
        char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
    }

    

    public static void main(String[]args)
    {
        Main obj = new Main();
        obj.welcome();
        obj.name();
        obj.buffering();
        obj.calculator();
    }


}
