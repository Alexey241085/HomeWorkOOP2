public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }
    public void eat(Cat cat, Plate plate) {
        this.name = name;
        this.appetite = appetite;
        int a = plate.setFood(plate.getFood() - cat.getAppetite());
        if (a < 0) {
            System.out.printf("%s не стал(а) лопать\n", name);
            satiety = false;
            System.out.printf("%s голоден\n", name);
            System.out.println();
        } else {
            System.out.printf("%s слопал %d корма \n", name, appetite);
            satiety = true;
            System.out.printf("%s сыт(а) \n", name);
            System.out.println();

        }
    }

    @Override
    public String toString() {
        return String.format("").toString();
    }
}
