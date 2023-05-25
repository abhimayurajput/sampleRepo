
public class VowelConsonant {
	public static void vowelAndConsanant(String str){
        int vowels=0;
        int consanat=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (isVowel(ch)==true){
                vowels++;
            }else {
                consanat++;
            }
        }
        System.out.println(vowels+ " "+consanat);
    }
    public static boolean isVowel(char ch){
        Character c=Character.toUpperCase(ch);
        return c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }

    public static void main(String[] args) {
        String str="abhimanyu";

        vowelAndConsanant(str);
    }
}
