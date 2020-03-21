package src;

public class SolutionForQ4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A;
        int[] B;
        int m = 0, n = 0;
        if (nums1.length >= nums2.length) {
            n = nums1.length;
            B = nums1;
            m = nums2.length;
            A = nums2;
        } else {
            m = nums1.length;
            A = nums1;
            n = nums2.length;
            B = nums2;
        }
        int idx1 = 0, idx2 = m;
        int half = (m + n + 1) / 2;
        int i = 0, j = 0;
        while (idx1 <= idx2) {
            i = (idx1 + idx2) / 2;
            j = half - i;
            if (i > idx1 && A[i - 1] > B[j]) {//检测i和idx的关系判断i是否接触到两端的卡点
                idx2 = i - 1;
            } else if (i < idx2 && B[j - 1] > A[i]) {
                idx1 = i + 1;
            } else {
                int left = 0, right = 0;
                if (i == 0) {
                    left = B[j - 1];
                } else if (j == 0) {
                    left = A[i - 1];
                } else {
                    left = Math.max(A[i - 1], B[j - 1]);
                }
                if((m+n)%2==1){
                    return left;//这里提前return是为了避免右侧为空的情况对于右侧的检测造成内存溢出
                }
                if (i == m) {
                    right = B[j];
                } else if (j == n) {
                    right = A[i];
                } else {
                    right = Math.min(B[j], A[i]);
                }

                return (left+right)/2.0;

            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int [] A = {};
        int [] B = {1};
        double ret = findMedianSortedArrays(A,B);
    }
}
