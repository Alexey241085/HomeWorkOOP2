public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public int setFood(int food) {
        if (food < 0)
            System.out.println("в тарелке мало корма ");
        else
            this.food = food;
        return food;
    }

    public Plate(int food) {
        if (food <= 0)
            this.food = 0;
        else
            this.food = food;

    }
    public void info() {
        System.out.println("в тарелке осталось еды: " + food);
    }

    @Override
    public String toString() {
        return String.format("в тарелке осталось еды - %d\n \n", food ).toString();

    }

    public  int add() {
        if (food <= 5){
            food += 100;
        }
        return food;
    }
}


