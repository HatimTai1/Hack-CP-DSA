class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>arr=new ArrayList<>();
        if(numRows==0)
            return new ArrayList();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                    list.add(1);
                else{
                    list.add(arr.get(i-2).get(j)+arr.get(i-2).get(j-1));
                }
            }
           arr.add(list);
        }
      return arr;  
    }
}
