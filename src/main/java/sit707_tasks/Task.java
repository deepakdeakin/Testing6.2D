package sit707_tasks;


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
   
   public String getGradeCategory() {
       return gradeCategory;
   }
   
   public boolean isCompleted() {
       return completed;
   }
   
   public void setCompleted(boolean completed) {
       this.completed = completed;
   }
}