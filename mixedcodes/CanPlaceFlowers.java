class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        } else if(flowerbed.length == 1 && n >0) {
                if(flowerbed[0]==0 ){
                    return true;
                }else {
                    return false;
                }
        } else {
            for(int i = 0;i< flowerbed.length;i++){
                if(i==0){
                    if(flowerbed[i]==0 && flowerbed[i+1] == 0 ){
                        flowerbed[i]= 1;
                        n--;
                    }
                } else if(i== flowerbed.length - 1){
                    if(flowerbed[i]==0 && flowerbed[i-1]==0){
                        flowerbed[i] = 1;
                        n--;
                    }
                } else {
                    if(flowerbed[i] ==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }
        return n <= 0? true : false;
    }
}