import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Store {
    private List<Toy> toys;

    public Store(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToy() {
        ToyChose random = new ToyChose();
        Toy toy = random.chooseOnWeight(toys);
        System.out.println(toy);
        return toy;
    }

    public void ForLottery() {
        Toy to = getToy();
        String text = to.toString();
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(to);
    }
}
