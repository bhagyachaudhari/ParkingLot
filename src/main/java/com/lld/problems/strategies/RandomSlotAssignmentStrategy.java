package com.lld.problems.strategies;

import com.lld.problems.models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{

    @Override
    public ParkingSlot getSlot(ParkingLot parkingLot, VehicleType vehicleType) {

        for(ParkingFloor parkingFloor : getParkingFloors()){
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
                if(parkingSlot.getSupportedVehicleTypes().contains(vehicleType) &&
                parkingSlot.getSlotStatus().equals(SlotStatus.EMPTY)){
                    return parkingSlot;
                }
            }
        }

        return null;
    }
}
