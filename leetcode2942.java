https://youtu.be/CT6jh3Q_uRU



class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0 ; i <words.length ; i++){
            if (words[i].contains(String.valueOf(x))){
                result.add(i);
            }
        }

        return result ; 
    }
}
