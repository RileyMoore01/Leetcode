public class isUnique {

    //Time: O(n)   Space: O(1)
    public static boolean isUnique(String s) {
        if(s.length() > 128) 
            return false;
        
        boolean[] set = new boolean[128];
        for(int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if(set[val]) {
                return false;
            }
            set[val] = true;
        }
        return true;
    }


    //We can reduce space by using a bit vector
    public static boolean isUnique2(String s) {
        int checker = 0;
        for(int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            if((checker & (1 <<val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Hello";
        boolean result = isUnique2(s);
        System.out.println(result);
    }
}
