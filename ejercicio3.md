# Ejercicio 3

1.- Definir un proyecto Maven Multi-Module `basico` que agrupe a los proyecto: `basico-core` (antiguo `basico`) y `basico-web`. 

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
