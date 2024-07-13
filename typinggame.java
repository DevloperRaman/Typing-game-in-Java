import java.util.Scanner;

public class typinggame {

    public static void main0(String n, String m) {
        Scanner c = new Scanner(System.in);

        if (n.charAt(0) == m.charAt(0)) {

            System.out.println();
            System.out.println("Good");
            System.out.println("You reach Next leval");

            System.out.println("New word is:  Nature refers to the physical world");
            System.out.print("Enter: ");

            n = "Nature refers to the physical world";
            m = c.nextLine();
            System.out.println();
            System.out.println("Good");
            System.out.println("You reach Next leval");
            System.out.println("New word is:  The beauty of nature is unimaginable. ");
            System.out.print("Enter: ");
            m = c.nextLine();
            System.out.println();
            System.out.println("Good");
            System.out.println("You reach Next leval");
            System.out.println("New word is:  When we observe and feel the beauty of nature");
            String n2;
            n2 = "When we observe and feel the beauty of nature";

            System.out.print("Enter: ");
            m = c.nextLine();
            System.out.println();
            // System.out.println();
            System.out.println("Good");
            System.out.println("You reach Next leval");
            System.out.println("New word is:   Competitive cricket is essentially a bat and ball sport.. ");
            System.out.print("Enter: ");
            m = c.nextLine();
            System.out.println("good");
            System.out.println();
            System.out.print("Please Enter your name:");

            String name = c.nextLine();
            System.out.print("Please Enter your  Gender:");
            String a = c.nextLine();
            String b = "Mail";
            String d = "mail";
            if (a.charAt(0) == b.charAt(0) || a.charAt(0) == d.charAt(0)) {
                System.out.println(":::::" + "Thankyou for Plaing Mr " + name + ":::::");

                System.out.println("Game Over");

            } else {
                System.out.println(":::::" + "Thankyou for Plaing Ms. " + name + ":::::");

                System.out.println("Game Over");

            }

        } else {
            System.out.println("Tryagin and run program Again");
            return;
        }

    }

    public static void main(String[] args) {
        System.out.println(":::::Game Started Wedout time limet:::::");
        System.out.println("Word is:");
        String a = "Game";
        System.out.println("Game");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        main0(a, b);

    }

}
