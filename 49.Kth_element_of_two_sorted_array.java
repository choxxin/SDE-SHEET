

//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n1, int n2, int k) {
        
    if (n1 > n2) {
        return kthElement(arr2, arr1, n2, n1, k);
    }

    int low = Math.max(0, k - n2);
    int high = Math.min(n1, k);
    int left = k;

    while (low <= high) {
        int mid1 = (low + high) / 2;
        int mid2 = left - mid1;

        int l1 = mid1 > 0 ? arr1[mid1 - 1] : Integer.MIN_VALUE;
        int l2 = mid2 > 0 ? arr2[mid2 - 1] : Integer.MIN_VALUE;
        int r1 = mid1 < n1 ? arr1[mid1] : Integer.MAX_VALUE;
        int r2 = mid2 < n2 ? arr2[mid2] : Integer.MAX_VALUE;

        if (l1 <= r2 && l2 <= r1) {
            return Math.max(l1, l2);
        } else if (l1 > r2) {
            high = mid1 - 1;
        } else {
            low = mid1 + 1;
        }
    }

    return 0; // dummy return
}

        

}