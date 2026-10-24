package com.lld.problems.repositories;

import com.lld.problems.models.Gate;
import com.lld.problems.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Long , ParkingLot> parkingLots = new TreeMap<>();
    public ParkingLot findParkingLotByGate(Gate gate){
        for(ParkingLot parkingLot : parkingLots.values()){
            if(getGates().contains(gate)){
                return parkingLot;
            }
        }
        return null;
    }
}
