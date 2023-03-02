# Marvel-Api

 App sencilla utilizando la información que está en la API pública de Marvel (https://developer.marvel.com/docs)

## Funcionalidad
 En cuanto la funcionalidad de este proyecto se basa recoger los datos de la api  API pública de Marvel y insertar sus datos en una base de datos propia. En este caso he realizado una base de datos Mongo Atlas.

 Me habría gustado añadir las funcionalidades de añadir y actualizar personajes, pero por falta de tiempo no ha podido ser posible. En un futúro subire una función añadiendo esas funcionalidades.
 
![image](https://user-images.githubusercontent.com/71700574/222474445-31d7c15e-3b5b-4fa5-8d8f-4330b6385688.png)

Vemos en esta imagen la lista de los personajes, donde su información se encuentra en mi base de datos propia, y un botón cuya funcionalidad es resetear mi base de datos con los datos de la API pública.

## Docker
He de destacar que he añadido un archivo docker, con el objetivo de generar una imagen. Aquí dejo los comandos que he utilizado.

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
