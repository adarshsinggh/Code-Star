public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {5,6,89,87,65,2,6,82,34,89,972,48,450,215,54,59,65};
        int target = 59;
        int ans = search(nums,target);

        System.out.println(ans);
    }

    static int search(int arr[],int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
