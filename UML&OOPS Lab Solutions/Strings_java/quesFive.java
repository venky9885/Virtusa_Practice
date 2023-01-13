import java.util.*;

public class quesFive {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // number of people in the queue
    String alphabets = sc.next(); // string of alphabets in the queue
    int i = 0; // index of the current alphabet
    while (i < n) {
      String group = String.valueOf(alphabets.charAt(i)); // start a new group with the current alphabet
      char prev = alphabets.charAt(i); // store the previous alphabet
      i++; // move to the next alphabet
      while (i < alphabets.length()) {
        char curr = alphabets.charAt(i); // store the current alphabet
        if (curr == prev + 1 || curr == prev - 1) { // check if the current alphabet is part of a sequential group
          group += curr; // add the current alphabet to the group
          prev = curr; // update the previous alphabet
          i++; // move to the next alphabet
        } else {
          break; // stop the loop if the alphabet is not part of a sequential group
        }
      }
      System.out.println(group); // print the group
    }
    sc.close();
  }
}

