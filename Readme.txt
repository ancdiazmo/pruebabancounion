Proyecto para BancoUnion

Resumen (Herramientas utilizadas):
SonarLint (calidad de codigo)
lombok (Logs, facade @Slfj)
Spring web (Api)
Spring validation (validaciones de tipo javax.validation @Valid)
Spring data (Persistencia con Hibernate)
MapStruts (Mapeo entre dtos y entities)
Oracle 18c (Motor de bases de datos, con creacion de usuario propio)
Arquitectura por capas
Modelo de inversion de dependencias
Git (Para manejo de commits)


Explicacion:

Se desarrollo un api restfull, que maneja empleados y departamentos bajo un modelo de data hipotetica donde un
departamento tiene varios empleados, y un empleado pertenece a un departamento.

Base de datos (ver BaseDeDatos.sql y ModeloDeDatos.jpg):
Se crearon dos tablas con relacion de muchos a uno, sobre le motor de bases de datos Oracle 18c
y se insertaron algunas tuplas de prueba, ademas se creo un nuevo usuario para BD llamado BANCOUNION.

Api:
Se desarrolla una Api rest con springboot 2.7.15, con utlizacion de Spring data, Spring Web, Spring validation para hacer la persistencia, los endpoint rest y validaciones de constraints (@Valid) respectivamente (utilizando por debajo lo que es Hibernate dentro Spring data)

El desarrollo se realiza por capas controller, dto, model, repository, service, se utiliza MapStrups, para realizar
el respectivo mapeo de las entity en dtos, por lo tanto se recomiendo utilizar el comando "mvn clean install" de maven
para auto generar los mapper en caso de querer correr el proyecto

Se desarrollan 4 endpoint para cada entity, con los metodos GET, DELETE, PUT Y POST, de Http, se realiza ademas
validacion de tipo @Valid para los endpoint, y se retorna ResponseEntity<> en los endpoint que realizan cambios en la bd
para obtener distintos tipos de error HTTP 400 bad request, 200 ok

Loggin:
Se realiza loggin de mediante la utilizacion lombok @Slfj (ver archivo application.logs), este archivo se crea al arranque
de la aplicacion y registra los llamados a los metodos DELETE, PUT Y POST de la api, para dejar traza de los mismos

SonarLint:
Todo el desarrollo fue realizado con ayuda del analizador de codigo local SonarLint, para garantizar calidad del mismo

Documentacion:
Todo el programa tiene documentacion de tipo JavaDoc



