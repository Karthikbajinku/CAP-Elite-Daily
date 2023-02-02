import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        char l = t.charAt(t.length() - 2);
        t = t.substring(0, t.length() - 2);
        if (l == 'A') {
            int x = Integer.parseInt(t.substring(0, 2));
            if (x == 12) x = 0;
            String s = Integer.toString(x);
            if (s.length() == 1) {
                s = "0" + s;
            }
            System.out.println(s + t.substring(2, t.length()));
        } 
        else {
            int x = Integer.parseInt(t.substring(0, 2));
            if (x != 12) x += 12;
            String s = Integer.toString(x);
            if (s.length() == 1) {
                s = "0" + s;
            }
            System.out.println(x + t.substring(2, t.length()));
        }
    }
}

