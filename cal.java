import java.util.Scanner;
public class cal {
   public static void main(String args[]) {
    System.out.println("welcome the arithmatic calculator");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter two number");
       float a = sc.nextFloat();
       float b = sc.nextFloat();
       System.out.println("please select the operator");
       System.out.println("1: addition");
       System.out.println("2: subtraction");
       System.out.println("3: multiply");
       System.out.println("4: modulo");
       System.out.println("5: divison");
       int operator = sc.nextInt();

       switch(operator) {
           case 1 : System.out.println(a+b);
           break;
           case 2 : System.out.println(a-b);
           break;
           case 3 : System.out.println(a*b);
           break;
           case 4 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println(a/b);
                   }
	    break;
           case 5 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println(a%b);
                   }
	    break; 
           default : System.out.println("Invalid Operator");
       }
   }
}
