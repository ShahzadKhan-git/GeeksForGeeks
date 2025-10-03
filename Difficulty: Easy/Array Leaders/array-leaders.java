class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
    
        ArrayList<Integer> res = new ArrayList<>();
        int curr_lead = arr[n-1];
        res.add(curr_lead);
        
        for(int i = n-2; i>=0; i--){
            if(curr_lead<=arr[i]){
                curr_lead = arr[i];
                res.add(curr_lead);
            }
            
        }
        Collections.reverse(res);
        return res;
    }
}
