package Feb_20.entity_relationship_association_crud;


public class Project {

    
    private int id;
    private String name;
    private String description;

    public Project() {
    }

    
    public Project(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    public void displayProjectDetails() {
        System.out.println("Project Details:");
        System.out.println("---------------------------");
        System.out.println("Project ID: " + id);
        System.out.println("Project Name: " + name);
        System.out.println("Description: " + description);
        System.out.println();
    }
}