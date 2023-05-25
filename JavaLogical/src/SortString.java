
public class SortString {
	 public static void main(String[] args) {
	        String[] arr=new String[]{"banana","graphes","apple"};
	        for (int i=0;i<arr.length;i++){
	            String temp="";
	            for (int j=i+1;j<arr.length;j++){
	                if (arr[i].compareTo(arr[j])>0){
	                    temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	        for (String s:arr){
	            System.out.println(s);
	        }
	    }
}
