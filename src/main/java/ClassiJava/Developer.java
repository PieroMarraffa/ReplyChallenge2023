package ClassiJava;

public class Developer extends Replyer{
    private String skills;

    public Developer(){
    }

    public Developer(String Company, String Skills, int Bonus){
        super(Company, Bonus);
        this.skills = Skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
