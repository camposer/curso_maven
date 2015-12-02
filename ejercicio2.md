# Ejercicio 2

1.- Crear un proyecto web con Maven. Ver: [Creating a webapp](https://maven.apache.org/plugins-archives/maven-archetype-plugin-1.0-alpha-7/examples/webapp.html)

NOTAS:
- Puede consultar el siguiente [artículo](http://www.mkyong.com/maven/how-to-create-a-web-application-project-with-maven/)
- Se recomienda utilizar la versión de servlets versión 3.1

2.- Configurar proyecto para que inicie automáticamente en Tomcat 7 (embebido). Ver: (tomcat plugin)[http://tomcat.apache.org/maven-plugin.html]

Para ejecutar:
```
> mvn clean install tomcat7:run
```
