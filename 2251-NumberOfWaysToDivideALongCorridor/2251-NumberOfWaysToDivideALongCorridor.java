// Last updated: 7/9/2026, 9:51:53 AM
class Solution {
    public int numberOfWays(String corridor) {
        char[] arr = corridor.toCharArray();
        long ans=1;
        int sCount =0, index=0, end=arr.length-1;
        while(index<=end && arr[index]=='P') index++; 
        while(end>=index && arr[end]=='P') end--; 
        while(index<=end){
            if(arr[index]=='S') {sCount++; index++;}
            else{
                if(sCount%2==0) { 
                    int pCount=0;
                    while(index<end && arr[index]=='P'){
                        pCount++;
                        index++;
                    }
                    ans=(ans*(pCount+1))%1000000007;;
                }
                else index++;
            }
        }
        if(sCount%2!=0 || sCount==0) return 0;
        return (int)ans;
    }
}