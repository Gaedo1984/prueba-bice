# prueba-bice
Prueba para DevOps Bice Vida

## CI/CD
###Stage 1 Build: Generar JAR para servicio Spring Boot.
```
mvn clean install
```
### Stage 2: Copiar la aplicación en el EC2.
```
mv target/devops-api-test-0.0.1-SNAPSHOT.jar ./
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
git branch
```

### Cambio de rama
```
git checkout <nombre-rama>
```