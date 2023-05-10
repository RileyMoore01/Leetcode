/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"
*/

---  Personal Solution ---
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int start = 0, end = words.length - 1;
        
        while (end > start)
        {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        
        s = "";
        boolean flag = true;
        for (String word : words)
        {
            if(flag)
            {
                s = word;   
                flag = false;
            }
            else if (!flag && word != "")
            {
                s = s + " " + word;
            }
        }
        
        return s;
    }
}

--------------------------------------------------------------------------------------
class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int j =0;
        int i =0;

        while(i<n ) { 
            // Finding the first space (ASCII CODE FOR SPACE IS 32)
            while(j<n && (int) arr[j] != 32)
                j++;

            //Reversing the word before space 
            swap(arr, i, j-1);

            // Reinitialising i to next letter where j left +1
            i=j+1;
            // Positioning j to find further words in string 
            j= i;
        }
        return String.valueOf(arr);
    }

    public void swap(char[] arr, int i , int j) {
        while(i<j && j<arr.length) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

-----------------------------------------------------------------------------
public class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}
