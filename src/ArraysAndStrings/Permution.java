package ArraysAndStrings;

import java.util.HashMap;

// Page 90 Question 1.2
public class Permution {

    public static boolean ispermu(String a, String b){
        HashMap<Character,Integer> mapA = new HashMap<>();
        HashMap<Character,Integer> mapB = new HashMap<>();
        if (a.length() != b.length()) return false;

        for (char i : a.toCharArray()){
            mapA.put(i, mapA.getOrDefault(i,0)+1);
        }

        for (char i : b.toCharArray()){
            mapB.put(i, mapB.getOrDefault(i,0)+1);
        }

        return mapA.equals(mapB);
    }

    public static void main(String[] args) {
        System.out.println(ispermu("aabb","bbaa"));
        System.out.println(ispermu("aacbb","bbaa"));
        System.out.println(ispermu("aacbb","bbaaa"));
        System.out.println(ispermu("zzppdd","zpdzpd"));
    }
}
