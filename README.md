# prueba-bice
Prueba para DevOps Bice Vida

## CI/CD

### Stage 1: Instalar instancia de java.
```
install:
    runtime-versions:
      java: corretto11
```
###Stage 2 Build: Generar JAR para servicio Spring Boot.
```
mvn clean install
```

## Levantar la aplicación en local.

Se necesita tener JDK 11, MAVEN y GIT. 
### Clonar repositorio.
```
git clone git@github.com:Gaedo1984/prueba-bice.git
```

### Correr aplicación en localhost
```
mvn spring-boot:run
```

### Visitar aplicacion localmente.
```
http://localhost:8080/v1/bice_vida/insurances
```

### Visitar aplicacion en AWS.

[Ir a aplicación en AWS](http://bicevidaentorno-env.eba-avkfwjpz.us-east-1.elasticbeanstalk.com/v1/bice_vida/insurances)

### Flujo GIT
```
Cada vez que se haga un push a la rama main, el pipline en aws se activa.
```

### Cambio de rama
```
git checkout <nombre-rama>
```