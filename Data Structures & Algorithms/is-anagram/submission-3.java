class Solution {
    public boolean isAnagram(String s, String t) {
HashMap<Character,Integer> countS=new HashMap<>();
HashMap<Character,Integer> countT=new HashMap<>();
if(s.length()!=t.length())
{
    return false;
}
for(int i=0;i<s.length();i++)
{
    char c=s.charAt(i);
    int current=countS.getOrDefault(c,0);
    countS.put(c,current+1);
}
for(int i=0;i<t.length();i++)
{
   char c=t.charAt(i);
  int current=countT.getOrDefault(c,0);
   countT.put(c,current+1);
}
return countS.equals(countT);
    }
}
