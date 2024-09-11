public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        checkSkillValue(cunning);
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        checkSkillValue(determination);
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        checkSkillValue(ambition);
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        checkSkillValue(resourcefulness);
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        checkSkillValue(thirstForPower);
        this.thirstForPower = thirstForPower;
    }

    @Override
    public int sumSkill() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String facultyName() {
        return "Слизерин";
    }

    @Override
    public String facultySkill() {
        return "хитрость, решительность, амбициозность, находчивость и жажда власти.";
    }

}
