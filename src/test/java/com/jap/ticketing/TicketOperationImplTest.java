package com.jap.ticketing;

import jdk.internal.icu.text.UnicodeSet;
import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("ALL")
class TicketOperationImplTest extends TestCase {


    class TicketOperationTest{
        TicketOperation ticketOperation;
        List<TicketData>ticketDataList;
        private String StringfileName="sample.csv";
        @BeforeEach
        void setUp(){
            ticketOperation=new TicketOperation();
            ticketDataList=ticketOperation.readTicketData();
        }
        @AfterEach
        public void tearDown(){
            ticketOperation=null;
            ticketDataList=null;
        }
        @Test
        void givenTicketDataListReturnTotalAmountCollectedThroughTickets() {
            int ticketListDataList=0;
            double actual = ticketOperation.totalAmountCollected(ticketListDataList);
            assertEquals(10348.0, actual);
        }
        @Test
        void givenEmptyTicketDataReturnZero(){
            List<TicketListData> listData=new ArrayList<>();
            double actual=ticketOperation.totalAmountCollection(listData);
            assertEquals(0.0,actual);
        }
        @Test
        void  givenTicketDataListReturnsSortedListCheckIFifteenthValue(Object ticketListDataList){
            List<TicketListData>listdata=ticketOperation.sortingByTravelledKm(ticketListDataList);
            assertEquals(42.6,listdata.get(15).getTravelled_Km());
        }
        @Test
        void readLineDataCountEqualsOrNot(UnicodeSet listactual){
            List<TicketListData>lineactual=ticketOperation.getlist("F:\\Course-5\\hackathon-4-master\\hackthon-4-master\\sample.csv");
            assertEquals(49,listactual.size());
        }

        private class TicketOperation {
            public int  totalAmountCollection(List<TicketListData> listData) {
                return Integer.parseInt(null);
            }

            public List<TicketData> readTicketData() {
                return null;
            }

            public int totalAmountCollected(int ticketListDataList) {
                return Integer.parseInt(null);
            }

            public List<TicketListData> getlist(String s) {
                return null;
            }

            public List<TicketListData> sortingByTravelledKm(Object ticketListDataList) {
                return null;
            }
        }
    }

    private class TicketData {
    }

    private class Final {
    }
}




