import java.util.Scanner;

public class PostCodeGeneration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 6;


        while (true) {
            System.out.println("1- Generate postcode");
            System.out.println("0- End");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option != 0) {
                String postcode = PostCode.postcode(size);
                System.out.println();
                System.out.println(postcode);
                System.out.println();
            } else {
                break;
            }
        }
    }
}

