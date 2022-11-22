import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Qoutes {
    public static void main(String[] args) {

        int choice;
        while (true) {
            System.out.println("select an option");
            System.out.println("1.insert");
            System.out.println("2.select or view");
            System.out.println("3.search");
            System.out.println("4.delete");
            System.out.println("5.update");
            System.out.println("6.Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("insert quote selected");
                    break;
                case 2:
                    System.out.println("view quote selected");
                    break;

                case 3:
                    System.out.println("Search quote");
                    break;

                case 4:
                    System.out.println("delete quote selected");
                    break;
                case 5:
                    System.out.println("update quote selected");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
