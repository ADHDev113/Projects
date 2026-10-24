package hw;

public class SLLNode<E> {
    E info;
    SLLNode next;
    public SLLNode(E val){
        info = val;
        next = null;
    }
    public String toString(){
        return "SLLNode(" + info + ")";
    }
}
