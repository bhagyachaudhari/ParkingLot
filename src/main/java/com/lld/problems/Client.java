package com.lld.problems;

import com.lld.problems.controllers.TokenController;
import com.lld.problems.repositories.GateRepository;
import com.lld.problems.repositories.ParkingLotRepository;
import com.lld.problems.repositories.TokenRepository;
import com.lld.problems.repositories.VehicleRepository;
import com.lld.problems.services.TokenService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TokenRepository tokenRepository = new TokenRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TokenService tokenService = new TokenService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                tokenRepository
        );

        TokenController tokenController = new TokenController(tokenService);

    }
}

// Issue token
// GenerateBill : Please implement this

// Controllers
// Services
// Repositories

// x -> y -> z
// Topological sorting
