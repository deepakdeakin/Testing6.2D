package sit707_tasks;

//Tutorial class
public class Tutorial {
 private String abbreviation;
 private String location;
 private String day;
 private String time;
 private String tutor;

 public Tutorial(String abbreviation, String location, String day, String time, String tutor) {
     this.abbreviation = abbreviation;
     this.location = location;
     this.day = day;
     this.time = time;
     this.tutor = tutor;
 }

 public String getAbbreviation() {
     return abbreviation;
 }

 public void setAbbreviation(String abbreviation) {
     this.abbreviation = abbreviation;
 }

 public String getLocation() {
     return location;
 }

 public void setLocation(String location) {
     this.location = location;
 }

 public String getDay() {
     return day;
 }

 public void setDay(String day) {
     this.day = day;
 }

 public String getTime() {
     return time;
 }

 public void setTime(String time) {
     this.time = time;
 }

 public String getTutor() {
     return tutor;
 }

 public void setTutor(String tutor) {
     this.tutor = tutor;
 }
}
