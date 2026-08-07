package day5.classwork.hackerrank;

public class BS {
    public static int bs(int[] arr,int left,int right,int tar ){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==tar) return mid;
        else if(arr[mid]>tar){
            return bs(arr,left,mid-1,tar);
        }
        return bs(arr,mid+1,right,tar);

    }
    static void main() {
        int arr[]={10,20,30,40,50};
        int left=0;
        int right=arr.length-1;
        int tar=90;
        int idx=bs(arr,left,right,tar);
        System.out.println(idx);
    }


}
