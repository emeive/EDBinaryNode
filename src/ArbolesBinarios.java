import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ArbolesBinarios {
    public static class EDBinaryNode<T> {
        private T data = null;
        private EDBinaryNode<T> left = null;
        private EDBinaryNode<T> right = null;


        // CONSTRUCTORES
        public EDBinaryNode(T item) {
            data=item;
        }
        public EDBinaryNode(T item, EDBinaryNode<T> lnode,
                            EDBinaryNode<T> rnode) {
            data = item;
            left = lnode;
            right = rnode;
        }
        public T data(){
            return this.data;
        }
        public EDBinaryNode<T> left(){
            return this.left;
        }
        public EDBinaryNode<T> right(){
            return  this.right;
        }

        /*public boolean hasLeft();
        public boolean hasRight();
        public boolean isLeaf();

        public T setData(T elem);
        public EDBinaryNode<T> setLeft(EDBinaryNode<T> lnode);
        public EDBinaryNode<T> setRight(EDBinaryNode<T> lnode);
        public boolean equals(Object o);*/

        public T setData(T data) {
            T old = this.data;
            this.data = data;
            return old;
        }
        public EDBinaryNode<T> setLeft(EDBinaryNode<T> left) {
            if (this.left == left)
                return this.left;
            EDBinaryNode old = this.left;
            this.left = left;
            return old;
        }
    }
}
