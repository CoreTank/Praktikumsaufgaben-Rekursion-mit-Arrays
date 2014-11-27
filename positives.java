public class positives
{
    
    public static int countPositives(int[]arr, int d, int t)
    {
        
        if(d<0 || d>arr.length || t<d || t>=arr.length)
        {
            throw new IllegalArgumentException();
        }
        if(t==d)
        {
            if(arr[t]>=0)
            {
                return 1;
            }
            return 0;

        }
        
        if(arr[t]>=0)
        {
            return 1+countPositives(arr, d , t-1);
            
        }
        return 0+ countPositives(arr, d, t-1);

        
    }
}
