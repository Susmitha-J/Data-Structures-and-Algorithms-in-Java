class reverseWordsInString {
    public String reverseWords(String s) {
       String arr[] = s.split("\\s+");
       int pointer1 = 0, pointer2 = arr.length - 1;
       String temp;
       while(pointer1<pointer2) {
            temp = arr[pointer1];
            arr[pointer1] = arr[pointer2];
            arr[pointer2] = temp;
            pointer1++;
            pointer2--;
       }
       return String.join(" ", arr).trim();
    }
}