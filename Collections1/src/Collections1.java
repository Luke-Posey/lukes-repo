import javax.swing.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Collections1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListCounter(list);

    }

    public static ArrayList<String> ListCounter(ArrayList<String> strings) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                map.put(ch,1);

            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }
        return list;
    }
}