package patterns;

import java.util.Scanner;

public class Alphabet_I {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value");
        int n =sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==(n-1)/2||i==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}


