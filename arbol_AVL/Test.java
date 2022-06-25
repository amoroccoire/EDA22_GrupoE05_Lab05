public class Test {

	public static void main(String[] args) {
		
		AVLTree<Integer> arbolAVL = new AVLTree<Integer>();
		
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
		
		
		
		
		
		arbolAVL.preOrden(arbolAVL.theRoot());
		System.out.println();
		arbolAVL.inOrden(arbolAVL.theRoot());
		System.out.println();
		arbolAVL.postOrden(arbolAVL.theRoot());

    arbolAVL.remove(18);
		arbolAVL.remove(8);

		System.out.println("\n");
		arbolAVL.inOrden(arbolAVL.theRoot());
	}

}
