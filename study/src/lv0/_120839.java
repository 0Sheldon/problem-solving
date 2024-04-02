package lv0;

public class _120839 {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<rsp.length(); i++) {
            char c = rsp.charAt(i);
            switch(c) {
                case '0':
                    sb.append("5");break;
                case '2':
                    sb.append("0");break;
                case '5':
                    sb.append("2");break;
            }
        }
        return sb.toString();
    }
}
