package lv0;

public class _120818 {
    public int solution(int price) {
        if(price >= 500_000) {
            return (int)(price - price * 0.2);
        } else if (price >= 300_000) {
            return (int)(price - price * 0.1);
        } else if (price >= 100_000) {
            return (int)(price - price * 0.05);
        }
        return price;
    }
}
