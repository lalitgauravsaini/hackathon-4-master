package com.jap.ticketing;

import java.io.*;
import java.util.*;


@SuppressWarnings("ALL")
public class TicketOperationImpl {
    private int ticketListData;
    private int add;
    private com.jap.ticketing.TicketListData[] TicketListData;

    public static int readFile(String fileName, int list){
        List<TicketListData> tickets=new ArrayList<>();
        FileReader fileReader;
        try {
           fileReader  = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String ticketData= bufferedReader.readLine();
            while ((ticketData=bufferedReader.readLine())!=null) {
                String[] arr = ticketData.split(",");

                String Schedule_No = arr[0];
                String Route_No = arr[1];
                int Ticket_From_Stop_Id = Integer.parseInt(arr[2]);
                int Ticket_From_Stop_Seq_No = Integer.parseInt(arr[3]);
                int Ticket_Till_Stop_Id = Integer.parseInt(arr[4]);
                int Ticket_Till_Stop_Seq_No = Integer.parseInt(arr[5]);
                String Ticket_Date = arr[6];
                String Ticket_Time = arr[7];
                int Total_Ticket_Amount = Integer.parseInt(arr[8]);
                double Travelled_KM = Double.parseDouble(arr[9]);

                TicketListData ticketListData = new TicketListData(Schedule_No, Route_No, Ticket_From_Stop_Id,
                        Ticket_From_Stop_Seq_No, Ticket_Till_Stop_Id, Ticket_Till_Stop_Seq_No, Ticket_Date, Ticket_Time,
                        Total_Ticket_Amount, Travelled_KM);



            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<TicketListData>sortingByTravelledKm(List<TicketListData>tempList) {
        Comparator<TicketListData> comparator = (t1d1, t2d2) -> Double.compare((Double) t2d2.getTravelled_kM(), (Double) t1d1.getTravelled_kM());
        Collections.sort(tempList, comparator);
        return tempList;
    }
    public double totalAmountCollected(List<TicketListData>ticketListDataList) {
        TotalTicketCollection totalTicketCollection = (ticketListDataList1, total_total_amount) -> {
            double totalAmount = 0;

            for (TicketListData i : TicketListData){
                totalAmount = totalAmount + i.getTotal_Ticket_Amount();
            }
            return totalAmount;
        };
        return totalTicketCollection.totalTicketAmount(ticketListDataList, 0);
    }

     public static void main(String[] args, boolean j) {
         String fileName = "F:\\Course-5\\hackathon-4-master\\hackthon-4-master\\sample.csv";
         TicketOperationImpl obj = new TicketOperationImpl();
         List<TicketListData> obj1 = obj.getList(fileName);
         List<TicketListData> SortedList = obj.sortingByTravelKm(obj1);
         System.out.println("-----------------");
         System.out.println();
         for (TicketListData k : SortedList) ;
         System.out.println(j);
     }

    private List<TicketListData> sortingByTravelKm(List<TicketListData> obj1) {
        return null;
    }

    private List<TicketListData> getList(String fileName) {
        return null;
    }
}
















   