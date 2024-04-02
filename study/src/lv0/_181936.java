package lv0;

public class _181936 {
    public int solution(int number, int n, int m) {
        return number % n != 0 || number % m !=0 ? 0 : 1;
    }
}
