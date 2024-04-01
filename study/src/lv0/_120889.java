package lv0;

import java.util.stream.IntStream;

public class _120889 {
    public int solution(int[] sides) {
        int[] sortedArray = IntStream.of(sides).sorted().toArray();
        int others = sortedArray[0] + sortedArray[1];
        int main = sortedArray[2];

        if(main >= others) {
            return 2;
        }
        return 1;
    }
}
