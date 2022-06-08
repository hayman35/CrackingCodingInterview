package ArraysAndStrings;

import java.util.HashMap;

// Page 90 Question 1.1
public class IsUnique {
    public static Boolean Unique(String word){
        HashMap<Character,Integer> map = new HashMap<>();
        for (char s : word.toCharArray()){
            map.put(s,map.getOrDefault(s,0) + 1);
            if (map.get(s) >= 2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Unique("abcde"));
        System.out.println(Unique("aabb"));
        System.out.println(Unique("abcva"));
    }
}
