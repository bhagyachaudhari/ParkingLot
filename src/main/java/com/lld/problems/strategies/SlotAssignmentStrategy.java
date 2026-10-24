package com.lld.problems.strategies;

import com.lld.problems.models.ParkingLot;
import com.lld.problems.models.ParkingSlot;
import com.lld.problems.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot getSlot( ParkingLot parkingLot, VehicleType vehicleType);
}
