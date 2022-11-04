import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        while (true)
        {
            System.out.println("select an option");
            System.out.println("1.Add student");
            System.out.println("2.Search student");
            System.out.println("3.delete student");
            System.out.println("4.view student");
            System.out.println("5.Exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Add student selected");
                    break;
                case 2:
                    System.out.println("search student selected");
                    break;
                case 3:
                    System.out.println("delete student selected");
                    break;
                case 4:
                    System.out.println("view student selected");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}