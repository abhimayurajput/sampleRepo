
public class Panagram {
	  public static boolean isPanaGram(String str){
	        if (str.length()<26){
	            return false;
	        }else {
	            for (char ch = 'a'; ch <= 'z'; ch++) {
	                if (str.indexOf(ch) < 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String str="abcd efgh ijkl mnopq rstuv wxzy";


	        System.out.println(isPanaGram(str));
	    }
}
