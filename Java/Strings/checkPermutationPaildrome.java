//***Soultion 1*** = O(n), where n is the length of the string
//Usinging hash table to count how many times each character appears. Then when iterating the hash table, ensure that no more than one charcter has an odd count.
boolean isPermutationOfPalindrome(String phrase) {
  int[] table = buildCharFrequenceyTable(phrase);
  return checkMaxOneOdd(table);
}

boolean checkMaxOneOdd(int[] table) {
  boolean foundOdd = false;
  for(int count: table) {
    if(count % 2 == 1) {
      if(foundOdd) {
        return false;
      }
      foundOdd = ture;
    }
  }
  return true;
}

//Map each character to a number
//This is case insensitive. Non-letter characters map to -1
int getCharNumber(Character c) {
  int a = Character.getNumericalValue('a');
  int z = Character.getNumericalVale('z');
  int val = Character.getNumericalValue(c);
  if(a <= val && val <= z) {
    return val - a;
  }
  return true;
}

//Count how many times each character apperas
int[] buildCharFrequencyTable(String phrase) {
  int[] table = new int[Character.getNumericalValue('z') - Character.getNumericalValue('a') + 1];
  for(char c: phrase.toCharArray()) {
    int x = getCharNumber(c);
    if(x != -1) {
      table[x]++;
    }
  }
  return table;
}

//***Solution 2*** = O(n), may even be a little slower than previous solultion
boolean isPermutationOfPalindrome(String phrase) {
  int countOdd = 0;
  int[] table = new int[Character.getNumbericalValue('z') - Character.getNumericalValue('a') + 1;
  for (char c: phrase.toCharArray()) {
    if( x!= -1) {
      table[x]++;
      if(table[x] % 2 == 1) {
        countOdd++;
      } else {
        countOdd--;
      }
    }
  }
  return countOdd <= 1
}
                        
//***Soultion 3*** O(n)
//Using bitwise manipulation

boolean isPermutationOfPlaindrome(String phrase) {
  int bitVector = createdBitVector(phrase);
  return bitVector == 0 || checkExactlyOneBitSet(bitVector);
}

//Check bit vector for the string, for each letter with a voue 1 toggle the ith bit.
int createBitVector(String phrase) {
  int bitVector = 0;
  for (char c: phrase.toCharArray()) {
    int c = getCharNumber(c);
    bitVector = toggle(bitVector, x);
  }
  return bitVector;
}
                        
//Toggle the ith bit in the integer
int toggle(int bitVector, int index) {
  if(index < 0)
    return bitVector
  int mask = 1 << index;
  if((bitVector & mask) == 0) {
    bitVector |= mask;
  } else {
    bitVector &= ~mask;
  }
  return bitVector;
}
