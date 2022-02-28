public class leet {
    //If s1 is in s2 of any form return true, otherwise false
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        HashMap<Character, Integer> s1map = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++)
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i),0) +1);
        
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            HashMap <Character, Integer> s2map = new HashMap<> ();
            for (int j = 0; j < s1.length(); j++) {
                s2map.put(s2.charAt(i + j), s2map.getOrDefault(s2.charAt(i + j), 0) + 1);
            }
            if (matches(s1map, s2map))
                return true;
        }
        return false;
    }
    
    public boolean matches(HashMap <Character, Integer> s1map, HashMap <Character, Integer> s2map) {
        for (char key: s1map.keySet()) {
            if (s1map.get(key) - s2map.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }
        
    //-------------------------------------------------------------------------------------------

    //Questions to ask interviewer:
    //  -If the problem is case sensitive. Is God a permutation of dog?
    //  -Is whitespace significant?


    //Solution #1: Sort the string
    String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    //----------------------------------------------------------------------------------------
    //Solution #2: Check if 2 strings have same character counts
    boolean permutation(String s, String t) {
        if(s.length() != t.length()) 
            return false;
        
        int[] letters = new int[128];
        char[] arr = s.toCharArray();
        for(char c: arr){
            letters[c]--;
        }

        for(int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if(letter[c] < 0) {
                return false;
            }
        }
        return true;
    } 
}
