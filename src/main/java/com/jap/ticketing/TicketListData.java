package com.jap.ticketing;

import java.util.Comparator;

@SuppressWarnings("ALL")
public class TicketListData implements Comparator<TicketOperationImpl> {

    private String Schedule_No;
    private String Route_No;
    private double Travelled_Km;
    private int Travelled_kM;

    public TicketListData(String schedule_no, String route_no, int ticket_from_stop_id, int ticket_from_stop_seq_no, int ticket_till_stop_id, int ticket_till_stop_seq_no, String ticket_date, String ticket_time, int total_ticket_amount, double travelled_km) {
    }

    @Override
    public String toString() {
        return "TicketListData{" +
                "schedule_no=" + Schedule_No +
                ", route_no=" + Route_No +
                ", ticket_from_stop_id=" + Ticket_from_Stop_Id +
                ", ticket_from_stop_seq_no=" + Ticket_From_Stop_Seq_No +
                ", ticket_till_stop_id=" + Ticket_Till_Stop_Id +
                ", ticket_till_stop_seq_no=" + Ticket_Till_Stop_Seq_No +
                ", ticket_date=" + Ticket_Date +
                ", ticket_time=" + Ticket_Time +
                ", total_ticket_amount=" + Total_Ticket_Amount +
                ", travelled_KM=" + Travelled_KM +
                '}';
    }

    private int Ticket_from_Stop_Id;
    private int Ticket_From_Stop_Seq_No;

    public String getSchedule_No() {
        return Schedule_No;
    }

    public void setSchedule_No(String schedule_No) {
        this.Schedule_No = schedule_No;
    }

    public String getRoute_No() {
        return Route_No;
    }

    public void setRoute_No(String route_No) {
        this.Route_No = route_No;
    }

    public int getTicket_from_Stop_Id() {
        return Ticket_from_Stop_Id;
    }

    public void setTicket_from_Stop_Id(int ticket_from_Stop_Id) {
        this.Ticket_from_Stop_Id = ticket_from_Stop_Id;
    }

    public int getTicket_From_Stop_Seq_No() {
        return Ticket_From_Stop_Seq_No;
    }

    public void setTicket_From_Stop_Seq_No(int ticket_From_Stop_Seq_No) {
        this.Ticket_From_Stop_Seq_No = ticket_From_Stop_Seq_No;
    }

    public int getTicket_till_stop_id() {
        return Ticket_Till_Stop_Id;
    }

    public void setTicket_till_stop_id(int ticket_till_stop_id) {
        this.Ticket_Till_Stop_Id = ticket_till_stop_id;
    }

    public int getTicket_till_stop_seq_no() {
        return Ticket_Till_Stop_Seq_No;
    }

    public void setTicket_till_stop_seq_no(int ticket_till_stop_seq_no) {
        this.Ticket_Till_Stop_Seq_No = ticket_till_stop_seq_no;
    }

    public String getTicket_date() {
        return Ticket_Date;
    }

    public void setTicket_date(String ticket_date) {
        this.Ticket_Date = ticket_date;
    }

    public String getTicket_time() {
        return Ticket_Time;
    }

    public void setTicket_time(String ticket_time) {
        this.Ticket_Time = ticket_time;
    }

    public int getTotal_Ticket_Amount() {
        return Total_Ticket_Amount;
    }

    public void setTotal_Ticket_Amount(int total_Ticket_Amount) {
        this.Total_Ticket_Amount = total_Ticket_Amount;
    }

    public double getTravelled_KM() {
        return Travelled_KM;
    }

    public void setTravelled_KM(double travelled_KM) {
        this.Travelled_KM = Travelled_KM;
    }

    private int Ticket_Till_Stop_Id;

    private int Ticket_Till_Stop_Seq_No;
    private String Ticket_Date;

    private String Ticket_Time;
    private int Total_Ticket_Amount;
    private double Travelled_KM;


    public TicketListData(String Schedule_No, String Route_No, int Ticket_from_Stop_Id, int Ticket_From_Stop_Seq_No, int ticket_till_stop_id, int ticket_till_stop_seq_no, String ticket_date, String ticket_time, int Total_Ticket_Amount, int travelled_KM) {
        this.Schedule_No = Schedule_No;
        this.Route_No = Route_No;
        this.Ticket_from_Stop_Id = Ticket_from_Stop_Id;
        this.Ticket_From_Stop_Seq_No = Ticket_From_Stop_Seq_No;
        this.Ticket_Till_Stop_Id = ticket_till_stop_id;
        this.Ticket_Till_Stop_Seq_No = ticket_till_stop_seq_no;
        this.Ticket_Date = ticket_date;
        this.Ticket_Time = ticket_time;
        this.Total_Ticket_Amount = Total_Ticket_Amount;
        this.Travelled_KM = Travelled_KM;
    }


    public int compare(TicketOperationImpl o1, TicketOperationImpl o2) {
        return 0;
    }


    public Object getTravelled_kM() {
        return null;
    }

    public double getTravelled_Km() {
        return Double.parseDouble(null);
    }
}
