import java.util.*;
class Main {
    public static boolean IsAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] Sarray = s.toCharArray();
        char[] Tarray = t.toCharArray();
        Arrays.sort(Sarray);
        Arrays.sort(Tarray);
        return Arrays.equals(Sarray, Tarray);
    }
    
    public static List<List<String>> GroupAnagrams(String[] array) {
        List<List<String>> result = new List<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String str : array) {
            // Sort each string to use as a key in the hashmap
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // If the sorted string is already in the hashmap, add the original string
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                // If not, create a new entry with the sorted string as key and a new list with the original string
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        for (List<String> list : map.values()) {
            result.add(list);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<ArrayList<String>> groupedAnagrams = GroupAnagrams(words);
        
        System.out.println("Grouped Anagrams:");
        for (ArrayList<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
