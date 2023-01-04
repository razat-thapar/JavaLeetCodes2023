class Solution {
    public int minimumRounds(int[] tasks) {
        //sort the array in ascending order. 
        Arrays.sort(tasks); 
        //get count of each task .
        HashMap<Integer,Integer> taskcount = new HashMap<Integer,Integer>();
        int key=tasks[0], count=0 ,rounds=0; 
        for(int task : tasks){
            if(key!=task){
                taskcount.put(key,count);
                key=task;
                count=0;  
            }
            count++; 
        }  
        //for storing result of the last index 
        taskcount.put(key,count);
        //for each task compute the min rounds. 
        for(Map.Entry<Integer,Integer> m : taskcount.entrySet()){
            key=m.getKey();
            count=m.getValue();
            
        //case 1: count%3==0 , 3n form. so , rounds = count/3 
        if(count%3==0){
            rounds+=count/3; 
        }else if(count%3==1){
            if(count==1){
                return -1; 
            }
            rounds+= (count/3 -1)+ (count-3*(count/3-1))/2;
        }else if(count%3==2){
            rounds+=1+count/3;
        }else{
            return -1; 
        }
        //case 2: count%3==1 then check. 
        //case 3 : count%3==2
        }
        //return rounds. 
        return rounds; 
    }
}