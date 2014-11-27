public class sdq{
    public static int sdq(int[] arr, int i){
        if(i==0){
            return arr[i]*arr[i];
        }
        return arr[i]*arr[i]+ sdq(arr, i-1);
    }
}