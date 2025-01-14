import java.util.HashMap;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "hello";
        words[1] = "world";
        words[2] = "I";
        words[3] = "Am";
        words[4] = "world";
        HashMap<String, Integer> map = duplicates(words);
        System.out.println(map);

    }


    public static HashMap<String, Integer> duplicates(String[] words) {
        //create a map that holds a string to int key value pairing.
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));
        //loop through the list of words
        for (int i = 0; i < words.length; i += 1) {
            // first iteration we have seen no words, so its mostly about getting all the keys.
            // we could iterate through the list of words, make a set, and then remove that index from
            // the list and then assign it to our map with a starting value of 1, then loop through each
            // word in the set to see if it's still in the list of words and if it is then increment that key
            // by one
            String word = words[i];
            if (!set.contains(word)) {
                set.add(word);
                map.put(word, 1);
                list.remove(i);
            } else {
                if (list.contains(word)) {
                    int amount = map.get(word);
                    amount += 1;
                    map.put(word, amount);
                    list.remove(i);
                }

            }


        }
       // return the map of our string int key values.
       // return map

        return map;

    }

}
