import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TeacherGUI {
    
    private JFrame myframe;
    private JPanel mypanel;
    private JLabel TMLabel;
    private JLabel  TeacherIdLabel, TeacherNameLabel, AddressLabel, WorkingTypeLabel, EmploymentStatusLabel, WorkingHoursLabel, DepartmentLabel, YearsOfExperienceLabel,YearOfExperienceLabel, GradedScoreLabel, SalaryLabel, SpecilizationLabel, AcademicQualificationLabel, PerformanceIndexLabel;
    private JTextField TeacherIdTxt, TeacherNameTxt, AddressTxt, WorkingTypeTxt, EmploymentStatusTxt, WorkingHoursTxt, DepartmentTxt, YearOfExperienceTxt,GradedScoreTxt, SalaryTxt, SpecilizationTxt, AcademicQualificationTxt, PerformanceIndexTxt;
    private JButton DisplayButton, addTheLecturerButton, addTheTutorButton, GradeButton, ClearButton, setButton, removeButton;
    private boolean isLecturerAdded = false;
    private boolean isTutorAdded = false;
    private ArrayList<Teacher> teachers;

    public TeacherGUI() {
        myframe = new JFrame("TeacherGUI");
        myframe.setSize(900, 800);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mypanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.insets = new Insets(8, 8, 8, 8);
        
        TMLabel = new JLabel("Teacher Management Sytem");
        TMLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        
        TeacherIdLabel = new JLabel("Teacher ID");
        TeacherIdTxt = new JTextField(21);
        TeacherIdLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        TeacherNameLabel = new JLabel("Teacher Name");
        TeacherNameTxt = new JTextField(21);
        TeacherNameLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        AddressLabel = new JLabel("Address");
        AddressTxt = new JTextField(21);
        AddressLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        WorkingTypeLabel = new JLabel("Working Type");
        WorkingTypeTxt = new JTextField(21);
        WorkingTypeLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        EmploymentStatusLabel = new JLabel("Employment Status");
        EmploymentStatusTxt = new JTextField(21);
        EmploymentStatusLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        WorkingHoursLabel = new JLabel("Working Hours");
        WorkingHoursTxt = new JTextField(21);
        WorkingHoursLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        DepartmentLabel = new JLabel("Department");
        DepartmentTxt = new JTextField (21);
        DepartmentLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        YearOfExperienceLabel = new JLabel("Year Of Experience");
        YearOfExperienceTxt = new JTextField (21);
        YearOfExperienceLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        GradedScoreLabel = new JLabel("Graded Score");
        GradedScoreTxt = new JTextField(21);
        GradedScoreLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        SalaryLabel = new JLabel("Salary");
        SalaryTxt = new JTextField(21);
        SalaryLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        SpecilizationLabel = new JLabel("Specialization");
        SpecilizationTxt = new JTextField(21);
        SpecilizationLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        AcademicQualificationLabel = new JLabel("Academic Qualification");
        AcademicQualificationTxt = new JTextField(21);
        AcademicQualificationLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        PerformanceIndexLabel = new JLabel("Performance Index");
        PerformanceIndexTxt = new JTextField(21);
        PerformanceIndexLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        
        // Initialize ArrayList
        teachers = new ArrayList<>();
        


        addTheLecturerButton = new JButton("Add The Lecturer");
        addTheLecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Check if any of the required fields are empty
              if (TeacherIdTxt.getText().isEmpty() || TeacherNameTxt.getText().isEmpty() || AddressTxt.getText().isEmpty() || WorkingTypeTxt.getText().isEmpty() || EmploymentStatusTxt.getText().isEmpty() || GradedScoreTxt.getText().isEmpty() || YearOfExperienceTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(myframe, "Please fill in all required fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Parse the input values
                int teacherId = Integer.parseInt(TeacherIdTxt.getText());
                String teacherName = TeacherNameTxt.getText();
                String address = AddressTxt.getText();
                String workingType = WorkingTypeTxt.getText();
                String employmentStatus = EmploymentStatusTxt.getText();
                String gradedScore = GradedScoreTxt.getText();
                int yearsOfExperience = Integer.parseInt(YearOfExperienceTxt.getText());
                
                // Create a new Lecturer object
                Lecturer newLecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, gradedScore, yearsOfExperience);
                
                // Add the new Lecturer to the ArrayList
                teachers.add(newLecturer);
                 isLecturerAdded = true;
                // Display success message
                JOptionPane.showMessageDialog(myframe, "Successfully added the new Lecturer");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(myframe, "Please input numerical values for Teacher ID and Years of Experience", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
});
            
        

        addTheTutorButton = new JButton("Add The Tutor");
        addTheTutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                // Check if any of the required fields are empty
        if (TeacherIdTxt.getText().isEmpty() || TeacherNameTxt.getText().isEmpty() || AddressTxt.getText().isEmpty() || WorkingTypeTxt.getText().isEmpty() || EmploymentStatusTxt.getText().isEmpty() || WorkingHoursTxt.getText().isEmpty() || SalaryTxt.getText().isEmpty() || SpecilizationTxt.getText().isEmpty() || AcademicQualificationTxt.getText().isEmpty() || PerformanceIndexTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(myframe, "Please fill in all required fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Parse the input values
                int teacherId = Integer.parseInt(TeacherIdTxt.getText());
                String teacherName = TeacherNameTxt.getText();
                String address = AddressTxt.getText();
                String workingType = WorkingTypeTxt.getText();
                String employmentStatus = EmploymentStatusTxt.getText();
                int workingHours = Integer.parseInt(WorkingHoursTxt.getText());
                double salary = Double.parseDouble(SalaryTxt.getText());
                String specialization = SpecilizationTxt.getText();
                String academicQualifications = AcademicQualificationTxt.getText();
                int performanceIndex = Integer.parseInt(PerformanceIndexTxt.getText());
                
                // Create a new Tutor object
                Tutor newTutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                
                // Add the new Tutor to the ArrayList
                teachers.add(newTutor);
                isTutorAdded = true;
                
                // Display success message
                JOptionPane.showMessageDialog(myframe, "Successfully added the new Tutor");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(myframe, "Please input numerical values for Teacher ID, Working Hours, Salary, and Performance Index", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
            }
        });

        GradeButton = new JButton("Grade the Assignment");
        GradeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          // Get input values from text fields
        String teacherIdInput = TeacherIdTxt.getText();
        String gradedScore = GradedScoreTxt.getText();
        String department = DepartmentTxt.getText();
        String yearsOfExperience = YearOfExperienceTxt.getText();
        
        // Check if all required fields are filled
        if (teacherIdInput.isEmpty() || gradedScore.isEmpty() || department.isEmpty() || yearsOfExperience.isEmpty()) {
            JOptionPane.showMessageDialog(myframe, "Please fill in all required fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            // Parse input values
            int teacherId = Integer.parseInt(teacherIdInput);
            int gradedScoreInt = Integer.parseInt(gradedScore);
            int yearsOfExperienceInt = Integer.parseInt(yearsOfExperience);
            
            // Find the teacher with the given ID in the ArrayList
            Teacher selectedTeacher = null;
            for (Teacher teacher : teachers) {
                if (teacher.getTeacher_id() == teacherId) {
                    selectedTeacher = teacher;
                    break;
                }
            }
            
            // Check if the teacher with the given ID exists
            if (selectedTeacher != null) {
                // Check if the selected teacher is an instance of Lecturer
                if (selectedTeacher instanceof Lecturer) {
                    // Cast the selectedTeacher to Lecturer
                    Lecturer lecturer = (Lecturer) selectedTeacher;
                    
                    // Grade the assignment using the Lecturer method
                    lecturer.GradeAssignment(gradedScoreInt, department, yearsOfExperienceInt);
                    
                    // Display information dialog with entered data
                    String displayMessage = "Teacher ID: " + teacherId + "\n" +
                                            "Graded Score: " + gradedScoreInt + "\n" +
                                            "Department: " + department + "\n" +
                                            "Years of Experience: " + yearsOfExperienceInt;
                    JOptionPane.showMessageDialog(myframe, displayMessage, "Assignment Grading Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(myframe, "The selected teacher is not a Lecturer", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(myframe, "No teacher found with the entered ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(myframe, "Please input numerical values for Teacher ID, Graded Score, and Years of Experience", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});
    

                DisplayButton = new JButton("Display");
        DisplayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                // Get the teacher ID input
         String teacherIdInput = TeacherIdTxt.getText();
        String teacherName = TeacherNameTxt.getText();
        String address = AddressTxt.getText();
        String workingType = WorkingTypeTxt.getText();
        String employmentStatus = EmploymentStatusTxt.getText();
        
        String gradedScore = GradedScoreTxt.getText();
        String academicQualification = AcademicQualificationTxt.getText();
        
        // Construct the display message
        String displayMessage = "Teacher ID: " + teacherIdInput + "\n";
        displayMessage += "Teacher Name: " + teacherName + "\n";
        displayMessage += "Address: " + address + "\n";
        displayMessage += "Working Type: " + workingType + "\n";
        displayMessage += "Employment Status: " + employmentStatus + "\n";
        
        displayMessage += "Graded Score: " + gradedScore + "\n";
        displayMessage += "Academic Qualification: " + academicQualification + "\n";
        
        // Check if "Add The Lecturer" button was clicked
           if (isLecturerAdded) {
            // Additional field for lecturers
            String yearsOfExperience = YearOfExperienceTxt.getText();
            displayMessage += "Years of Experience: " + yearsOfExperience + "\n";
        }
        // Check if "Add The Tutor" button was clicked
        if (isTutorAdded) {
            // Additional fields for tutors
            String workingHours = WorkingHoursTxt.getText();
            String salary = SalaryTxt.getText();
            String specialization = SpecilizationTxt.getText();
            String performanceIndex = PerformanceIndexTxt.getText();
            
            displayMessage += "Working Hours: " + workingHours + "\n";
            displayMessage += "Salary: " + salary + "\n";
            displayMessage += "Specialization: " + specialization + "\n";
            displayMessage += "Performance Index: " + performanceIndex + "\n";
        }
        
        // Show the message dialog
        JOptionPane.showMessageDialog(myframe, displayMessage, "Teacher Information", JOptionPane.INFORMATION_MESSAGE);
    
        JOptionPane.showMessageDialog(myframe, "Successfully Displayed");
    }
        });
        
        ClearButton = new JButton("Clear");
        ClearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear the text fields
                TeacherIdTxt.setText("");
                TeacherNameTxt.setText("");
                AddressTxt.setText("");
                WorkingTypeTxt.setText("");
                EmploymentStatusTxt.setText("");
                WorkingHoursTxt.setText("");
                DepartmentTxt.setText("");
                YearOfExperienceTxt.setText("");
                GradedScoreTxt.setText("");
                SalaryTxt.setText("");
                SpecilizationTxt.setText("");
                AcademicQualificationTxt.setText("");
                PerformanceIndexTxt.setText("");
                
                JOptionPane.showMessageDialog(myframe, "Successfully Cleared");
            }
        });

        setButton = new JButton("Set");
        setButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  String teacherIdInput = TeacherIdTxt.getText();
        
        // Validate if teacher ID is not empty
        if (!teacherIdInput.isEmpty()) {
            // Parse the teacher ID to integer
            int teacherId = Integer.parseInt(teacherIdInput);
            
            // Search for the teacher with the given ID in the teachers ArrayList
            for (Teacher teacher : teachers) {
                // Check if the teacher ID matches
                if (teacher.getTeacher_id() == teacherId) {
                    // Check if the teacher is an instance of Tutor
                    if (teacher instanceof Tutor) {
                        // Cast the teacher object as Tutor
                        Tutor tutor = (Tutor) teacher;
                        
                        // Display the current salary and performance index
                        double currentSalary = tutor.getSalary();
                        int currentPerformanceIndex = tutor.getPerformance_index();
                        String message = String.format("Current Salary: %.2f\nCurrent Performance Index: %d", currentSalary, currentPerformanceIndex);
                        JOptionPane.showMessageDialog(myframe, message, "Current Details", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Get the new salary and performance index
                        String newSalaryInput = SalaryTxt.getText();
                        String newPerformanceIndexInput = PerformanceIndexTxt.getText();
                        
                        // Validate if new salary and performance index are not empty
                        if (!newSalaryInput.isEmpty() && !newPerformanceIndexInput.isEmpty()) {
                            // Parse new salary and performance index to double and int respectively
                            double newSalary = Double.parseDouble(newSalaryInput);
                            int newPerformanceIndex = Integer.parseInt(newPerformanceIndexInput);
                            
                            // Set the new salary and performance index
                            tutor.setSalaryAndCertification(newSalary, newPerformanceIndex);
                            
                            // Display the updated details
                            double updatedSalary = tutor.getSalary();
                            int updatedPerformanceIndex = tutor.getPerformance_index();
                            String updatedMessage = String.format("Updated Salary: %.2f\nUpdated Performance Index: %d", updatedSalary, updatedPerformanceIndex);
                            JOptionPane.showMessageDialog(myframe, updatedMessage, "Updated Details", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            // If new salary or performance index is empty, show error message
                            JOptionPane.showMessageDialog(myframe, "Please enter both new salary and new performance index", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        // If the teacher is not a Tutor, show error message
                        JOptionPane.showMessageDialog(myframe, "Teacher with this ID is not a Tutor", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    // Exit loop since teacher ID match found
                    return;
                }
            }
            
            // If no teacher with the entered ID is found, show error message
            JOptionPane.showMessageDialog(myframe, "Teacher with this ID does not exist", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // If teacher ID is empty, show error message
            JOptionPane.showMessageDialog(myframe, "Please enter a valid teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
                JOptionPane.showMessageDialog(myframe, "Successfully Set");
            }
        });

        removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
    
        // Get the input value of teacher ID
        String teacherIdInput = TeacherIdTxt.getText();
        
        // Validate if teacher ID is not empty
        if (!teacherIdInput.isEmpty()) {
            // Parse the teacher ID to integer
            int teacherId = Integer.parseInt(teacherIdInput);
            
            // Search for the teacher with the given ID in the teachers ArrayList
            for (Teacher teacher : teachers) {
                // Check if the teacher ID matches
                if (teacher.getTeacher_id() == teacherId) {
                    // Check if the teacher is an instance of Tutor
                    if (teacher instanceof Tutor) {
                        // Cast the teacher object as Tutor
                        Tutor tutor = (Tutor) teacher;
                        
                        // Remove the tutor
                        tutor.removeTutor();
                        
                        // Show success message
                        JOptionPane.showMessageDialog(myframe, "Tutor removed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Exit loop since teacher ID match found
                        return;
                    } else {
                        // If the teacher is not a Tutor, show error message
                        JOptionPane.showMessageDialog(myframe, "Teacher with this ID is not a Tutor", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            
            // If no teacher with the entered ID is found, show error message
            JOptionPane.showMessageDialog(myframe, "Teacher with this ID does not exist", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            // If teacher ID is empty, show error message
            JOptionPane.showMessageDialog(myframe, "Please enter a valid teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
              
            
        });

        // Adding components to the mypanel using GridBagConstraints
        
        mypanel.add(TeacherIdTxt, constraints);
        mypanel.add(TeacherIdLabel);
         mypanel.add(TeacherIdTxt);
         mypanel.add(TMLabel);
         mypanel.add(TeacherNameLabel);
        mypanel.add(TeacherNameTxt);
        mypanel.add(AddressLabel);
        mypanel.add(AddressTxt);
        mypanel.add(WorkingTypeLabel);
        mypanel.add(WorkingTypeTxt);
        mypanel.add(EmploymentStatusLabel);
        mypanel.add(EmploymentStatusTxt);
         mypanel.add(WorkingHoursLabel);
        mypanel.add(WorkingHoursTxt);
         mypanel.add( DepartmentLabel);
        mypanel.add( DepartmentTxt);
         mypanel.add(GradedScoreLabel);
        mypanel.add(GradedScoreTxt);
          mypanel.add(YearOfExperienceLabel);
        mypanel.add(YearOfExperienceTxt);
         mypanel.add( SalaryLabel);
        mypanel.add( SalaryTxt);
         mypanel.add(SpecilizationLabel);
        mypanel.add(SpecilizationTxt);
        mypanel.add(AcademicQualificationLabel);
        mypanel.add(AcademicQualificationTxt);
        mypanel.add(PerformanceIndexLabel);
        mypanel.add(PerformanceIndexTxt);
        mypanel.add(DisplayButton);
        mypanel.add(addTheLecturerButton);
        mypanel.add(addTheTutorButton);
        mypanel.add(GradeButton);
        mypanel.add(setButton);
        mypanel.add(ClearButton);        
        mypanel.add(removeButton);
    
        mypanel.setBackground(new java.awt.Color(173, 216, 230));
        
        constraints.gridx = 1;
         constraints.gridy = 0;
        mypanel.add(TMLabel, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        mypanel.add(TeacherIdLabel, constraints);
        
        constraints.gridx = 1;
        mypanel.add(TeacherIdTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        mypanel.add(TeacherNameLabel, constraints);
        
        constraints.gridx = 1;
        mypanel.add(TeacherNameTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        mypanel.add(AddressLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(AddressTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 4;
        mypanel.add(WorkingTypeLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(WorkingTypeTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 5;
        mypanel.add(EmploymentStatusLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(EmploymentStatusTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 6;
        mypanel.add(WorkingHoursLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(WorkingHoursTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 7;
        mypanel.add(DepartmentLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(DepartmentTxt, constraints);
        
          constraints.gridx = 0;
        constraints.gridy = 8;
        mypanel.add(YearOfExperienceLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(YearOfExperienceTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 9;
        mypanel.add(GradedScoreLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(GradedScoreTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 10;
        mypanel.add(SalaryLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(SalaryTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 11;
        mypanel.add(SpecilizationLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(SpecilizationTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 12;
        mypanel.add(AcademicQualificationLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(AcademicQualificationTxt, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 13;
        mypanel.add(PerformanceIndexLabel,constraints);
        
        constraints.gridx = 1;
        mypanel.add(PerformanceIndexTxt, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        mypanel.add(addTheLecturerButton, constraints);
        
           constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        mypanel.add(addTheTutorButton, constraints);
        
        
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.anchor=GridBagConstraints.CENTER;
        mypanel.add(setButton,constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 7 ;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.anchor=GridBagConstraints.CENTER;
        mypanel.add(ClearButton,constraints);
        
         constraints.gridx = 2;
        constraints.gridy = 9;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        mypanel.add(DisplayButton, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 11;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.anchor=GridBagConstraints.CENTER;
        mypanel.add(GradeButton,constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 13;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.anchor=GridBagConstraints.CENTER;
        mypanel.add(removeButton,constraints);
        
        
        
        myframe.getContentPane().add(mypanel,BorderLayout.CENTER);
        myframe.setVisible(true);
        
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}