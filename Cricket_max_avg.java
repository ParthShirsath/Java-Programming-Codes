import java.util.*;
class Cricket{
    int no_of_innings,no_of_times_notout,total_runs;
    String name;
    Float bat_avg;
    void accept(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the player name=");
         name=sc.next();
         System.out.println("Enter the  no of Innings=");
         no_of_innings=sc.nextInt();
         System.out.println("Enter the no of times not out=");
         no_of_times_notout=sc.nextInt();
         System.out.println("Enter the Total no of Runs=");
         total_runs=sc.nextInt();
         bat_avg=(float)total_runs/(no_of_innings-no_of_times_notout);
    }
    void display()
    {
            System.out.println("Player Name="+name);
            System.out.println("No of innings="+no_of_innings);
            System.out.println("No of times not out="+no_of_times_notout);
            System.out.println("Total runs="+total_runs);
            System.out.println("Batting Average="+bat_avg);        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Limit");
        int n=sc.nextInt();
        Cricket ob[]=new Cricket[10];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Cricket();
            ob[i].accept();
        }

        float max=ob[0].bat_avg;
        int index=0;
        
        for(int i=1;i<n;i++)
        {
            if(ob[i].bat_avg>max)
            {
                max=ob[i].bat_avg;
                index=i;
            }
        }

        ob[index].display();
    }
}