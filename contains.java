public class contains
{
    public static boolean contains(int [] arr, int i, int x)
    {
        if(i<0 || i>= arr.length)
        {
            throw new IllegalArgumentException();
        }

        if(i==0)
        {
            if(arr[i]==x)
            {
                return true;
            }
            return false;
        }

        if(arr[i]==x)
        {
           return true;
        }
         return contains(arr, i-1, x);

    }
}
