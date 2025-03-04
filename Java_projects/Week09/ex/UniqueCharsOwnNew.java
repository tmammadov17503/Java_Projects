package Week09.ex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharsOwnNew {
    public static void main(String[] args) {      
        uniqueCharsMethod(args[0]);
    }

    static void uniqueCharsMethod(String str) {
        HashMap<String, Set<Character>> cache = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (!cache.containsKey(ch)) {
               Set<Character> s = new HashSet<>();
                s.add(ch);
                cache.put(str, s);
            } else {
                cache.get(str).add(ch);
            }
        }
        System.out.println(cache);
    }
}
