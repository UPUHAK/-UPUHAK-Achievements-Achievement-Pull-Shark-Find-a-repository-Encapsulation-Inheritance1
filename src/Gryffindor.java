public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        checkSkillValue(nobility);
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        checkSkillValue(honor);
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        checkSkillValue(bravery);
        this.bravery = bravery;
    }

    @Override
    public int sumSkill() {
        return nobility + honor + bravery;
    }

    @Override
    public String facultySkill() {
        return "благородство, честь и храбрость.";
    }

    @Override
    public String facultyName() {
        return "Гриффиндор";
    }

}
