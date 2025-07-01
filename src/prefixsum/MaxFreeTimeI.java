package prefixsum;

public class MaxFreeTimeI {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int[] gaps = getGaps(eventTime, startTime, endTime);
        long windowSum = 0;
        for (int i = 0; i <= k; i++) windowSum += gaps[i];
        long ans = windowSum;
        for (int i = k + 1; i < gaps.length; i++) {
            windowSum += gaps[i] - gaps[i - k - 1];
            ans = Math.max(ans, windowSum);
        }
        return (int) ans;
    }

    private int[] getGaps(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] gaps = new int[n + 1];
        gaps[0] = startTime[0];
        for (int i = 1; i < n; i++) gaps[i] = startTime[i] - endTime[i - 1];
        gaps[n] = eventTime - endTime[n - 1];
        return gaps;
    }
}
