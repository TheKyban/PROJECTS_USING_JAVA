import java.util.Scanner;

public class GuessTheNumber {
    private int randomNum = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
    // public GuessTheNumber (int n) {
    //     while (true) {
    //         String ans = check(n);
    //         System.out.println(ans);
    //         if (ans.equals("great")) return;

    //     }

    // }

    String check(int n) {
        if (n == randomNum) {
            return "great";
        } else if (n < randomNum) {
            return "up";
        } else {
            return "Down";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GuessTheNumber game = new GuessTheNumber();
        // System.out.println(game.randomNum);
        while (true) {
            System.out.print("Enter The Number: ");
            int gues = sc.nextInt();
            String ans = game.check(gues);
            System.out.println(ans);
            if (ans.equals("great")) {
                sc.close();
                return;
            } 
        } 
    }
}
