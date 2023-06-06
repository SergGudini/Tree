package ParentTree;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Иван Иванов",45);
        Human person2 = new Human("Мария Иванова", 40);
        Human person3 = new Human("Сергей Иванов", 10);
        Human person4 = new Human("Евгений Иванов", 15);

        Human person5 = new Human("Петр Петров", 35);
        Human person6 = new Human("Ирина Петрова", 25);
        Human person7 = new Human("Александра Петрова", 9);

        Human person8 = new Human("Владимир Владимирович", 70);

        Human person9 = new Human("Владислав Владиславов", 55);

        Tree tree = new Tree();
        tree.appendPerentChild(person1, person3);
        tree.appendPerentChild(person2, person4);
        tree.appendPerentChild(person5, person7);
        tree.appendPerentChild(person6, person7);
        tree.appendVifeHusbent(person1, person2);

        // Дети Ивана Иванова
        System.out.println("Дети " + person1.toString());
        System.out.println(new Search(tree).spend(person1, Rule.parent));
        // Дети Марии Ивановой
        System.out.println("Дети " + person2.toString());
        System.out.println(new Search(tree).spend(person2, Rule.parent));

        // Жена Ивана Иванова
        System.out.println("Жена " + person1);
        System.out.println(new Search(tree).spend(person1, Rule.wife));

        // Поиск по возрасту
        System.out.println(new Search(tree).searchAge());
    }
}