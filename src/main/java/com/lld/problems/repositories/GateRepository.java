package com.lld.problems.repositories;

import com.lld.problems.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    // id , ----
    private Map<Long, Gate> gates = new TreeMap<>();
    public Optional<Gate> findGateById(Long gateId){
        // db.execute('select * from gate where gate_id = gateId');
        if(gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}

