class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>groups=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
         String s=strs[i];
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        String sortedKey=new String(chars);
        List<String>group=groups.getOrDefault(sortedKey,new ArrayList<>());
        group.add(s);
        groups.put(sortedKey,group);
        }
        return new ArrayList<>(groups.values());
    }
}
