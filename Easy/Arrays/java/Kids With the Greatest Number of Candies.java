class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxVal = candies[0];
        for (int i = 0; i <candies.length; i++) {
            if (candies[i] > maxVal) {
                maxVal = candies[i];
            }
        }
        ArrayList<Boolean> result=new ArrayList<Boolean>(candies.length);
        for(int i=0;i<candies.length;i++){
                if (candies[i]+extraCandies >= maxVal){
                   result.add(true);
                } 
                else{
                    result.add(false);
                }
            }   
         return result;
        }
}
    