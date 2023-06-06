package ParentTree;

public class Node {
    Human human1;
    Rule rule;
    Human human2;
    public Node(Human human1, Rule rule, Human human2) {
        this.human1 = human1;
        this.rule = rule;
        this.human2 = human2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", human1, rule, human2);
    }

}