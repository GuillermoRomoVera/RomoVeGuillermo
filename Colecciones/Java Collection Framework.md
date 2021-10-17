# INSTITUTO TECNOLOGICO DE NUEVO LAREDO

![LogoDelTec](https://www.tecnm.mx/assets/files/main/img/pleca_tecnm.jpg)

## **Topicos Avanzados**

|**Acerca de Mi:** | **Datos**  |
|------------------|--------------|
|**Nombre:** | **_Guillermo Romo Vera_** |
|**No. de  Control** | **19100251** |
|**Carrera:**| **_Ingenieria en Sistemas Computacionales_**|

### **Tarea**

**_Elaborar un documento en Markdown donde defina que es una colección en Java y qué es el "Java Collection Framework"._**

### **¿Que es una coleccion en Java?**

Nos otorga el framework de las colecciones, que nos posibilita usar diferentes construcciones de datos para guardar y recobrar objetos de cualquier clase. Donde "Colección" es una clase de este framework que queramos usar de acuerdo con la composición de almacenamiento que nos interese y "Clase" representa el tipo de datos a guardar.

### **Conjuntos:**

Los conjuntos son construcciones de datos donde los recursos no poseen un orden y no se permiten duplicados. Para definirlos se usa la interfaz Set, que no incorpora nuevos procedimientos a la interfaz Collection.
Si deseamos que los recursos queden ordenados tenemos la posibilidad de utilizar TreeSet (implementación con árbol).
</br></br>

### **¿Que es Java Collection Framework?**

La plataforma Java incluye un marco de colecciones(Collection Framework). Un marco de colecciones es una arquitectura unificada para representar y manipular colecciones, lo cual posibilita que las colecciones se manipulen independientemente de los detalles de utilización.
La Recolección en Java es un marco que otorga una arquitectura para guardar y manipular el conjunto de objetos.
El marco de Java Collection proporciona muchas interfaces (Set, List, Queue, Deque) y clases (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

### **_-Set y lista :_**

La interfaz List la implementan construcciones de datos en la que los recursos permanecen ordenados de acuerdo con el orden de inserción, como permanecen ordenados se puede entrar por ellos por medio de un índice, para eso incorpora 2 procedimientos con get y remove con un índice por parámetro.

### **_-ArrayList :_**

Acorde se agregan recursos la magnitud del array irá creciendo si se necesita. El array va a tener una capacidad inicial, y en el instante en el cual se rebase esa capacidad, se incrementará la magnitud del array.
 Las operaciones de adicionar un componente finalmente del array (add), y de implantar u obtener el factor en una cierta postura (get/set) poseen un coste temporal constante. Las inserciones y borrados poseen un coste linea(n), donde n es el número de recursos del array.

### **_-Vector :_**

El Vector es una utilización semejante al ArrayList, con la diferencia de que el Vector si que está sincronizado. En las últimas variantes el Vector se ha acomodado a este marco aplicando la interfaz List. No obstante, si trabajamos con variantes previas de JDK, hemos de considerar que esa interfaz no existía, y por consiguiente esta versión previa del vector no contará con los procedimientos definidos en ella.
