public abstract class Hogwarts {
    private final String name;
    private int magicPower;
    private int transgressionDistance;


    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        checkSkillValue(magicPower);
        this.magicPower = magicPower;

    }

    public void setTransgressionDistance(int transgressionDistance) {
        checkSkillValue(transgressionDistance);
        this.transgressionDistance = transgressionDistance;

    }

    public static void compareMagicPower(Hogwarts student1, Hogwarts student2) {
        if (student1 == null || student2 == null) {
            System.out.println("Вы уверены, что это ученик Хогвартса?");
        } else if (student1.magicPower > student2.magicPower) {
            System.out.println(student1.name + " обладает большей силой магии, чем " + student2.name + ".");
        } else if (student1.magicPower < student2.magicPower) {
            System.out.println(student2.name + " обладает большей силой магии, чем " + student1.name + ".");
        } else {
            System.out.println("Эти ученики имеют равную силу магии.");
        }
    }

    public static void compareTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        if (student1 == null || student2 == null) {
            System.out.println("Вы уверены, что это ученик Хогвартса?");
        } else if (student1.transgressionDistance > student2.transgressionDistance) {
            System.out.println(student1.name + " способен трансгрессировать на большее расстояние, чем " + student2.name + ".");
        } else if (student1.transgressionDistance < student2.transgressionDistance) {
            System.out.println(student2.name + " способен трансгрессировать на большее расстояние, чем " + student1.name + ".");
        } else {
            System.out.println("Ученики " + student1.name + " и " + student2.name + " способны трансгрессировать на равное расстояние.");
        }
    }

    public abstract int sumSkill();

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1 == null || student2 == null) {
            System.out.println("Вы уверены, что это ученик Хогвартса?");
        } else if (student1.getClass().equals(student2.getClass())) {
            if (student1.sumSkill() > student2.sumSkill()) {
                System.out.println(student1.name + " - более лучший ученик факультета " + student1.facultyName() + ", чем " + student2.name + ".");
            } else if (student1.sumSkill() < student2.sumSkill()) {
                System.out.println(student2.name + " - более лучший ученик факультета " + student1.facultyName() + ", чем " + student1.name + ".");
            } else {
                System.out.println("Эти ученики факультета " + student1.facultyName() + " имеют одинаковый рейтинг.");
            }
        } else {
            System.out.println("Ученики " + student1.name + " и " + student2.name + " учатся на разных факультетах.");
        }
    }

    public abstract String facultyName();

    public abstract String facultySkill();

    @Override
    public String toString() {
        return name + ", как всякий ученик Хогвартса, умеет колдовать и трансгрессировать. Кроме того, являясь представителем факультета " +
                facultyName() + ", обладает такими качествами как " + facultySkill();
    }

    public static void checkSkillValue(int skill) {
        if (skill < 0 || skill > 100) {
            throw new IllegalArgumentException("Уровень навыка не может быть меньше 0 и больше 100.");
        }
    }

}
