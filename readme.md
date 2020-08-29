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

_La diferencia entre_ ```$mvn package``` _y_ ``` $mvn test``` _es que_ ```$mvn package``` _empaqueta todo el proyecto y lo ejecuta mientras que_  ``` $mvn test``` _solo compila y ejecuta las pruebas._

>

> ### Finalizar el ejercicio
Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones y termine la implementación de las clases ``` Registry.java``` y ``` RegistryTest.java```

<img width="512" alt="7" src="https://user-images.githubusercontent.com/59893804/91618767-e5c88280-e950-11ea-876f-740b8e7a6009.png">

>
## Ejercicio "Descuento de tarifas"
> ### Realizar diseño de pruebas

_El diseño de las pruebas se encuentra en el documento adjunto llamado:_ ```documento```

>

> ### Implementación de las pruebas 
* Descargamos el archivo ```aerodescuentos.jar``` y adicionamos una nueva dependencia en el archivo ```pom.xml```
```
<dependency>
      <groupId>edu.eci.cvds</groupId>
      <artifactId>aerodescuentos</artifactId>
      <version>1.0.0</version>
    </dependency>
    
```
* Adicionamos una librería personalizada al repositorio local de maven con el comando:

```
$ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar
```

<img width="711" alt="8" src="https://user-images.githubusercontent.com/59893804/91619729-88820080-e953-11ea-880f-0180540ffb38.png">

* Cree el archivo ```TarifasTest.java``` en el directorio ```src/test/java/edu/eci/cvds/tdd/aerodescuentos```

<img width="758" alt="9" src="https://user-images.githubusercontent.com/59893804/91619931-270e6180-e954-11ea-81e1-226ae27948cd.png">

* Ejecutamos el comando de Maven para las fases de compilación y pruebas. Verificamos el resultado exitoso de todas las pruebas.
>







