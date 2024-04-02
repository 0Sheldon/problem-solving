package lv0;

public class _120892 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for(int i=code-1; i<cipher.length(); i +=code) {
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}
