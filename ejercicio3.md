# Ejercicio 3

El proyecto `basico-web` depende de `basico-core`. 

1.- Añadir al POM de `basico-web` la dependencia correspondiente. Deberá instalar el JAR de `basico-core` en el repositorio local de Maven.

NOTAS: 
- Puede guiarse utilizaldo el tutorial [How to include custom library into maven local repository?](http://www.mkyong.com/maven/how-to-include-library-manully-into-maven-local-repository/)


2.- Definir un proyecto Maven Multi-Module `basico` que agrupe a los proyecto: `basico-core` y `basico-web`. 

NOTAS:
- El proyecto `basico-web` depende del proyecto `basico-core`
- Puede guiarse utilizando la guía de ["Maven By Example" correspondiente](http://books.sonatype.com/mvnex-book/reference/multimodule.html)

Para ejecutar:
```
> cd basico
> mvn clean install
> cd basico-web/
>  mvn tomcat7:run
```
