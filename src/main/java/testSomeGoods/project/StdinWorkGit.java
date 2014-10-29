package testSomeGoods.project;

/**
 * Created by SPankratov on 24.10.2014.
 */
// : c12:Echo.java
// How to read from standard input.
// {RunByHand}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdinWorkGit {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null && s.length() != 0)
            System.out.println(s);
        // An empty line or Ctrl-Z terminates the program
    }
} ///:~


