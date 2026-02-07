public class Search_sort {
    static int first(int[] a, int target) {
        int left = 0;
        int right = a.length;
        int mid;
        int index = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (a[mid] == target) {
                right = mid - 1;
                index = mid;
            } else if (a[mid] < target) {
                left = mid + 1;
            } else if (a[mid] > target) {
                right = mid - 1;
            }
        }
        return index;
    }

    static int last(int[] a, int target) {
        int left = 0;
        int right = a.length;
        int mid;
        int index = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (a[mid] == target) {
                index = mid;
                left = mid + 1;
            } else if (a[mid] < target) {
                left = mid + 1;
            } else if (a[mid] > target) {
                right = mid - 1;
            }
        }
        return index;
    }

    static void searchRange(int[] nums, int target) {
        // int left = 0;
        // int right = nums.length;
        // int mid;
        // int result[] = new int[2];
        // int i = 0;
        // while (left <= right) {
        // mid = left + (right - left) / 2;
        // if (nums[mid] == target) {
        // System.out.print(nums[mid] + " ");
        // result[i] = mid;
        // i++;
        // if(i==2){
        // break;
        // }else if(i==1){
        // left=mid;
        // }
        // } else if (nums[mid] < target) {
        // right = mid - 1;
        // } else if (nums[mid] > target) {
        // left = mid + 1;
        // }
        // }
        // for (int j = 0; j < 2; j++) {
        // System.out.print(result[j] + " ");
        // }
        int result[] = new int[2];
        result[0] = first(nums, target);
        System.out.println("FIrst" + first(nums, target));
        result[1] = last(nums, target);
        System.out.println("LAst" + last(nums, target));
        // for (int j = 0; j < 2; j++) {
        // System.out.print(result[j] + " ");
        // }
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            // System.out.print("\nMid" + mid + "Left:" + left + "Right:" + right);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[mid] >= target && nums[left] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid + 1] <= nums[right]) {
                if (nums[mid + 1] <= target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 34 Done
        // 33 Done
        // 81 Done
        // 74 Done
        // 56 Done
        // 57
        // 912
        // H.w
        // 4 Done
        // 702
        // 704 Done
        // 315: After 2-3 days
        // 179
        // 451
        // int arr[] = {};
        // int target = 8;
        // // searchRange(arr, target);
        // System.out.println(arr.length);
        // StringBuilder str = new StringBuilder();
        // str.append(0);
        // System.out.println(str.toString());
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int result = search(arr, 4);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("The Index:" + result);
        }
    }
}
