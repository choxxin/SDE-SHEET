class meeting{
    int start ;
    int end;
    int pos;
    
     meeting(int start ,int end,int pos){
         this.start=start;
         this.end=end;
         this.pos=pos;
     }
    
    
}



class meetingComparator implements Comparator<meeting>{
    @Override
    public int  compare (meeting o1 ,meeting o2){
       if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
            //if ends are equal sort according to the position 
        else if(o1.pos < o2.pos)
            return -1;
        return 1; 
    }
    }

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        List<meeting> list =new LinkedList<>();
        //we are adding our start end and pos according to a obj meeting (start ,end ,pos)
        for(int i=0;i<start.length;i++){
            list.add(new meeting(start[i],end[i],i+1));
        }
        //This is the way or you can just write this also 
        //  
       // meetingComparator  mc = new meetingComparator();   //used where (void compare(meeting o1,meeting o2))
       
       // Collections.sort(list,mc);
       Collections.sort(list, new meetingComparator());
        ArrayList<Integer> answer = new ArrayList<>();
        //we should add first value initially to start the process
        answer.add(list.get(0).pos);
        
        int limit =list.get(0).end;
           //compare the next start with prev end 
           //if start is bigger then update limit and add to answer 
        for(int i =0;i<start.length;i++){
            if(list.get(i).start>limit){
                limit=list.get(i).end;
                answer.add(list.get(i).pos);
            }
        }
        
        //Return the answers size ,that will be the answer idk🤣😂
        int z=answer.size();
        
        return z;
          
    }
}
 