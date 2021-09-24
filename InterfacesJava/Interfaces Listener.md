# **Topicos Avanzados**

## **Guillermo Romo Vera**

![LogoDelTec](https://www.tecnm.mx/assets/files/main/img/pleca_tecnm.jpg)

## Tarea

**_"Elaborar un documento en Markdown que describa las intefaces de escucha y sus métodos en Java."_**

### **_¿Que son los eventos?_**  

Definiremos de forma breve este criterio, un acontecimiento es el resultado de una acción hecha por el cliente en una interfaz grafica.
Es un objeto delegado de retener la información ejemplificando: el nombre del origen de acontecimiento, el tipo de acontecimiento.  
Además, los eventos tienen la posibilidad de ser causados de distintas maneras: al presionar una tecla, redactar escrito en un campo, al mover o hacer clic con el ratón, al maximizar, reducir y cerrar la ventana, entre otros.

### **_Objeto origen_**  

Una vez que presionan hablado objeto se crea un acontecimiento (objeto origen) en cargado de retener información acerca de la acción elaborada.

### **_Objeto evento_**  

Se encarga de guardar la información necesaria para identificar el tipo de evento, ademas puede guardar el nombre del origen.

### **_Objeto oyente_**  

Este objeto continuamente va a ser de tipo Listener y es delegado de estar a la escucha (de chismoso) de una vez que un acontecimiento (objeto origen) es realizado. No obstante, cada oyente debería tener su registro al origen que corresponde puesto que dependiendo los principios va a tener una secuencia de procedimientos.
