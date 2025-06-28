package First.src.practice;

import java.util.*;

public class PracticeAsBeginner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Please Enter The Num--->>>  ");
        int input= 3;

        for (int i=1;i<=input;i++){
            for (int j=1;j<=input;j++){
                System.out.print(j);
            }
            System.out.print(i);
        }

//        System.out.println("    ");
//        System.out.println("    ");
//
//
//        for(int q=1;q<=4;q++){
//            System.out.println(q);
//        }



//        int a=2,b=5;
//        int result=1;
//
//        for (int i=1;i<=b;i++){
//            result*=a;
//        }
//        System.out.println(result);





//        int fact=1;
//
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//            System.out.println("Factorial of " +n + " is " + fact);
//        }




//        int ans=0;
//
//        for(int i=1;i<=n;i++){
//            if(i%2==0){
//                ans-=i;
//            }else {
//                ans+=i;
//            }
//        }
//        System.out.println("Sum="+ ans);
//


//        // Reverse digits
//        int n = sc.nextInt();
//        int result = 0;
//
//        while (n > 0) {
//            result = result * 10 + n % 10;
//            n /= 10;
//        }
//        System.out.println(result);


        // Uncomment to use: Sum of digits
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n = n / 10;
//        }
//        System.out.println(sum);


        // Uncomment to use: Count number of digits
//        int numOfDigits = 0;
//        while (n > 0) {
//            n = n / 10;
//            numOfDigits++;
//        }
//        System.out.println("number of digits -> " + numOfDigits);


        // Simple while loop example
//        int a = 1;
//        while (a < 4) {
//            System.out.println(a + "");
//            a++;
//        }


        // Loop with continue and label
//        myloop: for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }


        // Find smallest number divisible by both 5 and 7
//        int num = 1;
//        while (true) {
//            if (num % 5 == 0 && num % 7 == 0) {
//                System.out.println("Answer Found: " + num);
//                break;
//            }
//            num++;
//        }


        // Sum until -1 entered
//        int num, sum = 0;
//        do {
//            num = sc.nextInt();
//            if (num != -1)
//                sum += num;
//        } while (num != -1);
//        System.out.println(sum);


        // Print numbers from n to 10 using do-while
//        do {
//            System.out.println(n);
//            n++;
//        } while (n <= 10);


        // Sum from 1 to n
//        int a = 1;
//        int sum = 0;
//        n = sc.nextInt();
//        while (a <= n) {
//            sum += a;
//            a++;
//        }
//        System.out.println("Sum from 1 to " + n + " is: " + sum);


        // Print numbers from 15 to 1 using for loop
//        for (int i = 15; i >= 1; i--) {
//            System.out.println(i);
//        }


        // Switch case for days
//        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("Invalid input");
//        }


        // Check even or odd using if-else and ternary operator
//        int value = sc.nextInt();
//        if (value % 2 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        String ans = (value % 2 == 0) ? "yes" : "no";
//        System.out.println(ans);


        // Input a character
//        System.out.println("Enter a character");
//        char ch = sc.next().charAt(0);
//        System.out.println("Character: " + ch);


        // Simple Interest Calculation
//        float p = sc.nextFloat();
//        float r = sc.nextFloat();
//        float t = sc.nextFloat();
//        System.out.println("Simple Interest = " + ((p * r * t) / 100));


        // Take number input
//        System.out.print("Enter the input number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Input taken: " + num1);


        // Take string input
//        String name = sc.next();
//        System.out.println("Name: " + name);
    }
}
