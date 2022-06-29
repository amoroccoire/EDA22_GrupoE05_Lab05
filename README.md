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
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>:Informe de Práctica de Laboratorio</td></tr>
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
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Arboles</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>05</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>29-Junio-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">12:00</td>
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
        <tr><td colspan="6">I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
	* I. CORCHETES EQUILIBRADOS
	  - Ejecución:<br>
	    Para probar el ejercicio 1, ejecute el archivo [CorchetesEquilibrados.java](Ejercicio1/CorchetesEquilibrados.java), con los siguientes comandos desde la terminal:<br>
<pre>javac CorchetesEquilibrados.java</pre>
<pre>java CorchetesEquilibrados</pre>
<br>
Si esta trabajando desde un IDE es posible que deba agregar como primera linea a cada clase:
package Ejercicio1;
<br>
Solo ingrese cadenas conformadas por: [,],(,),{,} de lo contrario no funcionara.
          <ul>
          <li>I. Corchetes equilibrados
             <ul>
	     
 	     <li>-----.</li>
	    </ul>
           </li>
          </ul>
            <ul>
                <li>II. Operaciones de árbol AVL
                <ul>
                    <li>Inserción</li>
                    <ul>
                        <li><img src="https://i.postimg.cc/7YnRyjw0/100.png" alt="image_1" style witdh="150"; height="150"/></li>
                        <li>Se inserta el numero 100 y como es el primer valor ingresado se coloca como raiz.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/fRHgVX3b/200.png" alt="image_1" style witdh="150"; height="150"/></li>
                        <li>Se ingresa el número 200 y se busca donde se colocará, al ser mayor que 100(la raiz) se coloca en el nodo hijo derecho de 100.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/26WH9K0q/300.png" alt="image_1" style witdh="200"; height="250"/></li>
                        <li>Se ingresa el número 300, se busca en lugar donde se colocará al ser mayor a 200 ingresa en el nodo hijo derecho de este mismo.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/K84DsWzZ/RI-300.png" alt="image_1" style witdh="200"; height="200"/></li>
                        <li>Como el arbol no esta balanceado se realiza una rotacion simple izquierda, quedando asi como raiz el nodo 200 y los otros dos nodos como hijos.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/FzmxWsfq/400.png?raw=true" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Se ingresa el valor de 400 y se busca un lugar al ser mayor que 300, este ingresa como nodo hijo derecho del nodo 300.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/TPLQhsMk/500.png" alt="image_1" style witdh="150"; height="250"/></li>
                        <li>Ingresamos el valor de 500 y este ingresa como nodo hijo derecho de 400.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/pL7JNBhK/RI-500.png" alt="image_1" style witdh="150"; height="250"/></li>
                        <li>Como el arbol no esta balanceado, se realiza una rotación simple izquierda quedando como padre el nodo 400 de los nodos 300 y 500.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/rwyPygwb/50.png" alt="image_1" style witdh="200"; height="250"/></li>
                        <li>Ingresamos 50 como nodo hijo izquierdo de 100.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/VNdZn6MW/25.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Al ingresar el valor de 25, este ingresa como nodo hijo izquierdo de 50.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/mrvj9STT/RD-25.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Al no estar balanceado el arbol, se realiza una rotacion simple a la derecha quedanso como padre el nodo 50 de los nodos 25 y 100.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/ZnFw4yt4/350.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Ingresamos el valor 350 y este ingresa como nodo hijo derecho de 300.</li>
                    </ul>
                    <ul>
                        li><img src="https://i.postimg.cc/QtcbJWM1/375.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Al ingresar el valor de 375 ingresa como nodo hijo derecho de 350.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/DzXd7bLH/RI-375.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Como el árbol no se encuentra balanceado se realiz una rotación simple a la izquierda quedando el nodo 350 como hijo izquierdo de 400 y como padre de 300 y 375.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/Qdn083P9/360.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Ingresamos el valor de 360 e ingresa como hijo izquierdo de 375.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/yY1P0xC3/RDD-360.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Al no estar balanceado se realiza una rotacion doble a la derecha quedando el nodo 375 como padre de 350 y 400.Asi mismo 350 queda como padre de 300 y 360 y 400 como padre de 500.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/3J1tqpFZ/355.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Al ingresar el valor de 355, este ingresa como nodo hijo izquierdo de 360.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/hP20snKy/RDI-355.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Se realiza una rotacion doble izquierda al nodo 350, quedanos asi este como la raiz. Y el nodo 355 queda como hijo de de 360.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/66djdF7g/150.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Ingresamos el nodo 150 y este ingresa como nodo hijo derecho de 100.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/cCmBVywJ/RDD-150.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Se realiza un rotacion doble derecha del 100.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/brjm795m/175.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Ingresamos el valor de 175 e ingresa como nodo hijo derecho de 150.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/tCprDDWT/120.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Ingresamos 120 y este ingresa como nodo hijo izquierdo de 150.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/JzhpCnTC/190.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Ingresamos 190 y este ingresa como nodo hijo derecho de 175.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/Y2fR4gZw/RDD-190.png" alt="image_1" style witdh="300"; height="350"/></li>
                        <li>Realizamos una rotación doble derecha del nodo 175.</li>
                    </ul>
                </ul>
                <ul>
                    <li>Eliminación</li>
                    <ul>
                        <li><img src="https://i.postimg.cc/8C0ny4pt/Del-100.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Eliminamos el nodo con el valor 100.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/0QKXhSrx/Del-100-2.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Al encontrarse no balanceado se realiza una rotación simple a la izquierda y el nodo 150 queda como nodo hijo derecho de 50 y como padre de 120 y 175 queda como padre de los nodos 50 y 200.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/qq8bvd85/Del-200.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Eliminamos el nodo con valor de 200 y el nodo 190 pasa a ser nodo hijo derecho de 175 y padre de 300.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/2yp9Y5BW/Del-300.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Eliminamos el nodo 300.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/yYHprkK4/Del-300-2.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Realizamos una ritacion doble derecha del nodo 150 quedando este como padre de 50 y 175. Asi mismo 50 queda como padre de 25 y 120.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/MGNd0G5L/Del-400.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Eliminamos el nodo con valor de 400.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/XJ5xs0DY/Del-500.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Eliminamos el nodo con valor de 500.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/vTdhjSpL/Del-500-2.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Se realiza una rotación simple a la derecha del nodo 360 quedando este como padre de 355 y 375.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/NjQVLLC7/Del-50.png" alt="image_1" style witdh="350"; height="300"/></li>
                        <li>Eliminamos el nodo con valor de 50 y como no se desequilibra no se realiza ninguna otra acción.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/YqKTKd1P/Del-25.png" alt="image_1" style witdh="250"; height="250"/></li>
                        <li>Eliminamos el nodo con valor de 25 y al seguir equilibrado no realizamo nada mas.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/Wprfn0Qw/Del-350.png" alt="image_1" style witdh="250"; height="200"/></li>
                        <li>Eliminamos el nodo con valor de 350 y el arbol no se desequilibra.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/Cxvv17qS/Del-375.png" alt="image_1" style witdh="200"; height="200"/></li>
                        <li>Seguimos eliminando nodos, ahora el nodo con valor de 75 y el árbol no se desequilibra y no se realiza niguna accion mas.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/VNdKbtqM/Del-360.png" alt="image_1" style witdh="200"; height="200"/></li>
                        <li>Eliminamos el nodo con valor 360 y se mantiene como estaba..</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/7YntvwPC/Del-355.png" alt="image_1" style witdh="200"; height="200"/></li>
                        <li>Se elimina el nodo con valor de 355.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/bwYCpWdm/Del-355-2.png" alt="image_1" style witdh="200"; height="200"/></li>
                        <li>El árbol se encuentra no balanceado, se realiza una rotación simple a la derecha del nodo 150 quedandi este como raiz y padre de los nodos 120 y 190, este último queda como padre del nodo 175.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/Jhn2cvLs/Del-150.png" alt="image_1" style witdh="200"; height="150"/></li>
                        <li>Eliminamos el nodo con valor de 150.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/Dw5NGFtV/Del-150-2.png" alt="image_1" style witdh="150"; height="150"/></li>
                        <li>Se realiza una rotación doble a la izquierda del nodo 175 quedando este como raiz y padre de los nodos 120 y 190.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/hPL6SVst/Del-175.png" alt="image_1" style witdh="150"; height="150"/></li>
                        <li>Eliminamos el nodo con valor de 175.</li>
                    </ul>
                    <ul>
                        <li><img src="https://i.postimg.cc/sfZbNkZS/Del-120.png" alt="image_1" style witdh="150"; height="150"/></li>
                        <li>Eliminamos el nodo con calor de 120.</li>
                        <li>Eliminamos el nodo con valor de 190, que es el ultimo y ya no tenemos nada.</li>
                    </ul>
                </ul>
            </ul>
            <ul>
                <li>III. Árbol AVL
                <ul>
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
	      <p> Para el método <b>remove()</b> se hace el método <b>deleteNode()</b>, que borra el node desde un node y el dato a eliminar, cuando el deleteNode devuelve el node eliminado se invoca el getData() para devolver el dato. </p>
	      <pre>
	      public T remove(T data) {
		return deleteNode(this.root, data).getData();
	      }
	      </pre>
	      <p> En el método <b>deleteNode()</b> se va a buscar el dato desde el node Root para lo cual lo busca mediante la recursividad de los if y else if hasta que el compareTo devuelva 0, para luego identificar que caso de eliminación se va a realizar </p>
	      <pre>
	      public Node<T> deleteNode(Node<T> node, T dato) {
                  if(node == null )
                     return node;
                  else if (dato.compareTo(node.getData()) < 0)
                     node.setLeftNode(deleteNode(node.getLeftNode(), dato));
                  else if (dato.compareTo((T) node.getData())>0)
                     node.setRightNode(deleteNode(node.getRightNode(),dato));
	      </pre>
	      <p> El primer caso es cuando el node a eliminar no tiene hijos, en ese caso simplemente se elimina el node </p>
	      <pre>
                  if (node.getLeftNode() == null && node.getRightNode() == null) 
                      node = null;
	      </pre>
	      <p>En el segundo caso si tiene un hijo ya sea en la rama derecha o izquierda se va hacer un igualización del node y el node del hijo que tiene, es decir, un reemplazo del node con su hijo.</p>
	      <pre>
	         else if (node.getLeftNode() == null) 
                    node = node.getRightNode();
                else if (node.getRightNode() == null) 
                    node = node.getLeftNode();
	      </pre>
	      <p> Para el tercer caso se crea minium que busca el recorrido minimo de un node dado en los parametros del método </p>
	      <pre>
	         public Node<T> minimum(Node<T> node) {
                    while (node.getLeftNode() != null) {
			node = node.getLeftNode();
		    }
		 return node;
	         }
	      </pre>
	      <p> Luego en el tercer caso se va crear el node temp para que almacene el node minimo desde el hijo derecho del node que va ser eliminado y despues reemplaza los datos del node con el date temp, para luego cambiar eliminar el otro node que tiene el mismo date, despues de analizar los datos se retorna el node </p>
	      <pre>
	         else {
                   Node <T> temp = minimum(node.getRightNode());
                   node.setData(temp.getData());
                   node.setRightNode(deleteNode(node.getRightNode(), (T) temp.getData()));
                 }
               }
               return node;
	      </pre>
	   </li>
                <li>
              </ul>
           </li>
          </ul>
          </td></tr>   
        <tr><td colspan="6">II. CONCLUSIONES
           <li>conclusion </li>
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
