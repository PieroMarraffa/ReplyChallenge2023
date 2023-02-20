package ClassiJava;

public class Developer {
    private String company, skills;
    private int bonus;

    public Developer(){
    }

    public Developer(String Company, String Skills, int Bonus){
        this.company = Company;
        this.skills = Skills;
        this.bonus = Bonus;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    
}
