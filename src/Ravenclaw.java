public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        checkSkillValue(mind);
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        checkSkillValue(wisdom);
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        checkSkillValue(wit);
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        checkSkillValue(creativity);
        this.creativity = creativity;
    }

    @Override
    public int sumSkill() {
        return mind + wisdom + wit + creativity;
    }

    @Override
    public String facultyName() {
        return "Когтевран";
    }

    @Override
    public String facultySkill() {
        return "ум, мудрость, остроумие и склонность к творчеству.";
    }

}
