package lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _120836 {
    public int solution(int n) {
        List<Integer> list = new ArrayList();
        for(int i=2; i<=n; i++) {
            int count = 0;
            while(n % i == 0) {
                n /= i;
                count++;
            }
            count++;
            list.add(count);
        }
        int result = 1;
        for (Integer integer : list) {
            result *= integer;
        }
        return result;
    }
}
