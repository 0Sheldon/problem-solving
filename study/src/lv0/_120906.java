package lv0;

public class _120906 {
    public int solution(int n) {
        int sum = 0;
        while(n > 0) {
            sum  += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 1234;
        int sum =0;
        while(number > 0) {
            sum  += number % 10;
            number /= 10;
        }
        System.out.println("sum = " + sum);
    }
}
