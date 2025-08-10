import java.util.Scanner;

public class NonPrimitives {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = input.next();
        input.nextLine();
        String fullName = input.nextLine();

        System.out.println(firstName);
        System.out.print(fullName);

    }
}