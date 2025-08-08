https://www.youtube.com/watch?v=eTty8o7K2_M&t=354s&pp=ygUcbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDExONIHCQmtCQGHKiGM7w%3D%3D



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) curr.add(1);
                else curr.add(prev.get(j - 2) + prev.get(j - 1));
            }
            prev = curr;
            list.add(new ArrayList<>(curr));
        }
        return list;
    }
}
