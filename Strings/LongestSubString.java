/*

*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int res =0;
        
        //Iterate through string to find longest substring
        for(int i=0;i<s.length();i++){
                while(list.contains(s.charAt(i))){  //if list contains character
                        list.remove(0);             //Empty the list
                }
                list.add(s.charAt(i));              //Create new list
                
                res = Math.max(res,list.size());    //Find returning value
        }
        return res;
    }
}
