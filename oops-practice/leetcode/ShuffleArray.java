import java.util.Scanner;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int i = 0;
        int j = n + i;

        for (int k = 0; k < 2 * n; k = k + 2) {
            if (i < j) {
                arr[k] = nums[i];
                arr[k + 1] = nums[j];
                i++;
                j++;
            }
        }
        return arr;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];
        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.shuffle(nums, n);

        System.out.println("Shuffled array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

