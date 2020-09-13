package leetcode.task605;

/**
 * @see https://leetcode-cn.com/problems/can-place-flowers/
 */
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0) return false;
        if (flowerbed.length == 1) {
            return n == 0 || flowerbed[0] == 0;
        }

        int[] myFlowerbed = new int[flowerbed.length];
        for (int i = 0; i < myFlowerbed.length; i++) {
            myFlowerbed[i] = flowerbed[i];
        }

        for (int i = 0; i < myFlowerbed.length; i++) {
            // use short circuit
            if (i > 0 && flowerbed[i - 1] == 1 || i < myFlowerbed.length - 1 && flowerbed[i + 1] == 1) {
                myFlowerbed[i] = 1;
            }
        }

        int canFlower = 0;
        int zeroCounter = 0;
        for (int i = 0; i < myFlowerbed.length; i++) {
            if (myFlowerbed[i] == 0) {
                zeroCounter++;
            }
            else {
                if (zeroCounter != 0) {
                    canFlower += (zeroCounter + 1) / 2;
                    zeroCounter = 0;
                }
            }
        }
        canFlower += (zeroCounter + 1) / 2;

        return n <= canFlower;
    }
}
