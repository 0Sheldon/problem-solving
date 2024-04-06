package lv0;

public class _181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (String task : todo_list) {
            if(!finished[index]) {
                sb.append(task + ",");
            }
            index++;
        }
        return sb.toString().split(",");
    }
}
