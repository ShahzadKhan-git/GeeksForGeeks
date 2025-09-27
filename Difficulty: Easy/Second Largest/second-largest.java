class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int secondLargest = -1;
        int largest = 0;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[largest]){
                secondLargest = largest;
                largest = i;
                
            }
            
            else if(arr[i] != arr[largest]){
                if(secondLargest==-1 || arr[i]>arr[secondLargest]){
                    secondLargest = i;
                }
            }
        }
    
    return secondLargest == -1 ? -1 : arr[secondLargest];
    }
}