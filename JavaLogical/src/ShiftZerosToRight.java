import java.util.Arrays;

public class ShiftZerosToRight {
	public static void main(String[] args) {
        int[] arr={1,1,0,1,0,1};
        int[] result=new int[arr.length];
        int count=0;
        for (int num:arr){
            if (num!=0){
                result[count]=num;
                count++;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
