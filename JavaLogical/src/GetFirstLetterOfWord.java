
public class GetFirstLetterOfWord {
public static void main(String[] args) {
	String str="hello abhi singh";
    String[] words=str.split(" ");
    for (String word:words){
        System.out.println(word.charAt(0));
    }
}
}
