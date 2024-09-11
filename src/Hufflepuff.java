public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        checkSkillValue(hardworking);
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        checkSkillValue(loyalty);
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        checkSkillValue(honesty);
        this.honesty = honesty;
    }

    @Override
    public int sumSkill() {
        return hardworking + loyalty + honesty;
    }

    @Override
    public String facultySkill() {
        return "трудолюбие, верность и честность.";
    }

    @Override
    public String facultyName() {
        return "Пуффендуй";
    }

}
