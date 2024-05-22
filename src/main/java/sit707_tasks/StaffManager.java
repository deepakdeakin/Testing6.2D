package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

public class StaffManager {
    private List<Staff> staffMembers;

    public StaffManager() {
        this.staffMembers = new ArrayList<>();
    }

    public void addStaff(Staff staff) {
        staffMembers.add(staff);
        System.out.println("Staff added successfully!");
    }

    public List<Staff> viewStaff() {
        return staffMembers;
    }

    public void removeStaff(String staffName) {
        Staff toRemove = null;
        for (Staff staff : staffMembers) {
            if (staff.getName().equals(staffName)) {
                toRemove = staff;
                break;
            }
        }
        if (toRemove != null) {
            staffMembers.remove(toRemove);
            System.out.println("Staff removed successfully!");
        } else {
            System.out.println("Staff not found!");
        }
    }
}
