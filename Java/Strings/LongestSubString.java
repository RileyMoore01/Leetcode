/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
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
