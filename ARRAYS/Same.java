import java.util.*;

public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // boolean result=true;
        // int n = sc.nextInt();
        // int a[] = { 3, 2, 3 };
        // // int n = a.length;
        // For equaliteral triangle:
        // int left = 0;
        // int right = n - 1;
        // while (left <= right) {
        // System.out.println("L:" + left + "R:" + right);
        // if (left == right) {
        // if (a[left] != a[right - 1]) {
        // //System.out.println("Not same.");
        // break;
        // }
        // }
        // if (a[left] != a[right]) {
        // System.out.println("Not same.");
        // // result=false;
        // break;
        // }
        // left++;
        // right--;
        // }

        // For isosceles:

        sc.close();
    }
}
/*
 * class Solution {
 * static boolean same(int a[]) {
 * int n = a.length;
 * int left = 0;
 * int right = n - 1;
 * while (left <= right) {
 * //System.out.println("L:" + left + "R:" + right);
 * if (left == right) {
 * if (a[left] != a[right - 1]) {
 * //System.out.println("Not same.");
 * break;
 * }
 * }
 * if (a[left] != a[right]) {
 * // System.out.println("Not same.");
 * // result=false;
 * break;
 * }
 * left++;
 * right--;
 * }
 * return true;
 * }
 * 
 * static boolean isosceles_1(int a[]) {
 * 
 * }
 * 
 * public String triangleType(int[] nums) {
 * boolean same_1 = same(nums);
 * boolean isosceles_1 = isosceles(nums);
 * boolean scalene_1 = scalene(nums);
 * 
 * if (same_1) {
 * return "equilateral";
 * }
 * return "hellp";
 * }
 * }
 */