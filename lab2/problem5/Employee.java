public class Employee extends Person {

    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public String getOccupation() {
        return "Employee: " + jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
