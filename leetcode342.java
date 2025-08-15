https://www.youtube.com/watch?v=oVPogYZpNB4&pp=ygURMzQyIGxlZXRjb2RlIGphdmE%3D

class Solution {
    public boolean isPowerOfFour(int n) {

        if (n ==1){
            return true ;
        }
        if(n==0 || n %4 != 0 ){
            return false ;
        }
        return isPowerOfFour(n/4);
        
    }
}
