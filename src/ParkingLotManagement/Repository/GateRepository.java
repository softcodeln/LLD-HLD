package ParkingLotManagement.Repository;

import ParkingLotManagement.models.Gate;

import java.util.Date;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeMap;

public class GateRepository {
    TreeMap<Long, Gate> gateStore = new TreeMap<>();
    Long previousId = 0l;

    public Gate save(Gate gate) {
        gate.setId(previousId++);
        gateStore.put(gate.getId(), gate);
        gate.setCreatedAt(new Date());
        gate.setUpdatedAt(new Date());
        return gate;
    }

//    public Gate getGateById(Long id){
//        // Db connection: Select * From table_gate Where id = 'gate_id';
//        if (gateStore.containsKey(id)) {
//            return gateStore.get(id);
//        }
//        return null;
//    }

    public Optional<Gate> getGateById(Long id){
        // Db connection: Select * From table_gate Where id = 'gate_id';
        if (gateStore.containsKey(id)) {
            return Optional.of(gateStore.get(id));
        }
        return Optional.of(null);
    }
}
