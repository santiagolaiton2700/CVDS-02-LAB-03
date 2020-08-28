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

<img width="421" alt="2" src="https://user-images.githubusercontent.com/59893804/91616375-2de4a680-e94b-11ea-9356-8cc589355ff9.png">

Ejecutamos las pruebas 

<img width="420" alt="3" src="https://user-images.githubusercontent.com/59893804/91616384-30df9700-e94b-11ea-8fd0-3b993d252f67.png">


>
## Ejercicio "Registraduría"
> ### Propiedades
> ### Hacer el esqueleto de la aplicación
> ### Ejecutar las pruebas
> ### Finalizar el ejercicio

## Ejercicio "Descuento de tarifas"
> ### Realizar diseño de pruebas
> ### Implementación de las pruebas 






