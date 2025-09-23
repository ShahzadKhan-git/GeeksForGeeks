class CheckBit {
    static boolean checkKthBit(int n, int k) {
        int x = (1<<(k));
        if((n&x)!=0){
            return true;
        }
        else{
            return false;
        }
    }
}