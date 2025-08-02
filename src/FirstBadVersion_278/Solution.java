package FirstBadVersion_278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n, int firstBadVersion) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid, firstBadVersion)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
