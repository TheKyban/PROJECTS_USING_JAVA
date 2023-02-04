package HangmanGame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Hangman {
    private static String[] Words = {"apple","banana","orange"}; // words
    static String randword = RanWord(); // getting random words
    static String hidWord = hiddenWord(randword); // hidden word
    static int lives = 6; // chances
    public Hangman () throws FileNotFoundException{ // constructor displaying Hangman Ascii Art
        File file = new File("D:\\programming\\Projects_Java\\HangmanGame\\art\\hangman.text");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
        } reader.close();
    }
    public void Start(char alphabet) throws FileNotFoundException { // checking and replacing characters
        if (check(randword, alphabet)) {
            List<Integer> indices = getIndex(randword, alphabet); // getting indices
            hidWord = replacingTheChar(hidWord, alphabet, indices);
        } else {
            lives--;
            Art(Path());
            System.out.println();
        }
    }

    static String RanWord() { // chosing random words
        int ranNum = (int) Math.floor((Math.random() * ((Words.length-1) - 0 + 1) + 0)) ;
        return Words[ranNum];
    }

    static String hiddenWord(String word) { // hidding the words
        String hidWord = "";
        for(int i=0; i<word.length(); i++) {
            hidWord+="-";
        }
        return hidWord;
    }

    static boolean check(String word,char Char) { // checking the character present in the word or not
        if (word.contains(Character.toString(Char))) {
            return true;
        } else {
            return false ;
        }
    }

    static List<Integer> getIndex(String word,char Char) { // getting indices of the character in the word
        List<Integer> indices = new ArrayList<>();
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i)==Char) {
                indices.add(i);
            }
        }
        return indices;
    }

    static String replacingTheChar(String hidWord,char alphabet,List<Integer> indices) { // Replacing the character in the hidden word
        for (int i=0; i<indices.size(); i++) {
            int idx = indices.get(i);
            hidWord = hidWord.substring(0, idx) + alphabet + hidWord.substring(idx+1); // replacing the char
        }
        return hidWord;
    }

    static void Art(String path) throws FileNotFoundException { // Art displayer
        File file = new File(path);
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
        } reader.close();
    }

    static String Path() { // chosing path according to lives
        if (lives==6) {
            return "D:\\programming\\Projects_Java\\HangmanGame\\art\\6.text";
        }
        else if (lives==5) {
            return "D:\\programming\\Projects_Java\\HangmanGame\\art\\5.text";
        }
        else if (lives==4) {
            return "D:\\programming\\Projects_Java\\HangmanGame\\art\\4.text";
        }
        else if (lives==3) {
            return "D:\\programming\\Projects_Java\\HangmanGame\\art\\3.text";
        }
        else if (lives==2) {
            return "D:\\programming\\Projects_Java\\HangmanGame\\art\\2.text";
        }
        else if (lives==1) {
            return "D:\\programming\\Projects_Java\\HangmanGame\\art\\1.text";
        }
        else  {
            return "D:\\programming\\Projects_Java\\HangmanGame\\art\\0.text";
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        Hangman game = new Hangman(); // making obj then constructor displaying welcome screen
        // Art(Path());
        Boolean end = false;
        while(!end) {
            System.out.println(hidWord); // displaying the hidden words
            if (lives>0) { // checking lives
                if (hidWord.contains("-")) { // checking the hidden word is guess or not
                    char alphabet = sc.next().charAt(0); // taking character input by user
                    game.Start(alphabet); // checking , replacing characters , maintaining lives and displaying art according to lives
                } else { // user gussed the word
                    end = true;
                    Art("D:\\programming\\Projects_Java\\HangmanGame\\art\\congrates.text");
                    System.out.println();
                }
            } else { // 0 lives left
                end = true;
                System.out.println("Try Again");
            }
        } sc.close();
    }
}