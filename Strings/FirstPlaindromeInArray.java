class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i = 0 ; i < words.length ; i++){
            String temp = words[i];
            boolean x = IsPalindrome(temp);
            if(x){
                return words[i];
            }
        }
        return "";
    }
    public boolean IsPalindrome(String word){
        String temp = "";
        for(int i = word.length() - 1; i >= 0; i--){
            temp = temp + word.charAt(i);
        }
        return temp.equals(word);
    }
}
