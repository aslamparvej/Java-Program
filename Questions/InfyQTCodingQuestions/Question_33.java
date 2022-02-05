package Questions.InfyQTCodingQuestions;

import java.util.Scanner;

public class Question_33 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total_bil = scn.nextInt();
        int discount_val = 0;
        int i,j,flag;

        for(i=0; i<=total_bil; i++){
            if(i == 0|| i == 1){
                continue;
            }
            flag = 1;
            for(j=2;j<=i/2; ++j){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                discount_val = discount_val + i;
            }
        }
        System.out.println(discount_val);
    }

}
