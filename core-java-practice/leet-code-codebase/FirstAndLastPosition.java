class Solution {
    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;
        int res[] = new int[] { -1, -1 };
        res[0] = findStart(nums, target);
        res[1] = findEnd(nums, target);
        return res;

    }

    public int findStart(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return result;

    }

    public int findEnd(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result=mid;
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
    
    }
}
