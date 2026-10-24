class Solution {
public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {


    // Check whether the rook can capture the queen
    if (a == e) {
        if (!(c == a && Math.min(b, f) < d && d < Math.max(b, f))) {
            return 1;
        }
    }

    if (b == f) {
        if (!(d == b && Math.min(a, e) < c && c < Math.max(a, e))) {
            return 1;
        }
    }

    // Check whether the bishop can capture the queen
    if (Math.abs(c - e) == Math.abs(d - f)) {
        if (!(Math.abs(a - e) == Math.abs(b - f)
                && Math.min(c, e) < a && a < Math.max(c, e)
                && Math.min(d, f) < b && b < Math.max(d, f))) {
            return 1;
        }
    }

    return 2;
}


}
