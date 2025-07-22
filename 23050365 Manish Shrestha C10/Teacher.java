
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher
{
    private int teacher_id;
     private String teacher_name;
     private String address;
     private String working_type;
     private String employment_status;
     private int working_hour;
     
     public Teacher(int teacher_id, String teacher_name, String address, String working_type,String employment_status)
     {
         this.teacher_id=teacher_id;
         this.teacher_name=teacher_name;
         this.address=address;
         this.working_type=working_type;
         this.employment_status=employment_status;
         
     }
     
     public int getTeacher_id()
     {
         return this.teacher_id;
     }
    
     public String getTeacher_name()
     {
         return this.teacher_name;
     }
    
     public String getAddress()
     {
         return this.address;
     }
     
     public String getWorking_type()
     {
         return this.working_type;
     }
    
     public String getEmployment_status()
      {
          return this.employment_status;
      }
     public void setWorking_hour( int working_hour)
      {
          this.working_hour=working_hour;
      }
     public int getWorking_hour()
      {
          return this.working_hour;
      }
         public void displayDetails() {
        System.out.println("Teacher ID: " + teacher_id);
        System.out.println("Teacher Name: " + teacher_name);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + working_type);
        System.out.println("Employment Status: " + employment_status);

        if  (working_hour == 0) {
            System.out.println("Working Hours: Not assigned");
        } else {
            System.out.println("Working Hours: " + working_hour);
        }
    }
   

}




     
