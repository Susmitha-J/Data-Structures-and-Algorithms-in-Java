class ReverseVowels {
    public String reverseVowels(String s) {
        char reversedVowelArr[] = s.toCharArray();
        int left = 0, right = reversedVowelArr.length - 1;
        char temp;
        while(left < right) {
            if(isVowel(reversedVowelArr[left]) && isVowel(reversedVowelArr[right])){
                    temp = reversedVowelArr[left];
                    reversedVowelArr[left] = reversedVowelArr[right];
                    reversedVowelArr[right] = temp;
                    left++;
                    right--;
            } else if(isVowel(reversedVowelArr[left]) && !isVowel(reversedVowelArr[right])){
                right--;
            } else {
                left++;
            }
        }
        return String.valueOf(reversedVowelArr);

    }

    public boolean isVowel(char c) {
         if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' ||              c=='O' ||     c=='u' || c=='U')
    {    
        return true;
    }    
    else
    {
        return false;
    }
    }
}