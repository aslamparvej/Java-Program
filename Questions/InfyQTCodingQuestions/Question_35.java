/* 
Largest Possible Even Number.

Form the largest even Number from the given Alphanumeric String after removing all duplicate digits.

If No even number can form print -1

case 1:
Input: Infosys@337
Output: -1

case 2: 
Input: Hello#81@21349 
Output: 984312
*/
package Questions.InfyQTCodingQuestions;

import java.util.*;

public class Question_35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = scn.next();

        int res = getLongestEvenNum(str);
        System.out.println(res);

        scn.close();
    }

    private static int getLongestEvenNum(String str) {
        char[] chars = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                if (list.contains(chars[i])) {
                    list.add(chars[i]);
                    if (Character.getNumericValue(chars[i]) % 2 == 0) flag = true;        
                }
            }
        }

        if (!flag) return -1;
        Collections.sort(list);

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Character.getNumericValue(list.get(i)) % 2 == 0) {
                temp = Character.getNumericValue(list.get(i));
                break;
            }
        }

        String res = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            if(Character.getNumericValue(list.get(i)) == temp) continue;
            res+=list.get(i);
        }
        res+=temp;

        return Integer.parseInt(res);
    }
}