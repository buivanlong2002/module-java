package loop;



import java.util.Scanner;

public class Geometry_2 {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều cao tam giác: ");
                    int n = input.nextInt();

                    for (int i = 1; i <= n; i++) {
                        // In sao
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        // Xuống dòng
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Nhập cạnh hình vuông: ");
                    int n1 = input.nextInt();

                    for (int i = 1; i <= n1; i++) {
                        for (int j = 1; j <= n1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều dài HCN: ");
                    int a = input.nextInt();
                    System.out.println("Nhập chiều rộng HCN: ");
                    int b = input.nextInt();
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j <= a; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

