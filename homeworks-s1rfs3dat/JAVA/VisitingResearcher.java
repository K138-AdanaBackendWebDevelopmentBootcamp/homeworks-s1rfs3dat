package JAVA;

public class VisitingResearcher extends Instructor{
    private double hourlySalary;

    public double getHourlySalary() {
        return hourlySalary;
    }

    public VisitingResearcher(String name, String address, String phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}
