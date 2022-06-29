public class AVLTree <T extends Comparable <T>> {
	private Node <T> root;
	
	public AVLTree() {
		root = null;
	}
	public Node <T> theRoot() {
		return root;
	}
	public Node <T> search (T data,Node <T> n) { 
		if(root==null)
			return null;
		else if (n.getData() == data) 
			return n;
		else if (n.getData().compareTo(data)<0)
			return search(data,n.getRightNode());
		else
			return search(data,n.getRightNode());
	}
	public int height(Node <T> a) {  
		if(a == null)
			return -1;
		else
			return a.getBalanceFactor();
	}
	public void contains(T data) {
		boolean found= contains(root,data);
		if(found==true)
			System.out.println("\n\nEl elemento "+data+" SE ENCUENTRA en el árbol\n");
		else
			System.out.println("\n\nEl elemento "+data+" NO SE ENCUENTRA en el árbol\\n");
	}
	public boolean contains(Node<T> node,T data) {
		if(node == null)
			return false;
		int c = data.compareTo(node.getData());
		if(c < 0)
			return contains(node.getLeftNode(),data);
		if(c > 0)
			return contains(node.getRightNode(),data);
		return true;
	}
	public Node <T> left(Node <T> n){  
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
	public Node <T> insertTree(Node<T> nuevoNodo,Node<T> root){
		Node <T> padreNuevo = root;
		if(nuevoNodo.getData().compareTo(root.getData())<0) {
			if(root.getLeftNode()==null) {					
				root.setLeftNode(nuevoNodo);
			}else {
				root.setLeftNode(insertTree(nuevoNodo, root.getLeftNode()));
				if((height(root.getLeftNode())-height(root.getRightNode())>=2)) {
					if(nuevoNodo.getData().compareTo(root.getLeftNode().getData())<0) {
						padreNuevo = left(root);
					}else {
						padreNuevo = leftLeft(root);
					}
				}
			}	
		}else if(nuevoNodo.getData().compareTo(root.getData())>0) {
			if(root.getRightNode() == null) {				
				root.setRightNode(nuevoNodo);
			}else {
				root.setRightNode(insertTree(nuevoNodo,root.getRightNode()));
				if((height(root.getRightNode())-height(root.getLeftNode())>=2)) {
					if(nuevoNodo.getData().compareTo(root.getRightNode().getData())>0) {
						padreNuevo = right(root);
					}else {
						padreNuevo = rightRight(root);
					}
				}
			}
		}else {
			System.out.println("\nNo se coloco el dato "+nuevoNodo.getData()+" porque ya existe\n");
		}
		if((root.getLeftNode()==null) && (root.getRightNode()!= null)){
			root.setBalanceFactor(root.getRightNode().getBalanceFactor()+1);
		}else if((root.getRightNode() == null) && (root.getLeftNode()!= null)){
			root.setBalanceFactor(root.getLeftNode().getBalanceFactor()+1);
		}else {
			root.setBalanceFactor(Math.max(height(root.getLeftNode()), height(root.getRightNode())+1));
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
	public Node<T> minimum(Node<T> node) {
	    while (node.getLeftNode() != null) {
				node = node.getLeftNode();
			}
			return node;
		}

	  public T remove(T data) {
			System.out.println("\nEl elemento "+data+" se ha removido del árbol\n");
		  	return deleteNode(this.root, data).getData();
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
