public class BusDB {
    int count;
    int startEndCount;
    Bus[] buses=new Bus[10];
    Bus[] StartEnd=new Bus[10];

    public BusDB() {
    }

    public boolean addBus(String name,String no,String start,String end,String type,
    String seatType, String startTime,String endTime,int dist,String[]boarding ,String []drop){
        if(count<=buses.length*0.7){
            buses[count]=new Bus(name, no, start, end, type, seatType, startTime, endTime, dist, boarding, drop);
            System.out.println(name+" Bus added");
            count++;
        }
        else{
            Bus[]temp=new Bus[buses.length*2];
            for(int i=0;i<count;i++){
                temp[i]=buses[i];
            }
            buses=temp;
            buses[count]=new Bus(name, no, start, end, type, seatType, startTime, endTime, dist, boarding, drop);
            System.out.println(name+" Bus added");
            count++;
        }
        return true;
    }
    public void searchBuses(String start,String end,String timing){
        if(timing!="-")
        {
            for(int i=0,j=0;i<count;i++)
            {
                if(buses[i].start==start && buses[i].end==end && 
                buses[i].startTime.substring(0,2).equals(timing.substring(0, 2)))
                {
                    if(startEndCount<=StartEnd.length*0.7)
                    {
                        StartEnd[j]=buses[i];
                    }
                    else{
                        Bus[]temp=new Bus[StartEnd.length*2];
                        for(int k=0;k<count;k++){
                            temp[k]=StartEnd[k];
                        }
                        StartEnd=temp;
                        StartEnd[j]=buses[i];
                    }
                    j++;
                    startEndCount++;
                }
            }
        }
        else{
            for(int i=0,j=0;i<count;i++)
            {
                if(buses[i].start==start && buses[i].end==end && 
                buses[i].startTime.substring(0,2).equals(timing.substring(0, 2)))
                {
                    if(startEndCount<=StartEnd.length*0.7){
                        StartEnd[j]=buses[i];
                    }
                    else{
                        Bus[]temp=new Bus[StartEnd.length*2];
                        for(int k=0;k<count;k++){
                            temp[k]=StartEnd[k];
                        }
                        StartEnd=temp;
                        StartEnd[j]=buses[i];
                    }
                    j++;
                    startEndCount++;
                }
            }

        }
            if(startEndCount>0)
            {
            for(int i=0;i<startEndCount;i++){
                System.out.println(StartEnd[i]);;
            }
            }
            else{
                System.out.println("No Bus found");
            }
        }
        public void showBusDB(){
            for(int i=0;i<count;i++){
                System.out.println(buses[i]);
            }
        }
        
    
}

