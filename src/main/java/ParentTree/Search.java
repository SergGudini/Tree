package ParentTree;
import java.util.*;
public class Search {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Search(Tree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Human human, Rule rule) {
        for (Node t : tree) {
            if (t.human1.name.contains(human.name) && t.rule.equals(rule)) {
                result.add(t.human2.name);
            }
        }
        return result;
    }

    // метод поиска по возрасту
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Node t : tree) {

            if (t.human1.age <= age && !resultAge.contains(t.human1.name)) {
                resultAge.add(t.human1.name);
            }
        }
        return resultAge;
    }
}