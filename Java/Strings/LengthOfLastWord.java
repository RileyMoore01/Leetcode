class Solution {
    public int lengthOfLastWord(String s) {
        String[] tempArray = s.split(" ");
        int result = tempArray[tempArray.length - 1].length();
        return result;
    }
}
