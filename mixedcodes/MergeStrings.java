class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        char wordArr1[] = word1.toCharArray();
        char wordArr2[] = word2.toCharArray();
        int length = (wordArr1.length) +(wordArr2.length);
        char outputArr[] = new char[length];
        int i, arr1Pointer=0, arr2Pointer=0;
        for(i=0;i<length;i++){
            if(i%2 == 0){
                 if(arr1Pointer < wordArr1.length) {
                    outputArr[i] = wordArr1[arr1Pointer];
                    arr1Pointer = arr1Pointer + 1;
                 } else {
                    if(arr2Pointer < wordArr2.length) {
                        outputArr[i] = wordArr2[arr2Pointer];
                        arr2Pointer = arr2Pointer + 1;
                    }
                 }
            } else {
                 if(arr2Pointer < wordArr2.length) {
                    outputArr[i] = wordArr2[arr2Pointer];
                    arr2Pointer = arr2Pointer + 1;
                 } else {
                    if(arr1Pointer < wordArr1.length) {
                        outputArr[i] = wordArr1[arr1Pointer];
                        arr1Pointer = arr1Pointer + 1;
                    }
                 }
            }
        }
        return  String.valueOf(outputArr);
    }
}