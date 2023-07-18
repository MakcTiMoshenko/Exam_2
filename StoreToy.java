import java.util.ArrayList;
import java.util.List;

public class StoreToy {
    public static void main(String[] args) {


        Toy toy1 = new Toy(1, "Машинка", 5);
        Toy toy2 = new Toy(2, "Конструктор Lego", 5);
        Toy toy3 = new Toy(3, "Barbie", 10);
        Toy toy4 = new Toy(4, "Мяч", 25);
        Toy toy5 = new Toy(5, "Трасформер", 15);
        Toy toy6 = new Toy(6, "Развивашки", 18);
        Toy toy7 = new Toy(7, "Кубик Рубика", 10);
        Toy toy8 = new Toy(8, "Монополия", 5);
        Toy toy9 = new Toy(9, "Кукла LOL", 5);
        Toy toy10 = new Toy(10, "Велосипед", 2);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);
        toys.add(toy7);
        toys.add(toy8);
        toys.add(toy9);
        toys.add(toy10);
        //System.out.println(toys);

        Store toyStore = new Store(toys);
        //toyStore.getToyForPrice();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
        toyStore.ForLottery();
    } 
}