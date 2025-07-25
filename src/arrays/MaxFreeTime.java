class MaxFreeTime {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] gaps = new int[n + 1];

        // gap before the first meeting
        gaps[0] = startTime[0];

        // gaps between meetings
        for (int i = 1; i < n; i++) {
            gaps[i] = startTime[i] - endTime[i - 1];
        }

        // gap after the last meeting
        gaps[n] = eventTime - endTime[n - 1];

        // sliding window of size k+1
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum += gaps[i];
        }

        int max = sum;
        for (int i = k + 1; i < gaps.length; i++) {
            sum += gaps[i] - gaps[i - k - 1];
            max = Math.max(max, sum);
        }

        return max;
    }
}
