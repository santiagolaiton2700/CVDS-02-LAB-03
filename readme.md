# **Clases de Equivalencia**

> ### Crear un proyecto con Maven 
Creamos un proyecto en Maven basado en un arquetipo

<img width="691" alt="1" src="https://user-images.githubusercontent.com/59893804/91614712-ab0e1c80-e947-11ea-99a8-29468074333f.png">

>

> ### Actualizar y crear dependencias en el proyecto

Agregamos una nueva dependencia al archivo ``` pom.xml ```

```
<dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
```  

Cambiamos la versión del compilador agregando la sección ```properties```
```
<properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
 ```   
>    


> ### Compilar y ejecutar 

Compilamos el proyecto

<img width="416" alt="2" src="https://user-images.githubusercontent.com/59893804/91617554-e6134e80-e94d-11ea-863e-c3d26a7cfb82.png">

Ejecutamos las pruebas 

<img width="419" alt="3" src="https://user-images.githubusercontent.com/59893804/91617558-e7dd1200-e94d-11ea-8b3b-233d91e60e35.png">

>
## Ejercicio "Registraduría"

> ### Propiedades
* Solo se registrarán votantes válidos
* Solo se permite una inscripción por número de documento
>
> ### Hacer el esqueleto de la aplicación

Creamos las clases necesarias en el paquete ``` edu.eci.cvds.tdd.registry ``` 

<img width="726" alt="4" src="https://user-images.githubusercontent.com/59893804/91616935-6e90ef80-e94c-11ea-946a-0291869bd367.png">

>

> ### Ejecutar las pruebas

Utilizando ```$mvn package```

<img width="416" alt="5" src="https://user-images.githubusercontent.com/59893804/91617743-4609f500-e94e-11ea-908f-fc6454652c1d.png">

Utilizando ``` $mvn test```

<img width="419" alt="6" src="https://user-images.githubusercontent.com/59893804/91617702-2ffc3480-e94e-11ea-9839-c8a7ec13c3c0.png">
_ La diferencia entre ```$mvn package``` y ``` $mvn test``` es que con ```$mvn package``` empaqueta todo el proyecto y ``` $mvn test``` compila y ejecuta las pruebas.

>
> ### Finalizar el ejercicio


## Ejercicio "Descuento de tarifas"
> ### Realizar diseño de pruebas
> ### Implementación de las pruebas 






