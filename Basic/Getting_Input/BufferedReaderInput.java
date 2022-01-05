package Basic.Getting_Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderInput {
    public static void main(String[] args) throws Exception {
        System.out.println("What's your name:");
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String name = obj.readLine();
        System.out.println(name);
    }

}