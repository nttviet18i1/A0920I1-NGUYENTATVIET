package abstract_class_interface.Thuc_Hanh;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " Tiger :wow wow wow";
    }

    @Override
    public String howToEat() {
        return "Ăn thịt..........animal small";
    }
}
