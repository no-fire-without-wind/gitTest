public class HelloWorld {
    public static void main(String args[]) {
        int arr[] = {-1,0,3,5,9,12};
        int aim = 9;
        int flag = search(arr,aim);
        System.out.println(flag);
    }
    public static int search(int arr[], int num){
        int lowest = 0;
        int highest = arr.length - 1;
        while(lowest <= highest){
            int mid = (lowest + highest) / 2;
            if(arr[mid] > num){
                highest = mid-1;
            }else if(arr[mid] < num){
                lowest = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}