import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static ArrayList<String> books = new ArrayList<>();

    void WelCome() {
        System.out.println("1. Show books");
        System.out.println("2. Return books");
        System.out.println("3. Borrow books");
        System.out.println("0. Quit");
    }

    void showBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + " " + books.get(i));
        }
    }

    void addBooks(String book) {
        books.add(book);
    }

    void borrowBook(int i) {
        books.remove(i);
    }

    public static void main(String[] args) {
        System.out.println("WelCome to Our Library");
        Scanner sc = new Scanner(System.in);
        books.add("The Power of Now");
        books.add("The Power of Subconscious Mind");
        Library ll = new Library();
        ll.WelCome();
        boolean lib = false;
        while (!lib) {
            System.out.println();
            int option = sc.nextInt();
            if (option == 0) return;
            switch (option) {
                case 1:
                    ll.showBooks();
                    System.out.println();
                    ll.WelCome();
                    break;

                case 2:
                    // ll.showBooks();
                    System.out.println("Returning Books");
                    System.out.print("Book name: ");

                    String name = sc.next() + sc.nextLine();
                    ll.addBooks(name);
                    // ll.showBooks();
                    System.out.println();
                    ll.WelCome();
                    break;
                case 3:
                    ll.showBooks();
                    int idx = sc.nextInt();
                    ll.borrowBook(idx - 1);
                    System.out.println("Thank you for using our Library");
                    ll.WelCome();
                    break;
            } sc.close();
        }

        // books.remove(ll)
        // System.out.println(books);
    }
}
