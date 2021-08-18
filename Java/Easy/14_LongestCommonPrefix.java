class Solution {
    public String longestCommonPrefix(String[] strs) {
        //string to return 
        String prefix = "";
        //edge case: passed an empty array 
        if(strs == null || strs.length == 0){
            return prefix;
        }
        
        int index = 0; 
        //loop through chars in first string
        for(char c: strs[0].toCharArray()){
            //loop through other strings in strs
            for(int i = 1; i<strs.length; i++){
                //if we've covered entire string or a character doesn't match
                if(index >= strs[i].length() || c != strs[i].charAt(index)){
                    return prefix;
                }
            }
            //add the character 
            prefix += c;
            index++;
        }
        return prefix;
    }
}
