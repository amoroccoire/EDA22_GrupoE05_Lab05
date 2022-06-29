package Ejercicio2;

public class Stack<T extends Comparable<T>> {

    private Node<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public T peek() { //Mira el objeto superior de la pila sin sacarlo
        if (root != null)
            return root.getDato();
        return null;
    }

    public T pop() { //Devuelve y elimina el objeto superior de la pila
        if (root != null) { 
            Node<T> nodoEliminado = root;
            root = root.getNextNode();
            nodoEliminado.setNextNode(null);
            return nodoEliminado.getDato();
        }
        return null;
    }

    public T push(T item) {
        Node<T> nodo = new Node<T>(item);

        nodo.setNextNode(root);
        root = nodo;
        return item;
    }

    public int search(T element) {
        Node<T> aux = this.root;
        int pos = 1;
        boolean b = false;

        do {
            if (aux.getDato().compareTo(element) == 0) {
                b = true;
                return pos;
            }
            else {
                aux = aux.getNextNode();
                pos++;
            }
        }while (aux.getNextNode() != null);

        if (b)
            return pos;
        else
            return -1;
    }

    public String toString() {
        String str = "";
        Node<T> aux = root;
        while (aux.getNextNode() != null) {
            str += aux.getDato() + ",";
            aux = aux.getNextNode();
        }
        return str += aux.getDato();
    }
} 
