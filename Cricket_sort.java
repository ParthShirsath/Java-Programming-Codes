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
    static void sort_by_bat_avg(Cricket ob[],int n)
    {
        int i,pass;
        Cricket t;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(ob[i].bat_avg<ob[i+1].bat_avg)
                {
                    t=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=t;
                }
            }
        }
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

        sort_by_bat_avg(ob,n);

        for(int i=0;i<n;i++)
        ob[i].display();
    }
}