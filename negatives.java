public class negatives{
    public static int countNegatives(int[]arr, int d, int t){
        if(d>t || d<0 || t>arr.length){
            throw new IllegalArgumentException();
        }
        if(t==d){
            if(arr[d]<0){
                return 1;
            }
            return 0;
        }
        if(arr[t]<0){
            return 1 + countNegatives(arr, d , t-1);
        }
        return 0 + countNegatives(arr, d, t-1);
    }
}
            