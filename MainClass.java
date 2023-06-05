public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 15);
        Cat cat2 = new Cat("Matroskin", 20);
        Cat cat3 = new Cat("Murka", 10);
        Cat cat4 = new Cat("Pushok", 17);
        Plate plate = new Plate(40);

        Cat[] cats = new Cat[] { cat, cat2, cat3, cat4 };

        for (Cat i : cats) {
            plate.info();
            i.eat(i,plate);
            System.out.println(i);
        }

//        plate.info();
//        cat.eat(cat, plate);
//        plate.info();
//        cat2.eat(cat2,plate);
//        plate.info();
//        cat3.eat(cat3,plate);
//        plate.info();
//        cat4.eat(cat4,plate);
//        plate.info();


        plate.add();
        plate.info();

    }
}
