package ParentTree;
import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;

public class Tree{

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Human parent, Human children) {
        tree.add(new Node(parent, Rule.parent, children));
        tree.add(new Node(children, Rule.children, parent));
    }

    // связь муж - жена
    public void appendVifeHusbent(Human wife, Human husband) {
        tree.add(new Node(wife, Rule.wife, husband));
        tree.add(new Node(husband, Rule.husband, wife));
    }

}