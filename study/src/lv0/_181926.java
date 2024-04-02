package lv0;

import java.util.Arrays;

public class _181926 {
    public int solution(int n, String control) {
        long aCount = Arrays.stream(control.split("")).filter(value -> value.equals("a")).count();
        long dCount = Arrays.stream(control.split("")).filter(value -> value.equals("d")).count();
        long wCount = Arrays.stream(control.split("")).filter(value -> value.equals("w")).count();
        long sCount = Arrays.stream(control.split("")).filter(value -> value.equals("s")).count();
        return (int) ((dCount - aCount)*10 + wCount - sCount) + n;
    }
}
