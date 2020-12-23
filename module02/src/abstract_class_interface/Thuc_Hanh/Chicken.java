package abstract_class_interface.Thuc_Hanh;


public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : O ó o";
    }


    @Override
    public String howToEat() {
        return "Mổ thóc .....";
    }
}
