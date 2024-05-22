package sit707_tasks;

import java.util.HashMap;
import java.util.Map;

public class UnitManager {
    private Map<String, Unit> units;

    public UnitManager() {
        this.units = new HashMap<>();
    }

    public void createUnit(String unitCode, String unitName) {
        if (units.containsKey(unitCode)) {
            System.out.println("Unit already exists!");
            return;
        }
        units.put(unitCode, new Unit(unitCode, unitName));
        System.out.println("Unit created successfully!");
    }

    public Unit viewUnit(String unitCode) {
        return units.get(unitCode);
    }

    public void updateUnit(String unitCode, String unitName) {
        Unit unit = units.get(unitCode);
        if (unit == null) {
            System.out.println("Unit not found!");
            return;
        }
        unit.setUnitName(unitName);
        System.out.println("Unit updated successfully!");
    }

    public void deleteUnit(String unitCode) {
        if (units.remove(unitCode) != null) {
            System.out.println("Unit deleted successfully!");
        } else {
            System.out.println("Unit not found!");
        }
    }
}
