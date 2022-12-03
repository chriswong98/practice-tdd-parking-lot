package com.parkinglot;

import java.util.ArrayList;

public class StandardParkingBoy {
    private ArrayList<ParkingLot> parkingLotList;

    public StandardParkingBoy(ParkingLot parkingLot){
        parkingLotList = new ArrayList<>();
        parkingLotList.add(parkingLot);
    }

    public ParkingTicket park(Car car){
        for(ParkingLot parkingLot:  parkingLotList){
            if(parkingLot.checkAvailable())
                return parkingLot.park(car);
        }
       return null;
    }

    public Car fetch(ParkingTicket ticket) {
        for(ParkingLot parkingLot:  parkingLotList){
            if(!parkingLot.isUnrecognizeedTicket(ticket))
                return parkingLot.fetch(ticket);
        }
        return null;
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot);
    }
}
