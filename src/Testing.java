import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap();
        map.put(1,10);
        map.put(1,20);
        System.out.println(map);

        List<String> stringss = new ArrayList<>();

        stringss.remove(0);
    }

    public static String reverse(String str) {
        ArrayList<Character> array = new ArrayList();

        for(int i=0;i<str.length();i++) {
            array.add(str.charAt(i));
        }

        StringBuilder builder = new StringBuilder();
        while(array.size() > 0) {
            builder.append(array.remove(array.size() - 1));
        }

        return builder.toString();

    }
}
