Face CLI
========

Programa de línea de comandos para interactuar con el servicio web para
proveedores de [FACe](https://face.gob.es/).

Actualmente solo permite conectar con el entorno de test.

El certificado de firma de peticiones hay que darlo de alta previamente
en [FACe test](https://se-face.redsara.es/) igual que se haría en
el entorno de producción.

La aplicación está programada en Java 8, utilizando Spring Boot y Apache
CXF para los servicios web. Para compilar se utiliza Gradle que se
descarga automáticamente.

Requisitos
----------

Únicamente tener instalado un JDK de Java versión 8.

Configuración
-------------

La aplicación se configura mediante el fichero `application.yml` que
puedes copiar inicialmente de `application.yml.example`.

Los siguientes ficheros son ignorados por git, con lo que puedes usarlos
para guardar tu configuración directamente en el repositorio, así es más
fácil hacer pruebas:
  - `application.yml`
  - `keystore`

Solo hay que crear un almacén de claves (keystore) que incluya el certificado
con el que se van a firmar las peticiones.

Certificado de firma de peticiones
----------------------------------

En el fichero especificado en `keystore.location` con el password
`keystore.password` se incluirá el certificado con el que firmar
las peticiones a los servicios web.

El certificado de firma se seleccionará con el alias
`keystore.signature.alias` y el password `keystore.signature.password`.

El tipo de almacén puede ser `JKS` o `PKCS12` y se especificará en
`keystore.type`.

### Error "Illegal key size"

Si al cargar el certificado aparece este error:

```
java.io.IOException: exception unwrapping private key - java.security.InvalidKeyException: Illegal key size
```

Es debido a las limitaciones criptográficas con las que está configurado
por defecto Java.

Para eliminarlas, tienes que instalar "Java Cryptography Extension (JCE)
Unlimited Strength Jurisdiction Policy Files for JDK/JRE 8".

Si el certificado es un PKCS #12 es posible que puedas convertirlo a JKS y
que funcione sin esta modificación.

### Importar un PKCS #12 a un keystore JKS

Si dispones de un certificado en formato PKCS #12 lo puedes importar a un
keystore JKS mediante este comando:

```
keytool -importkeystore \
        -destkeystore <keystore> \
        -srckeystore <file.p12> \
        -srcstoretype pkcs12
```

Ejecución del programa
----------------------

Primero hay que compilar el programa: `gradlew bootRepackage`.

Después, ya podemos ejecutarlo: `java -jar build/libs/face-cli.jar [opciones]`.

Por ejemplo, para mostrar la ayuda: `java -jar build/libs/face-cli.jar ayuda`.

```
Uso de la aplicación:

face-cli
    enviarFactura <correo> <factura.xsig>
    consultarFactura <codigoRegistro>
    anularFactura <numeroRegistro> <motivo>
    estados
    unidades
    administraciones
    unidadesPorAdministracion <codigoDir>
    consultarListadoFacturas <codigoRegistro1,...>
    ayuda
```

La ejecución del programa crea un fichero de log `face-cli.log` que
incluye los mensajes SOAP enviados y recibidos.

Generación del código Java del servicio
---------------------------------------

Se utiliza el servicio web de test con el estilo RPC/Literal.

El fichero WSDL del servicio se encuentra copiado localmente en
`src/main/resources/sspp2.wsdl`. Fue descargado el 27/08/2015.

Mediante el comando `gradlew exportWsdl` se llama a la aplicación
`wsdl2java` de CXF que genera las clases Java.

Conexión al web service
-----------------------

El certificado de la CA que usan en test no está en Java.

Hay que añadirlo al truststore. En vez de añadirlo al del sistema,
se crea uno local para que lo use la aplicación.

En `firmaprofesional-caroot.crt` tenemos el certificado CA Raíz de
Firmaprofesional.

Se incluye el fichero `truststore` que contiene solo este certificado,
importado mediante el siguiente comando:

```
keytool -import -trustcacerts -alias firmaprofesional \
        -file firmaprofesional-caroot.crt -keystore truststore
```

En la aplicación se configura el `conduit` CXF del cliente mediante
`truststore.location` y `truststore.password`.

Copyright y licencia
--------------------

Copyright 2015 Brainbond Ingeniería Informática SL.

Código bajo la licencia GNU General Public License v3.0.
