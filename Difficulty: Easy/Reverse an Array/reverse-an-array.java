class Solution {
    public void reverseArray(int arr[]) {
         
        int i=0 , j = arr.length-1, temp;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
    }
}