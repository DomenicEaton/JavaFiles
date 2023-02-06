import java.util.Scanner;

public class CountLetter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a sentence followed by a period: ");
    String sentence = sc.nextLine();

    int countA = 0, countE = 0, countO = 0;
    int total = sentence.length();
    for (int i = 0; i < total; i++) {
      char c = sentence.charAt(i);
      if (c == 'a' || c == 'A') {
        countA++;
      } else if (c == 'e' || c == 'E') {
        countE++;
      } else if (c == 'o' || c == 'O') {
        countO++;
      }
    }

    System.out.println("A: " + countA);
    System.out.println("AVG of A: " + (countA * 100.0 / total) + "%");
    System.out.println("E: " + countE);
    System.out.println("AVG of E: " + (countE * 100.0 / total) + "%");
    System.out.println("O: " + countO);
    System.out.println("AVG of O: " + (countO * 100.0 / total) + "%");
  }
}
