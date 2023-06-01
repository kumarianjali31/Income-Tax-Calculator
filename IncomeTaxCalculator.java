import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("press 1 to see how much incometax is charged");
            System.out.println("press 0 to exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    int inc = income();
                    int result = Calc(inc);
                    System.out.println("Your income tax charged is: " + result);
                    System.out.println("###############################################");
                    break;
            }
        } while (n != 0);
    }

    Scanner sc = new Scanner(System.in);

    public static int income() {
        Scanner sc = new Scanner(System.in);
        System.out.println("###############################################");
        System.out.println("Enter your Salary Per Annum");
        int inp = sc.nextInt();
        System.out.println("###############################################");
        return inp;
    }

    public static int Calc(int inc) {
        if (inc <= 700000) {
            System.out.println("###############################################");
            System.out.println("your income details");
            System.out.println("your salary is "+inc);
            System.out.println("Income tax charged is: NIL");
            System.out.println("As your income is below 7 lakh or equal");
            return 0;
        } else if (inc > 700000 && inc <= 900000) {
            //std is standard deduction
            int std = inc - 50000;
            int income = std - 600000;
            int res = 15000 + (income * 10) / 100;
            System.out.println("your income details");
            System.out.println("your salary is "+inc);
            return res;
        } else if (inc > 900000 && inc <= 1200000) {
            int std = inc - 50000;
            int income = std - 900000;
            int res = 45000 + (income * 15) / 100;
            System.out.println("your income details");
            System.out.println("your salary is "+inc);
            return res;
        } else if (inc > 1200000 && inc <= 1500000) {
            int std = inc - 50000;
            int income = std - 1200000;
            int res = 90000 + (income * 15) / 100;
            System.out.println("your income details");
            System.out.println("your salary is "+inc);
            return res;
        } else {
            int std = inc - 50000;
            int income = std - 1500000;
            int res = 150000 + (income * 30) / 100;
            System.out.println("your income details");
            System.out.println("your salary is "+inc);
            return res;
        }
    }
}