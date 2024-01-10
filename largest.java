//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0, i;
        int largest = arr[n - 1];
        for (i = 0; i < n; i++) {
            if (arr[i] == largest) {
                count++;
            }
        }
        if (count == n) {
            return -1;
        } else
            return arr[i - 1 - count];
    }
}