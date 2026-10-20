// Last updated: 10/20/2026, 1:06:11 PM
1// Sum of Sortable Integers
2class Solution {
3    public void calDivisor(int n, ArrayList<Integer> list){
4        for(long i=1; i*i<=n; i++){
5            if(n%i==0){
6                list.add((int)i);
7                if(n/i!=i){
8                    list.add((int)(n/i));
9                }
10            }
11        }
12    }
13    public int sortableIntegers(int[] nums) {
14        int n=nums.length;
15        ArrayList<Integer> div=new ArrayList<>();
16        calDivisor(n, div);
17        Collections.sort(div);
18        int sum=0;
19        for(int p=0; p<div.size(); p++){
20            int k=div.get(p);
21            int lastSm=-1;
22            int flag=0;
23            for(int i=0; i<n; i=i+k){
24                int smi=i;
25                int last=i;
26                int max=Integer.MIN_VALUE;
27                int min=Integer.MAX_VALUE;
28                for(int j=i; j<i+k; j++){
29                    if(nums[j]<min){
30                        min=nums[j];
31                        smi=j;
32                    }
33                    if(nums[j]>max){
34                        max=nums[j];
35                        last=j;
36                    }
37                }
38                int f=0;
39                int dip=0;
40                for(int j=i; j<i+k; j++){
41                    int curr=nums[j];
42                    int next=nums[((j+1)%k)+i];
43                    if(curr>next){
44                        dip++;
45                    }
46                }
47                if(dip>1){
48                    f=1;
49                }
50                if(f==1 || lastSm>nums[smi]){
51                    flag=1;
52                    break;
53                }
54                lastSm=nums[last];
55            }
56            if(flag==0){
57                sum+=k;
58            }
59        }
60        return sum;
61    }
62}