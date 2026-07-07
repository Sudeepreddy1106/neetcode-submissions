class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int o=m-1;
        int p=n-1;
        int x=nums1.length-1;
        while(o>=0 && p>=0){
            if(nums1[o]>nums2[p]){
                nums1[x]=nums1[o];
                o--;
                x--;
            }
            else{
                nums1[x]=nums2[p];
                p--;
                x--;
            }
        }
        if(p>=0){
        for(int i=0;i<=p;i++){
            nums1[i]=nums2[i];
        }
        }
    }
}