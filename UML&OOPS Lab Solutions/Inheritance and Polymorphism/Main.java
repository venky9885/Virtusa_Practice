import java.util.*;

class Event{
    protected String name;
    protected String detail;
    protected String type;
    protected String organiserName;
    
    public Event(){
        this.name = " ";
        this.detail = " ";
        this.type = " ";
        this.organiserName = " ";
    }
    
    public Event(String name, String detail, String type, String organiserName){
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiserName = organiserName;
    }
}

class Exhibition extends Event{
    private int noOfStalls=0;
    
    public Exhibition(){
        super();
    }

    public Exhibition(String name, String detail, String type, String organiserName){
        super(name, detail, type, organiserName);
    }

    void setNoOfStalls(int noOfStalls){
        this.noOfStalls = noOfStalls;
    }

    int getNoOfStalls(){
        return this.noOfStalls;
    }
}

class StageEvent extends Event{
    private int noOfSeats=0;

    public StageEvent(){
        super();
    }

    public StageEvent(String name, String detail, String type, String organiserName){
        super(name, detail, type, organiserName);
    }

    void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }

    int getNoOfSeats(){
        return this.noOfSeats;
    }
}

public class Main 
{
    public static void main(String [] args){
        int option;
        String name, detail, type, organiserName;
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        sc.nextLine();
        String all=sc.nextLine();
        String [] arr = all.split(",");
        name = arr[0];
        detail = arr[1];
        type = arr[2];
        organiserName = arr[3];

        if(option==1){
            int noOfStalls =(int) Integer.parseInt(arr[4]);
            Exhibition e = new Exhibition(name, detail, type, organiserName);
            e.setNoOfStalls(noOfStalls);
            System.out.println(e.name+" "+e.detail+" "+e.type+" "+e.organiserName+" "+e.getNoOfStalls());
        }
        else if(option==2){
            int noOfSeats =(int) Integer.parseInt(arr[4]);
            StageEvent s = new StageEvent(name, detail, type, organiserName);
            s.setNoOfSeats(noOfSeats);
            System.out.println(s.name+" "+s.detail+" "+s.type+" "+s.organiserName+" "+s.getNoOfSeats());
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
/*
 * Sample Input 1:
 * 1
 * Book expo,special sale,Academics,Mahesh,10
 */