import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatation {
	public static void main(String[] args) {
        String str="abcabcde";
        String longestSubstring="";
        int longestSubstringlength=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i=map.get(ch);
                map.clear();
            }
            if (map.size()>longestSubstringlength){
                longestSubstringlength=map.size();
                longestSubstring=map.keySet().toString();
            }
        }
        System.out.println(longestSubstring);

        /*String  longestTillNow="";
        String longestOverAll="";
        Set<Character> hs=new HashSet<>();
        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++){
            char ch=str.charAt(i);
            if (hs.contains(ch)){
                longestTillNow="";
                hs.clear();
            }else{
                hs.add(ch);
                longestTillNow=longestTillNow+ch;
            }
            if (longestTillNow.length()>longestOverAll.length()){
                longestOverAll=longestTillNow;

            }
        }
        System.out.println(longestOverAll);*/
    }
}
