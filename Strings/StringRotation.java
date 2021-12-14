//String rotation - O(A+B), length of strings s1 and s2
//method isSubstring checks if one word is a substring of another
//Given s1 and s2, check if s2 is a rotation of s1 using call to isSubstring

boolean isRotation(String s1, String s2) {
    int len = s1.length();

    //Check that s1 and s2 are equal
    if(len == s2.length() && len > 0) {
        Stirng s1s1 = s1 + s1;
        return isSubstring(s1s1, s2);
    } 
    return false;
}
