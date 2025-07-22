/**
 * Write a description of class Tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutor extends Teacher
{
    public double salary;  
    public String specialization;
    public String academic_qualifications;
    public int performance_index;
    public boolean isCertified;  

   
    public Tutor(int teacher_id, String teacher_name, String address, String working_type, String employment_status,
    int working_hour, double salary, String specialization, String academic_qualifications,
    int performance_index) {
        super(teacher_id, teacher_name, address, working_type, employment_status);
        this.setWorking_hour(working_hour);
        this.salary = salary;
        this.specialization = specialization;
        this.academic_qualifications = academic_qualifications;
        this.performance_index = performance_index;
        this.isCertified = false;
    }

   
    public double getSalary() {
        return this.salary;
    }

    public String getSpecialization() {  
        return this.specialization;
    }

    public String getAcademic_qualifications() {
        return this.academic_qualifications;
    }

    public int getPerformance_index() {
        return this.performance_index;
    }

    public boolean getisCertified() {  
        return this.isCertified;
    }

   
    public void setSalaryAndCertification(double newSalary, int newPerformance_index) {
        if (newPerformance_index > 5 && getWorking_hour() > 20) {
            double appraisalPercentage;
            if (newPerformance_index >= 5 && newPerformance_index <= 7) {
                appraisalPercentage = 0.05;
            } else if (newPerformance_index >= 8 && newPerformance_index <= 9) {
                appraisalPercentage = 0.1;
            } else {
                appraisalPercentage = 0.2;
            }

            salary = newSalary + (appraisalPercentage * newSalary);
            isCertified = true;
        } else {
            System.out.println("Salary cannot be approved. Tutor is not certified yet.");
        }
    }

   
    public void removeTutor() {
        if (!isCertified) {
            salary = 0;
            specialization = "";
            academic_qualifications = "";
            performance_index = 0;
            isCertified = false;
        }
    }
   
    public void displayDetails() {
        super.displayDetails();

        if (isCertified) {
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academic_qualifications);
            System.out.println("Performance Index: " + performance_index);
        }
    }
    
} 