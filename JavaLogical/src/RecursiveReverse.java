
public class RecursiveReverse {
	 /* Function to print reverse of the passed string */
    public static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(""+str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "Geeks for Geeks";
        reverse(str);
       // RecursiveReverse obj = new RecursiveReverse();
        //obj.reverse(str);
       // System.out.println("String length:::"+str.length());
       // System.out.println("String is::::"+str);
       // System.out.println("Exclude length-1 is:::"+str.substring(0, str.length()-1));
    }
}
