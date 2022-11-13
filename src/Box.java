import java.util.ArrayList;

public final class Box<T extends Fruit> {

    double weight = 0;
    ArrayList<T> content = new ArrayList<>();

    public void add(T fruit) {
        this.content.add(fruit);
        this.weight = this.weight + fruit.getWeight();
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean compare(Box<? extends Fruit> box){
        return this.getWeight() == box.getWeight();
    }

    public void moveFruitsTo(Box<T> box) {
        box.content.addAll(this.content);
        this.content.clear();
        this.weight = 0;
    }

    public void display() {
        System.out.println(this.getClass().getSimpleName() + " " + this.content.size() + "x items");
    }
}
