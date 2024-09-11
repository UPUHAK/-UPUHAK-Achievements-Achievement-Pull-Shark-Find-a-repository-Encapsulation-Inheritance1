public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 55, 30, 42, 55, 36);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 60, 65, 70, 60, 67);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 25, 30, 47, 48, 50);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 25, 35, 45, 34, 56);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 55, 60, 45, 48, 51);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 25, 40, 45, 25, 35);
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 35, 30, 42, 43, 41, 39);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 45, 43, 48, 52, 57, 30);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 50, 45, 60, 40, 39, 25);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 66, 65, 30, 50, 45, 50, 60);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 40, 30, 28, 35, 20, 15, 20);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 15, 30, 45, 55, 30, 10, 30);

        System.out.println(harryPotter);

        System.out.println(hermioneGranger.getBravery());
        hermioneGranger.setBravery(68);
        System.out.println(hermioneGranger.getBravery());
        cedricDiggory.setMagicPower(56);
        System.out.println(cedricDiggory.getMagicPower());

        Hogwarts.compareMagicPower(dracoMalfoy, zachariasSmith);

        Hogwarts.compareTransgressionDistance(justinFinchFletchley, marcusBelby);

        Hogwarts.compareStudents(grahamMontague, gregoryGoyle);

        Hogwarts.compareStudents(ronWeasley, choChang);

        System.out.println("padmaPatil.getCreativity() = " + padmaPatil.getCreativity());


    }
}