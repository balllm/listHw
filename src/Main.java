import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(18, 19, 20, 21, 20, 20));
        System.out.println(newList(list));
    }
    public static ArrayList<Integer> newList(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>(list.size());
        int key = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 20 && key == 0) {
                result.add(200);
                key = 1;
            }else{
                result.add(list.get(i));
            }
        }
        return result;
    }
}