class Solution {
    public int passThePillow(int n, int time) {
        int cycleLength = n - 1;
        int fullTrips = time / cycleLength;
        int extraTime = time % cycleLength;
        if (fullTrips % 2 == 0) {
            return 1 + extraTime;
        }
        return n - extraTime;
    }
}