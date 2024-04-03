package lv0;

import java.util.Arrays;

public class _120893 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            String s = Character.isUpperCase(c) ? String.valueOf(c).toLowerCase() : String.valueOf(c).toUpperCase();
            sb.append(s);
        }
        return sb.toString();
    }
}
