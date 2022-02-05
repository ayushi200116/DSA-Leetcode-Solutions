class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newarray=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if (i%2==0){
                newarray[i]=nums[j];
            }
            else{
                newarray[i]=nums[j+n];
                    j++;
            }     
        }
        return newarray;
    }
}