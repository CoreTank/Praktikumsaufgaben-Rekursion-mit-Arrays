public class felderinhalt
{
    public static boolean contentCheck(char[] arr1, char[] arr2, int i)
    {
        if(i<0 || i >= arr1.length || i>= arr2.length)
        {
            throw new IllegalArgumentException();
        }
        if(i==0)
        {
            if(arr1[0]==arr2[0])
            {
                return true;
            }
            return false;
        }
        if(arr1[i]==arr2[i])
        {
            return contentCheck(arr1, arr2, i-1);
        }else
        {
            return false;
        }
    }
}
        
        
        