public class leet {

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

    //-------------------------------------
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
