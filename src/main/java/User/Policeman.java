package User;

public class Policeman {
    protected  String position;
    protected  Integer numberOfBadge;
    protected  Integer salary;
    protected  String levelOfEducation;
    public boolean isBusy;


    public Policeman(String position, Integer numberOfBadge, Integer salary, String levelOfEducation){
        this.position = position;
        this.numberOfBadge = numberOfBadge;
        this.salary = salary;
        this.levelOfEducation = levelOfEducation;
        this.isBusy = false;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getNumberOfBadge() {
        return numberOfBadge;
    }

    public void setNumberOfBadge(Integer numberOfBadge) {
        this.numberOfBadge = numberOfBadge;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }
}
