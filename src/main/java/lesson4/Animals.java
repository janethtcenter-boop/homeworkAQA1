package lesson4;

public class Animals {
    String name;
    public Animals (String name){
        this.name = name;
    }
    public void animalInfo () {
        System.out.println("Животное:" + name);
    }
    public void run (int distance) {
        System.out.println("Животное бежит");
    }
    public void swim (int distance) {
        System.out.println("Животное плывет");
    }
    public void eat (int portion) {
        System.out.println("Животное кушает");
    }
}
class Cat extends Animals {
    private final int MAX_RUN_DISTANCE = 200;
    private boolean isHungry;
    static int CatCount = 0;
    public Cat(String name) {
        super(name);
        this.isHungry = true;
    }
    @Override
    public void run (int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + "бежит" + distance + "м.Успешно!");
        } else {
            System.out.println(name + "не может бежать.Максимум: " + MAX_RUN_DISTANCE + "м." );
        }
    }
    @Override
    public void swim (int distance) {
        System.out.println(name + "не умеет плавать");
    }
    @Override
    public void eat (int foodAmount) {
        if (foodAmount > 0){
            System.out.println(name + "кушать" + foodAmount + "Успешно!");
        } else {
            System.out.println(name + "не может кушать");
        }
    }
    public boolean isHungry (int portion) {
        return isHungry || portion == 0;
    }
    public void feed (int portion) {
        if (portion > 0) {
            portion += portion;
            isHungry = false;
            System.out.println(name + "покушал/сыт");
        }
    }
    public void addFood (String Food) {
        System.out.println("Добавлена еда: + Food");
    }
}
class Dog extends Animals {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    static int DogCount = 0;
    public Dog(String name) {
        super(name);
    }
    public static int getDogCount() {
        return DogCount;
    }
}



