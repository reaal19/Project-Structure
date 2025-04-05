

package queuee;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Queuee { 
private static Queue<Integer> printQueue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = 0;
        while (true) 
        {
            System.out.print("Enter a job ID (or -99 to close): ");
            int jobID = scanner.nextInt();
            time++;   // 34an 2a2dar ad5al kaza rakam
            
            if (jobID == -99) 
            {
                System.out.println("Company is now closing");
                break;
            }
            if (jobID == 0)
            {
                System.out.println("Time t=" + time + ". No job requested");
            } 
            else 
            {
                System.out.println("Time t=" + time + ". A request for print job " + jobID + " is issued");
                
                printQueue.offer(jobID);     //  baya3rad al al user bida5alo

                if (time % 5 == 0) 
                {
                    int processedJob = printQueue.poll();   /// 34an lama ya7sab al queue maya7sab4 al zero 
                    
                    System.out.println("Time t=" + time + ". Job " + processedJob + " is processed");
                    
                }
            }
        }

        System.out.println("Remaining number of jobs in the queue: " + printQueue.size());
    }        
}