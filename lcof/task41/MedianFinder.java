package lcof.task41;

import java.util.ArrayList;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/">link</a>
 */
class MedianFinder {
    ArrayList<Integer> data;

    /** initialize your data structure here. */
    public MedianFinder() {
        data = new ArrayList<>(50000);
    }

    public void addNum(int num) {
        int pos = 0;
        int left = 0, right = data.size() - 1;
        while (left <= right) {
            if (right - left == 1) {
                if (num <= data.get(left)) {
                    pos = left;
                }
                else if (num <= data.get(right)) {
                    pos = right;
                }
                else {
                    pos = right + 1;
                }
                break;
            }

            if (right == left) {
                pos = num <= data.get(left) ? left : left + 1;
                break;
            }

            int mid = left + (right - left) / 2;
            if (num == data.get(mid)) {
                pos = mid;
                break;
            }
            else if (num < data.get(mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        data.add(pos, num);
    }

    public double findMedian() {
        int size = data.size();
        if (size == 0) {
            return 0;
        }

        return size % 2 == 0 ? (data.get(size / 2 - 1) + data.get(size / 2)) / 2.0 : data.get(size / 2);
    }
}