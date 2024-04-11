//MY EARLIER APPROACH
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double a;
       List<Integer> list = new LinkedList<>();
       for(int i=0;i<nums1.length;i++){
           list.add(nums1[i]);
       }
       for(int i=0;i<nums2.length;i++){
           list.add(nums2[i]);
       }
          Collections.sort(list);
       if(list.size()%2==0){
           int b=(list.size())/2;
            a= (list.get(b-1)+list.get(b))/2.0;
       }
       else a=list.get(list.size()/2);



   return a ;
    }
}

//Striver efficient approach
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
         int n1 = a.length, n2 = b.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return findMedianSortedArrays(b, a);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; //dummy statement
    }

    
}