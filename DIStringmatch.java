class Solution {
    public int[] diStringMatch(String s) {
        int min = 0, max = 0;
        int n = s.length();
        int[] arr = new int[n + 1];
        int[] arr1 = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = i;
        }

        min = arr[0];
        max = arr[n];

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (curr == 'I') {
                arr1[i] = min;
                min++;
            } else {
                arr1[i] = max;
                max--;
            }
        }

        if (s.charAt(n - 1) == 'I') {
            arr1[n] = max;
        } else {
            arr1[n] = min;
        }

        return arr1;  
    }
}
