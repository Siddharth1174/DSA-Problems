//Note: This problem is as same as the "N meetings in a room problem" previously done in this topic.
//Problem Link:
https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1
//Solution:
class meeting{
    int start;
    int end;
    int pos;
    
    meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2)
    {
        if(o1.end<o2.end) return -1;
        else if(o1.end>o2.end) return 1;
        else if(o1.pos<o2.pos) return -1;
        return 1;
    }
}
class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<meeting> meet = new ArrayList<>();
        
        for(int i= 0; i<start.length; i++){
            meet.add(new meeting(start[i], end[i], i+1));
        }
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
        //System.out.println("The order in which the meetings will be performed is ");
        // for(int i = 0;i<answer.size(); i++) {
        //     System.out.print(answer.get(i) + " ");
        // }
        return answer.size();
    }
}
