https://www.youtube.com/watch?v=gfnb3a39IZg


class Solution {
    public String largestGoodInteger(String num) {
        String maxGood = "" ;
        for(int i = 0 ; i <=num.length()-3 ; i++){
            String sub = num.substring(i , i+3);
            if ( sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2)){
                if (maxGood.equals("") || sub.compareTo(maxGood)> 0){
                    maxGood = sub;
                }
            }

        }
        return maxGood ;

    }
}
