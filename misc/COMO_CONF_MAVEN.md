# Cómo configurar Maven

Herramientas disponibles en: http://192.168.1.96/tools

0.- Descargar e instalar Java

1.- Descargar y descomprimir Maven 

2.- Definir las siguientes variables de entorno:
```
JAVA_HOME=RUTA_JAVA
M2_HOME=RUTA_MAVEN
PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
```

Donde:
- RUTA_JAVA es la ruta donde se encuentra el JDK (raíz)
- RUTA_MAVEN es la ruta donde se encuentra el Maven (raíz)

Nota: En Windows añadir como variables de entorno en el espacio de Usuario: Clic derecho sobre Equipo -> Propiedades -> Variables de entorno
