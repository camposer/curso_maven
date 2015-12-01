# Ejercicio 1

1.- Para el proyecto `basico` crear un JAR que contenga todas las dependencias. Ver plugin [assembly](https://maven.apache.org/plugins/maven-assembly-plugin/usage.html). El jar resultante debería poder utilizarse de la siguiente forma:
```
> java -jar NOMBRE_PROYECTO-jar-with-dependencies.jar com.curso.maven.basico.App
```

Comandos para comprobar funcionamiento:
```
>  java -cp target/basico-0.0.1-SNAPSHOT.jar com.curso.maven.basico.App
>  jar tvf target/basico-0.0.1-SNAPSHOT.jar 
>  jar tvf target/basico-0.0.1-SNAPSHOT-jar-with-dependencies.jar 
>  java -cp target/basico-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.curso.maven.basico.App
```

2.- Para el proyecto `basico` crear un JAR ejecutable, es decir, que contenga un fichero /META-INF/MANIFEST.MF donde especifique cuál es el la clase que contiene el main que se ejecutará por defecto. Ver plugin [shade](http://maven.apache.org/plugins/maven-assembly-plugin/)

3.- Para el proyecto `basico` crear un JAR ejecutable con todas las dependencias.
