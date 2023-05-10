public class leet {

    //Replace a whitespace in the string with a "%20"

    void replaceSpaces(char[] s, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for(i = 0; i < trueLength; i++) {
            if(s[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if(trueLength < s.length)
            s[trueLength] ='\0';
        for(i = trueLength - 1; i >= 0; i--) {
            if(s[i] == ' ') {
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';
                index = index - 3;
            } else {
                s[index - 1] = s[i];
                index--;
            }
        }
    }
}
