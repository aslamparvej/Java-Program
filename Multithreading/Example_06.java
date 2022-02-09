package Multithreading;
import java.io.*;
import java.util.*;

public class Example_06{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String inputDigits = "";
        String inputStr = "";

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                inputDigits+=str.charAt(i);
            }else{
                inputStr+=str.charAt(i);
            }
        }
        if(inputStr.isEmpty() || inputDigits.isEmpty()){
            System.out.println(-1);
        }else{
            char[] sortedStr = inputStr.toCharArray();
            char[] sortedDigits = inputDigits.toCharArray();

            Arrays.sort(sortedStr);
            Arrays.sort(sortedDigits);

            int sumOfDigits = 0;
            for(int i=0; i<sortedDigits.length; i++){
                sumOfDigits += Character.getNumericValue(sortedDigits[i]);
            }
            int dFirst = 0,dLast = 0;  
            for(int i = 0; i<str.length(); i++){
                if(sortedDigits[0] == str.charAt(i)){
                    dFirst = i;
                    break;
                }
            }
            for(int i = 0; i<str.length(); i++){
                if(sortedDigits[sortedDigits.length -1] == str.charAt(i)){
                    dLast = i;
                    break;
                }
            }
            int first = 0,last = 0;  
            for(int i = 0; i<str.length(); i++){
                if(sortedStr[0] == str.charAt(i)){
                    first = i;
                    break;
                }
            }
            for(int i = 0; i<str.length(); i++){
                if(sortedStr[sortedStr.length -1] == str.charAt(i)){
                    last = i;
                    break;
                }
            }
            String outStr = new String(sortedStr);
            int sortedStrdif = first-last;
            int sortedDigitsdif = Math.abs(dFirst-dLast);

            System.out.println(outStr+""+sortedStrdif+":"+sumOfDigits+""+sortedDigitsdif);
        }
        
    }
}