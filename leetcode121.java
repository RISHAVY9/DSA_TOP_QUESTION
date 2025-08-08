//121.BEST TIME TO SELL AND BUY STOCKS

https://www.youtube.com/watch?v=jQDIeuMIPGI&t=404s&pp=ygUcbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDEyMQ%3D%3D




class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
