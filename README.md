<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Árboles</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>05</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>20-Jun-2022</td><td>FECHA FIN:</td><td>24-Jun-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="4">Integrantes:
        <ul>
            <li><h5>Escobar Atamari, Diego Gabriel</h5></li>
            <li><h5>Flores Sucupaca, Ervin Eleazar </h5></li>
            <li><h5>Machicao Quispe, Gabriel Steven</h5></li>
            <li><h5>Moroccoire Pacompia Anthony Marcos</h5></li>
            <li><h5>Quispe Bejar, Garlet Analy</h5></li>
        </ul>
    </td>
    <td colspan="2">Nota:</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>
<table>
    <theader>
        <tr><th colspan="6">SOLUCIÓN Y RESULTADOS</th></tr>
    </theader>
    <tbody>
        <tr><td colspan="6">I. CORCHETES EQUILIBRADOS
          <ul>
          <li>.....
            <pre>
		 <code> ....;
		 </code>
	     </pre> 
           </li>
          </ul>
          </td></tr>   
        <tr><td colspan="6">II. OPERACIONES DE ÁRBOL AVL
         <ul>
         <li>......</li>
         </ul>
        </td></tr>
        <tr><td colspan="6">III. ÁRBOL AVL
           <li>El método <b>insert()</b> comprueba si la raiz esta vacia o si ya esta llena, si se 
		da el último caso se llama al método <b>insertTree()</b>
		<pre>
		 <code>
			public void insert(T data) {
				Node <T> nuevo = new Node <T> (data);
				if(root == null)
					root = nuevo;
				else
					root = insertTree(nuevo,root);
			}
		 </code>
	     </pre>
		El método <b>insertTree()</b> es donde se inserta un nodo y se realiza el balanceo.
		Podemos dividirlo en dos partes, <b>la primera</b> en la que se van a insertar los nodos dependiendo
		si son mayores o menores a la raiz y se realice el balance.
             <pre>
		 <code>
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
				else if {......lo mismo que arriba 
					      solo que para el 
					      lado opuesto......
				}
				else{......"Ya existe 
					    ese nodo"....
			        }
			...	
			...
			...
			}	
		 </code>
	     </pre>
		En este caso se compara el nuevo nodo si es menor que el padre,luego se comprueba si 
		a la izquierda existe un nodo vacio para colocar al nuevo.
		 <pre>
		<code>
		       if(nuevoNodo.getData().compareTo(root.getData())<0) {
					if(root.getLeftNode()==null) {					
						root.setLeftNode(nuevoNodo);
					}
	        </code>
	      </pre>
		De existir un nodo se realiza la insercion y el balanceo, aqui dentro se encuentra el
		mismo método <b>insertTree()</b>, la diferencia es que ahora va a ingresar el nuevo
		nodo y el nodo que ya existe como la "raiz".
	      <pre>
		<code>
		      }else {
			root.setLeftNode(insertTree(nuevoNodo, root.getLeftNode()));
			if((height(root.getLeftNode())-height(root.getRightNode())>=2)) {
				if(nuevoNodo.getData().compareTo(root.getLeftNode().getData())<0) {
					padreNuevo = left(root);
				}else {
					padreNuevo = leftLeft(root);
				}
			}
	        </code>
	      </pre>
		<b>La segunda parte</b> en la que se realiza un balanceo de si existe o no nodos a la 
		 izquierda o derecha.
	       <pre>
		<code>
		      if((root.getLeftNode()==null) && (root.getRightNode()!= null)){
			  root.setBalanceFactor(root.getRightNode().getBalanceFactor()+1);
		      }else if((root.getRightNode() == null) && (root.getLeftNode()!= null)){
			  root.setBalanceFactor(root.getLeftNode().getBalanceFactor()+1);
		      }else {
			  root.setBalanceFactor(Math.max(height(root.getLeftNode()), height(root.getRightNode())+1));
		      }
	        </code>
	      </pre>
		Para realizar el balanceo se necesita hacer los giros respectivos cuando el arbol este 
		desbalanceado.En este caso se ve el código para girar a la izquierda, en este método ingresa 
		el nodo raiz y se crea un auxiliar para guardar el nodo izquierdo de la raiz, se trabaja 
		con el auxiliar y la raiz colocandole sus nodos a los costados y balanceándolos.  
		<pre>
		<code>
		      public Node <T> left(Node <T> n){  
			Node <T> aux = n.getLeftNode();
			n.setLeftNode(aux.getRightNode());
			aux.setRightNode(n);
			n.setBalanceFactor(Math.max(height(n.getLeftNode()),height(n.getRightNode()))+1);
			aux.setBalanceFactor(Math.max(height(aux.getLeftNode()),height(aux.getRightNode()))+1);
			return aux;	
		      }
	        </code>
	      </pre>
		Para el lado derecho es lo mismo solo cambiando los nodos de los costados que se van a utilizar.
		Después para lograr la rotación doble se utiliza tanto la rotación simplre hacia la derecha e 
		izquierda. 
	      <pre>
		<code>
		     public Node <T> leftLeft(Node <T> n){
			Node <T> aux;
			n.setLeftNode(right(n.getLeftNode()));
			aux = left(n);
			return aux;
	             }
	        </code>
	      </pre>
		En este caso se ha utilizado los métodos <b>left()</b> y <b>right()</b> para lograr la rotación 
		doble.
		El metodo <b>contains</b> es un metodo recursivo que retorna un boolean para saber si el dato
		ingresado se encuentra en el arbol.
		<pre>
		<code>
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
	        </code>
	      </pre>  
	   </li>
        </td></tr>
     </tbody>
</table>
<table>
    <theader>
        <tr><th>RETROALIMENTACIÓN</th></tr>
    </theader>
    <tbody>
         <tr><td colspan="6">                       </td></tr>
    </tbody>
</table>
<table>
    <theader>
        <tr><th>REFERENCIAS Y BIBLIOGRAFIA</th></tr>
    </theader>
    <tbody>
        <tr><td>
            <ul>
                <li>https://www.w3schools.com/java/</li>
                <li>https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developer</li>
                <li>https://algorithmtutor.com/Data-Structures/Tree/AVL-Trees/</li>
                <li>https://docs.oracle.com/javase/tutorial/java/generics/types.html</li>
            </ul></td>
        </tr>
    </tbody>
</table>