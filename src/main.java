import java.util.ArrayList;

public class main {
    public static void inOrderTraverse(ArrayList<Integer> list, ArbolesBinarios.EDBinaryNode<Integer> root) {
        if (root!=null) {
            if (root.left() != null)
                inOrderTraverse(list, root.left());
            list.add(root.data());
            if (root.right() != null)
                inOrderTraverse(list, root.right());
        }
    }
    public static void main(String[] args) {
       
        ArbolesBinarios.EDBinaryNode<Integer> nodo1 = new ArbolesBinarios.EDBinaryNode<Integer>(8);
        ArbolesBinarios.EDBinaryNode<Integer> nodo2 = new ArbolesBinarios.EDBinaryNode<Integer>(9);
        ArbolesBinarios.EDBinaryNode<Integer> tree = new ArbolesBinarios.EDBinaryNode<Integer>(10,nodo1,nodo2);


        ArrayList<Integer> lista = new ArrayList<>();
        inOrderTraverse(lista, tree);
        System.out.println(lista);

    }
}
