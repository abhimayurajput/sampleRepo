
public class FactorialWithRecursion {
	 public static int factorial(int number){
	        System.out.println(number);
	        if (number==0){
	            return 1;
	        }

	        return  number *factorial(number-1);
	    }
	    public static void main(String[] args) {
	       int res= factorial(5);
	        System.out.println(res);
	    }
}
