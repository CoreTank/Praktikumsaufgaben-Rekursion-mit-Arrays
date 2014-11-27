public class sortierenprüfen
{
    public static boolean isSorted(int[] arr, int i)
    {
        if(i<0 || i>= arr.length)
        {
            throw new IllegalArgumentException();
        }
        if(i==0)
        {
            return true;
        }
        if(arr[i-1]<=arr[i])
        {
            return isSorted(arr, i-1);
        }
        return false;
    }
}

        