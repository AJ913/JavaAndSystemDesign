package ConditionalStatements;

public class ternaryOperator {
    public static void main(String[] args) {
        int a= 30,b=20,c=30;
        int res=(a<b)?((a<c)? a:c) : (b<c)? b:c;
        System.out.println(res);
    }
    
}
