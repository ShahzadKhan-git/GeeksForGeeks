class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int res =0;
        for(int i=1; i<arr.length; i++){
            if(arr[res]!=arr[i]){
                res++;
                arr[res]=arr[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i <= res; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
