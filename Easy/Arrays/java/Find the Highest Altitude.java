class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt= new int[gain.length+1];
        int j=1;
        int sum=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            alt[j]=sum;
            j++;
        }
        for(int i=0;i<alt.length;i++){
            if(alt[i]>max){
                max=alt[i];
            } 
    }
        return max;
}
}