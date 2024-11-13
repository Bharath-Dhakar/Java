public class Question1 {

public static void main(String[] args){
int x = 2, y = 5;
int exp1 = (x * y / x); 
int exp2 = (x * (y / x));    // (5/4) == 2   ,  ans is 4 
System.out.print(exp1 + "," + exp2);

}
}
