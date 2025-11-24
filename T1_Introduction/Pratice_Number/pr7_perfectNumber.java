import java.util.*;

class perfect_Number {

    /*a positive integer that is the equal to the sum of the its proper  positive divisor
     
     */

    static void perfect_num(int num) {

        int divisorsum =0;
        for(int i =1; i<num; i++){
            if(num%i==0){
                divisorsum+=i;
            }
        }
        if(num == divisorsum){
            System.out.println("Perfect number: "+ num);
        }else{
            System.out.println("Not perfect number: "+ num);
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        perfect_num(num);

        sc.close();
    }
}
