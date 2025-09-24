class Solution {
    public String capitalizeTitle(String title) {
        // Step 1: split into words
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();
        
        // Step 2: process each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase(); // make all lowercase
            
            if (word.length() > 2) {
                // Capitalize first char if length > 2
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            // Add processed word
            result.append(word);
            
            // Add space except for last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        // Step 3: return result
        return result.toString();
    }
}
