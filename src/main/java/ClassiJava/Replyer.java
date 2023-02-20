package ClassiJava;

public abstract class Replyer {

    protected String company;

    protected int bonus;

    public Replyer(){}

    public Replyer(String company, int bonus) {
        this.company = company;
        this.bonus = bonus;
    }

    protected String getCompany() {
        return company;
    }

    protected void setCompany(String company) {
        this.company = company;
    }

    protected int getBonus() {
        return bonus;
    }

    protected void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
