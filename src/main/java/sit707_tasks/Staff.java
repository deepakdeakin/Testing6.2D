package sit707_tasks;

//Staff class
public class Staff {
 private String name;
 private String role;

 public Staff(String name, String role) {
     this.name = name;
     this.role = role;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getRole() {
     return role;
 }

 public void setRole(String role) {
     this.role = role;
 }
}
