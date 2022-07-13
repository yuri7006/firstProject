import java.util.Scanner;

public class FirstProjectCurrencyexchange {


        public static void main(String[] args) {
            int x = 5;
            while (x != 0) {
                System.out.println("Press  1 to convert a shekels to dollars ");
                System.out.println("Press  2 to convert a dollars to shekels");
                System.out.println("Press  3 to convert a euro to shekels");
                System.out.println("Press  4 to convert a shekels to euros ");
                System.out.println("press 0 to exit");
                Scanner scanner = new Scanner(System.in);
                x = scanner.nextInt();
                switch (x) {
                    case 1 -> {
                        System.out.println("enter sum ");
                        double sum1 = scanner.nextDouble();
                        System.out.println("shekels to dollars " + sum1 / 3.5260);
                    }
                    case 2 -> {
                        System.out.println("enter sum dollar");
                        double sum2 = scanner.nextDouble();
                        System.out.println("dollars to shekels :" + sum2 * 3.5260);
                    }
                    case 3 -> {
                        System.out.println("enter sum euro");
                        double sum3 = scanner.nextDouble();
                        System.out.println("euro to shekels :" + sum3 * 3.6850);
                    }
                    case 4 -> {
                        System.out.println("enter sum shelkel");
                        double sum4 = scanner.nextDouble();
                        System.out.println("shekels to euros :" + sum4 / 3.6850 );
                    }
                    default -> System.out.println("exit");

                }
            }
        }
    }

