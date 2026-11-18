public class IntStack {
    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(double item) {
        top = new Node(item, top);
    }

    public double pop() {
        if(isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        double saved = top.item;
        top = top.next;
        return saved;
    }
}
