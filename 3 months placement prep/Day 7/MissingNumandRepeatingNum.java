class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int sumofRange = 0, sumofSquaresRanges = 0;
        int sumofArr = 0, sumofSquaresArr = 0;
        
        //calculating sum and sum of squares fo range 1-N
    
        for(int i=1;i<= arr.length;i++) {
            sumofRange  += i;
            sumofSquaresRanges += i * i;
        }
        
        //calculating sum and sum of squares of arr elements
        
        for(int i=0;i< arr.length;i++) {
            sumofArr += arr[i];
            sumofSquaresArr += arr[i] * arr[i];
        }
        
        int diffofXY = sumofRange - sumofArr;
        int diffofSquareSums = sumofSquaresRanges - sumofSquaresArr;
        
        int sumofXY = diffofSquareSums / diffofXY; // (x^2 - y^2 = (x+y) (x-y))
        
        int repeatingNum = (sumofXY + diffofXY)/2;
        
        int missingNum = sumofXY - repeatingNum;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(missingNum);
        list.add(repeatingNum);
        
        return list;
    }
}
