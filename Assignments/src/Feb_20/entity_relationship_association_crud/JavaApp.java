package Feb_20.entity_relationship_association_crud;


public class JavaApp {

    public static void execution() {

        
        Student student = new Student(1, "bhavya", "bhavya@gmail.com", 9876543210L);

        
        student.displayStudentDetails();

    
        Project project = new Project(1, "Flight Registration System", "AI Based Java Application");

        
        student.createProject(project);      
        student.readProject();               
        student.updateProject(1, "Train Reservation System", "Spring AI Based Java Web App"); 
        student.deleteProject(1);            
        student.readProject();
    }
}