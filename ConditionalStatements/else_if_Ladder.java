package ConditionalStatements;
public class else_if_Ladder{
    public static void main(String[] args) {
        
    
    int age =17;
    if(age>=18){
        System.out.println("Legal adult");
    }else if(age>=60){
        System.out.println("Senior citizen");
    }else{
        System.out.println("You are a kid");
    }
}
}