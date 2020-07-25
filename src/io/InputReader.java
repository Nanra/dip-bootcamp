package io;

import java.util.Scanner;

public class InputReader {

    Scanner inputScanner = new Scanner(System.in);

    public String readText(){
        return inputScanner.nextLine();
    }

    public int readNumber() {
        return inputScanner.nextInt();
    }

    public boolean readBoolean() {
        return inputScanner.nextBoolean();
    }

}
