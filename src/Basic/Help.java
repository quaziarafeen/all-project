package Basic;

import java.util.Scanner;

public class Help {

//        public static void main(String args[])
//        {
//            int age;
//            Scanner sc=new Scanner(System.in);
//            System.out.print("What is your age?");
//            age=sc.nextInt();
//            if(age>=18)
//                System.out.println("You are eligible to vote.");
//            else
//                System.out.println("You are not eligible to vote.");
//
//        }


//public static void main(String[] args)
//{
//    Scanner in = new Scanner(System.in);
//    System.out.print("Input first number: ");
//    double x = in.nextDouble();
//    System.out.print("Input second number: ");
//    double y = in.nextDouble();
//    System.out.print("Input third number: ");
//    double z = in.nextDouble();
//    if (x < y && y < z)
//    {
//        System.out.println("Increasing order");
//    }
//    else if (x > y && y > z)
//    {
//        System.out.println("Decreasing order");
//    }
//    else
//    {
//        System.out.println("Neither increasing or decreasing order");
//    }
//}
//    int number1= 1;
//    int number2 = 1 2;
//    int number3= 1 2 3;

public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.println("Enter the number of row");
    int numberOfRow = number.nextInt();
    for (int i = 1; i <= numberOfRow; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + "  ");
        }
        System.out.println();

    }
}
}