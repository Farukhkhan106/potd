
class Solution {
    int count(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int l = -1, h = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                l = mid;
                high = mid - 1;
            } else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                h = mid;
                low = mid + 1;
            } else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (l == -1 || h == -1)
            return 0;
        return h - l + 1;
    }
}
