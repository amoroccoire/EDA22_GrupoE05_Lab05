
public class AVLTree <T extends Comparable <T>> {
  private Node <T> root;

  public AVL() {
    root = null;
  }
  public Node <T> theRoot() {
    return root;
  }
  public Node <T> search (T data,Node <T> n) { // buscar un dato
    if(root==null)
      return null;
    else if (n.getData() == data) 
      return n;
    else if (n.getData().compareTo(data)<0)
      return search(data,n.getRightNode());
    else
      return search(data,n.getRightNode());
  }
  public int height(Node <T> a) {  //altura de arbol
    if(a == null)
      return -1;
    else
      return a.getBalanceFactor();
  }
  public Node <T> left(Node <T> n){  // para girar a la izquierda
    Node <T> aux = n.getLeftNode();
    n.setLeftNode(aux.getRightNode());
    aux.setRightNode(n);
    n.setBalanceFactor(Math.max(height(n.getLeftNode()),height(n.getRightNode()))+1);
    aux.setBalanceFactor(Math.max(height(aux.getLeftNode()),height(aux.getRightNode()))+1);
    return aux;	
  }
  public Node <T> right(Node <T> n){
    Node <T> aux = n.getRightNode();
    n.setRightNode(aux.getLeftNode());
    aux.setLeftNode(n);
    n.setBalanceFactor(Math.max(height(n.getLeftNode()),height(n.getRightNode()))+1);
    aux.setBalanceFactor(Math.max(height(aux.getLeftNode()),height(aux.getRightNode()))+1);
    return aux;	
  }
  public Node <T> leftLeft(Node <T> n){
    Node <T> aux;
    n.setLeftNode(right(n.getLeftNode()));
    aux = left(n);
    return aux;
  }
  public Node <T> rightRight(Node <T> n){
    Node <T> aux;
    n.setRightNode(left(n.getRightNode()));
    aux = right(n);
    return aux;
  }
  public Node <T> insertTree(Node<T> arbol,Node<T> sub){
    Node <T> padreNuevo = sub;
    if(arbol.getData().compareTo(sub.getData())<0) {
      if(sub.getLeftNode()==null) {
        sub.setLeftNode(arbol);
      }else {
        sub.setLeftNode(insertTree(arbol, sub.getLeftNode()));
        if((height(sub.getLeftNode())-height(sub.getRightNode())>=2)) {
          if(arbol.getData().compareTo(sub.getLeftNode().getData())<0) {
            padreNuevo = left(sub);
          }else {
            padreNuevo = leftLeft(sub);
          }
        }
      }	
    }else if(arbol.getData().compareTo(sub.getData())>0) {
      if(sub.getRightNode() == null) {
        sub.setRightNode(arbol);
      }else {
        sub.setRightNode(insertTree(arbol,sub.getRightNode()));
        if((height(sub.getRightNode())-height(sub.getLeftNode())>=2)) {
          if(arbol.getData().compareTo(sub.getRightNode().getData())>0) {
            padreNuevo = right(sub);
          }else {
            padreNuevo = rightRight(sub);
          }
        }
      }
    }else {
      System.out.println("Ya existe ese nodo");
    }
    if((sub.getLeftNode()==null) && (sub.getRightNode()!= null)){
      sub.setBalanceFactor(sub.getRightNode().getBalanceFactor()+1);
    }else if((sub.getRightNode() == null) && (sub.getLeftNode()!= null)){
      sub.setBalanceFactor(sub.getLeftNode().getBalanceFactor()+1);
    }else {
      sub.setBalanceFactor(Math.max(height(sub.getLeftNode()), height(sub.getRightNode())+1));
    }
    return padreNuevo;
  }
  public void insert(T data) {
    Node <T> nuevo = new Node <T> (data);
    if(root == null)
      root = nuevo;
    else
      root = insertTree(nuevo,root);
  }

  public Node<T> deleteNode(Node<T> node, T dato) {
    if(node == null )
      return node;
    else if (dato.compareTo(node.getData()) < 0)
      node.setLeftNode(deleteNode(node.getLeftNode(), dato));
    else if (dato.compareTo((T) node.getData())>0)
      node.setRightNode(deleteNode(node.getRightNode(),dato));
    else {
      if (node.getLeftNode() == null && node.getRightNode() == null) {
        node = null;
      }
      else if (node.getLeftNode() == null) {
        Node<T> temp = node;
        node = node.getRightNode();
      }

      else if (node.getRightNode() == null) {
        Node<T> temp = node;
        node = node.getLeftNode();
      }

      else {
        Node <T> temp = minimum(node.getRightNode());
        node.setData(temp.getData());
        node.setRightNode(deleteNode(node.getRightNode(), (T) temp.getData()));
      }
    }
    return node;
  }
  public void inOrden(Node <T> n) {
    if(n != null) {
      inOrden(n.getLeftNode());
      System.out.print(n.getData()+ ", ");
      inOrden(n.getRightNode());
    }
  }
  public void preOrden(Node <T> n) {
    if(n != null) {
      System.out.print(n.getData()+ ", ");
      preOrden(n.getLeftNode());
      preOrden(n.getRightNode());
    }
  }public void postOrden(Node <T> n) {
    if(n != null) {
      postOrden(n.getLeftNode());
      postOrden(n.getRightNode());
      System.out.print(n.getData()+ ", ");
    }
  }	
}
