//Problem Link:
https://leetcode.com/problems/sort-characters-by-frequency/description/
//Solutioln:
public String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies of characters
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Create a list of map entries and sort it by frequency
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(sortedList, (a, b) -> b.getValue() - a.getValue());
        
        // Construct the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedList) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
