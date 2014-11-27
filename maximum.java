public class maximum
{
    public static int maximum(int[] arr, int i)
    {
        if(i<0 || i>= arr.length)
        {
            throw new IllegalArgumentException();
        }
        if (i == 0)
        {
            return arr[0];
        }
        int max = maximum(arr, i-1);
        if(max<arr[i])
        {
            max=arr[i];
        }
        
        return max;
    }
}
            