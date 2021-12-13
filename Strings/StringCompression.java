//String Compression - Storing the repeated counts of each character
//ex1. aaabbbccdddd = a3b3c2d4

String compressedBad(String str) {
    String compressedString = "";
    int countConsecutive = 0;
    for(int i = 0; i < str.length(); i++) {
        countConsecutive++;

        //if the next character is different than current character
        if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
            compressedString += "" + str.charAt(i) + countConsecutive;
            countConsecutive = 0;
        }
    }
    return compressedString.length() < str.length() ? compressedString : str;
}
