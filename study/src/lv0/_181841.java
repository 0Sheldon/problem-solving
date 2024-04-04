package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _181841 {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(value -> !value.contains(ex)).collect(Collectors.joining());
    }
}
