package lv0;

public class _120829 {
    public int solution(int angle) {
        int result;
        if(angle < 90) { result = 1;}
        else if(angle == 90) { result = 2;}
        else if(angle < 180) { result = 3;}
        else { result = 4;}
        return result;
    }


    public static void main(String[] args) {
        new _120829().solution(91);
        new _120829().solution(70);
        new _120829().solution(180);

    }
}
