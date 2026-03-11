// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer> st = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            st.add(arr[i]);
        }
        return st.size();
    }
}