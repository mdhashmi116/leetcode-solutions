class Solution {
    public int strStr(String haystack, String needle) {
      for(int i=0;i<haystack.length()-needle.length()+1;i++){
        char ch=haystack.charAt(i);
        if(ch==needle.charAt(0)){
            if(haystack.substring(i,needle.length()+i).equals(needle))
            return i;
        }
      } return -1;  
    }
}