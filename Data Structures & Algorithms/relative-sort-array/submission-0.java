class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
        }
        int l=0;
        int n=0;
        boolean found= true;;
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                 found=false;
                if(arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                a.add(arr1[i]);
            }
        }
        int it=0;
        while(l<arr2.length){
            n=map.get(arr2[l]);
            for(int i=it;i<it+n;i++){
                arr1[i]=arr2[l];
            }
            it=it+n;
            l++;
        }
        Collections.sort(a);
        int j=0;
        for(int i=it;i<arr1.length;i++){
            arr1[i]=a.get(j);
            j++;
        }
        return arr1;
    }
}