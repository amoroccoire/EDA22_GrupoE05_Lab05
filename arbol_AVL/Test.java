
public class Test {

	public static void main(String[] args) {
		
		AVLTree<Integer> arbolAVL = new AVL<Integer>();
		
		
		arbolAVL.insert(21);
		arbolAVL.insert(8);
		arbolAVL.insert(24);
		arbolAVL.insert(1);
		arbolAVL.insert(8);
		arbolAVL.insert(17);
		arbolAVL.insert(16);
		arbolAVL.insert(18);
		arbolAVL.insert(40);
		arbolAVL.insert(2);
		
		System.out.println("PreOrden: ");
		arbolAVL.preOrden(arbolAVL.theRoot());
		System.out.println("\nInOrden: ");
		arbolAVL.inOrden(arbolAVL.theRoot());
		System.out.println("\nPostOrden: ");
		arbolAVL.postOrden(arbolAVL.theRoot());
		
		arbolAVL.contains(40);
		arbolAVL.remove(1);
		
		System.out.println("PreOrden: ");
		arbolAVL.preOrden(arbolAVL.theRoot());
		System.out.println("\nInOrden: ");
		arbolAVL.inOrden(arbolAVL.theRoot());
		System.out.println("\nPostOrden: ");
		arbolAVL.postOrden(arbolAVL.theRoot());
	}

}