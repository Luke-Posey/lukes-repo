import java.util.*;

public class ReturnDuplicates {
    public static List<String> ReturnDuplicates(List<String> words) {
        List<String> list = new ArrayList<String>();
        Set<String> seen = new HashSet<String>();
        Set<String> duplicates = new HashSet<>();

        for (String s : words){
            if (!seen.contains(s)){
                seen.add(s);
            }
            else {
                duplicates.add(s);
            }
        }
        list.addAll(duplicates);
        return list;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("Hello");
        words.add("world");
        words.add("world");
        words.add("no");
        System.out.println(ReturnDuplicates(words));
    }

}


