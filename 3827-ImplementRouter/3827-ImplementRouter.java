// Last updated: 7/9/2026, 9:47:43 AM
class Router {

    Queue<int[]> q = new LinkedList<>();
    HashSet<String> set = new HashSet<>();
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    int size;
    public Router(int memoryLimit) {
        size = memoryLimit;
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {

        String s = source + "," + destination + "," + timestamp;


        if(set.contains(s))
            return false;

        if(q.size()==size)
        {
            int[] temp=q.poll();
            
            String st = temp[0] + "," + temp[1] + "," + temp[2];
            
            set.remove(st);
            map.get(temp[1]).remove(0);
        }
        
        q.add(new int[]{source,destination,timestamp});
        set.add(s);

        map.putIfAbsent(destination, new ArrayList<>());
        map.get(destination).add(timestamp);
        
        return true;
    }
    
    public int[] forwardPacket() {

        if(q.isEmpty())
            return new int[0];
        int[] temp=q.peek();
        
        String st = temp[0] + "," + temp[1] + "," + temp[2];

        set.remove(st);

        map.get(temp[1]).remove(0);
        
        return q.poll();
    }
    
    public int getCount(int destination, int startTime, int endTime) {

    
        
        List<Integer> timeList = map.get(destination);

        if(timeList == null || timeList.size()==0)
            return 0;

        int lowerIndex = lowerBound(startTime,timeList);
        int upperIndex = upperBound(endTime,timeList);
        
        return upperIndex-lowerIndex+1;
    }

    private int lowerBound(int target, List<Integer> list) {
    int left = 0, right = list.size() - 1; 

    while(left<=right){

        int mid = (left+right)/2;

        if(list.get(mid)>=target){
            right=mid-1;
        }
        else
            left=mid+1;
        
        
    }
        return right+1;
    }
    
    private int upperBound(int target, List<Integer> list) {
        int left = 0, right = list.size() - 1;
    
        while(left<=right){

            int mid = (left+right)/2;

            if(list.get(mid)<=target){
                left=mid+1;
            }
            else
                right=mid-1;
        }

        return left-1;
    }

}

