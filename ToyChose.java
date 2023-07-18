import java.util.List;

public class ToyChose {
    public Toy chooseOnWeight(List<Toy> toys) {
        double completeWeight = 0.0;
        for (Toy toy : toys)
            completeWeight += toy.getCount();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getCount();
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException("Не показывать");
    }
}
    

