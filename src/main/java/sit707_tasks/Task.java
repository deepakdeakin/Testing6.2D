package sit707_tasks;


//Task class
public class Task {
 private String name;
 private String gradeCategory;
 private boolean completed;

 public Task(String name, String gradeCategory) {
     this.name = name;
     this.gradeCategory = gradeCategory;
     this.completed = false;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getGradeCategory() {
     return gradeCategory;
 }

 public void setGradeCategory(String gradeCategory) {
     this.gradeCategory = gradeCategory;
 }

 public boolean isCompleted() {
     return completed;
 }

 public void setCompleted(boolean completed) {
     this.completed = completed;
 }
}
