# Marvel-Api

 App sencilla utilizando la información que está en la API pública de Marvel (https://developer.marvel.com/docs)

## Funcionalidad
 En cuanto la funcionalidad de este proyecto se basa recoger los datos de la api  API pública de Marvel y insertar sus datos en una base de datos propia. En este caso he realizado una base de datos Mongo Atlas.

 Me habría gustado añadir las funcionalidades de añadir,actualizar y eliminar un solo personaje. Pero por falta de tiempo no ha podido ser posible, más adelante subire una nueva versión añadiendo esas funcionalidades.
 
![image](https://user-images.githubusercontent.com/71700574/222485508-560ca9b4-2838-4efe-b4b6-deb11d80525c.png)

Vemos en esta imagen la lista de los personajes, donde su información se encuentra en mi base de datos propia, además de dos botones para poder insertar y eliminar todos los personajes.

## Docker
He de destacar que he añadido un archivo docker, con el objetivo de generar una imagen. Aquí dejo los comandos que he utilizado.

Descagar disco docker openjdk
```
docker pull openjdk    
```

Comando genera el jar
```
mvn clean install  
```

Comando que crea el disco
```
docker build -t "marvel" .  
```

Comando que ejecuta el programa mendiante Docker
```
docker run --name marvel -p 8080 marvel:latest
```
