
/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher
{
    private String Department;
    private int YearOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    public Lecturer( int teacher_id, String teacher_name, String address, String working_type,String employment_status, String Department,int YearOfExperience)     
    {
        super(teacher_id, teacher_name, address, working_type, employment_status);
        this.Department=Department;
        this.YearOfExperience=YearOfExperience;
        this.gradedScore=0;
        this.hasGraded=false;
    }
  
    public String getDepartment()
    {
        return this.Department;
    }
  
    public int getYearOfExperience()
    {
       return this.YearOfExperience; 
    }
   
    public int getGradedScore()
    {
        return this.gradedScore;
    }
     public void setGradedScore(int newGradedScore) {
        this.gradedScore = newGradedScore;
    }
        
    public boolean getHasGraded()
    {
        return this.hasGraded;
    }
    public void GradeAssignment( int gradeScore, String Department, int YearofExperience)
    {
           if (!hasGraded && YearOfExperience >= 5 && Department.equals(Department)) {
        
        
            if(gradeScore>=70){
                 gradedScore = gradeScore;
            } else if (gradeScore >= 60) {
                gradedScore = 60;
            } else if (gradeScore>= 50) {
                gradedScore = 50;
            } else if (gradeScore >= 40) {
                gradedScore = 40;
            } else {
                gradedScore = 0;
            }

            hasGraded = true;
        }
        else {
            System.out.println("Assignment not graded yet or conditions not met.");
        }
    }
   
public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + Department);
        System.out.println("Years of Experience: " + YearOfExperience);
        if (hasGraded) {
            System.out.println("Graded Score: " + gradedScore);
        } else {
            System.out.println("Graded Score: Not graded yet");
        }
    }
}

        
            
        
    

