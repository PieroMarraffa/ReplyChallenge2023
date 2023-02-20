package ClassiJava;

public class ProjectManager {
    
    private String company;
    private int bonus;

    public ProjectManager(){
    }

    public ProjectManager(String Company, String Skills, int Bonus){
        this.company = Company;
        this.bonus = Bonus;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
