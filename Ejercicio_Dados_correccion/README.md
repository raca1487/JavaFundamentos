# Examen Fundamentos Java 4 (30-08-2021)
### Resuelto por @RaCa1487

Vamos a crear algunas partes del código de un juego con dados. Se tendrá muy en cuenta **observar la guía de estilo** marcada para el curso, **pudiéndole penalizar hasta en un punto sobre diez la calificación final**.

Para poder realizar el examen es necesario usar el proyecto alojado en este repositorio. Haga un fork de este proyecto, póngalo con **visibilidad privado** y compruebe que está el repositorio correctamente en local. No siga hasta que haya puesto el repositorio en privado.

El examen deberá ser grabado a doble pantalla completa con OBS sin cortes, pausas ni interrupciones. Deberá verse en ella el mensaje hecho por el profesor y la subida del commit final al repositorio personal (el privado del punto anterior).

**Lo puntos evaluables, y ponderados con el valor entre paréntesis, son:**

1. (1 punto) Todo el código que implemente pertenecerá al paquete `es.lanyu.dados` excepto el que contenga el `main` que estará en la clase `com.dados.Partida`.
2. (1 punto) Crear la clase `Dado` para guardar las caras de un dado y la cara vista si se ha lanzado. Tenga en cuenta que se usará para distintos tipos de dados (parchís, poker, etc...).
    > NOTA: La clase creada no debe tomarse con el nombre definitivo. Tendrá que refactorizarlas a lo largo del examen según se vayan añadiendo mejoras y hará falta crear una jerarquía y extraer una o varias interfaces de `Dado` por ejemplo.
    >
3. (2 puntos) Los dados numéricos deben tener dos constructores:
    * (1 punto) Uno que admita un entero `numeroCaras` que instancie un dado con tantas caras numéricas como para ir desde el 1 hasta el `numeroCaras`.
    * (1 punto) El constructor por defecto creará un dado del 1 al 6.
4. (5 puntos) Vamos a añadir funcionalidad:
    * (1 punto) Cree un método llamado `lanzar` que asigne un valor aleatorio a la cara vista (cara que mira hacia arriba con el dado en reposo). **Siempre tenga en cuenta la mayor reutilización y flexibilidad de código posible**.
    * (2 puntos) La representación en texto de los dados será la cara vista y el rango del dado con formato `vista (min - max)`(por ejemplo tirando un dado de seis caras donde se obtenga un 2 a la salida por consola se vería `2 (1 - 6)`).
    * (2 puntos) Cree una clase llamada `Tirada`que sirva para realizar varios lanzamientos de un dado. Haga un método llamado `hacerTirada` con dos sobrecargas:
        * (1 punto) La primera que acepte un `String` con el formato "`ndm`" donde `n` indica el número de lanzamientos del dado y `m` el número de caras numéricas.

            > Por ejemplo: `2d8` sería tirar dos veces un dado de 8 caras numéricas del 1 al 8.

        * (1 punto) La segunda aceptará un `dado` y un entero `numeroLanzamientos` para indicar cuántas veces lanzar el dado pasado.
        * El método devolverá un array con las caras vistas en cada lanzamiento.
    

5. (3 puntos) Compruebe ahora el funcionamiento de sus métodos con una librería externa. Uilice la clase `com.github.dice.PokerDice` para poder generar dados de poker y compruebe que puede integrarla con sus métodos llamando a método `hacerTirada(dadoPoker, 3)` e imprimiendo el array resultante.
    > NOTA: `PokerDice` tiene el método `roll` para lanzar el dado, `getCurrent()` para obtener la cara vista que devuelve el tipo `PokerFace` que es un enum con los siguientes valores:
    TEN(10, "10"),
    JACK(11, "J"),
    QUEEN(12, "Q"),
    KING(13, "K"),
    ACE(1, "Ace"),
    JOCKER(15, "Joker");
    Se puede conseguir un array con estos valores usando su método `getDiceFaces()`. `PokerFace` tiene el método `getRank()` para conocer el valor numérico de la cara (primer parámetro del constructor) y tiene implementado `toString()` (que devuelve el segundo parámetro).

6. (3 puntos) Implemente un **orden natural** en los dados que será de mayor a menor respecto a la cara vista para cada uno. Para ello cree una `Collection` con tres dados numéricos, láncelos una vez cada uno y ordene esa colección. (Ejemplo: Si en un dado sale un 3, en otro un 2 y el último un 5 la salida esperada es `[5 (1-6), 3 (1-6), 2 (1-6)]`).
7. (3 puntos) Cree un comparador para ordenar varias tiradas. Añada tres tiradas de `2d8` a una colección y ordénala con los siguientes criterios:
    1. (1 punto) De mayor a menor suma total en cada tirada `2d8`.
    2. (1 punto) En caso de empate en la suma total, la que haya tenido una mayor cara vista en el último lanzamiento (ejemplo: `[2, 8]: 10 > [2, 2]: 4 > [3, 1]: 4 > FIN`).
8. (6 puntos) Si hasta ahora ha estado tratando el tipo para las caras de los dados como un entero, hay que cambiarlo a un tipo variable que sea `Comparable`. Así, la cara vista será del tipo `T` y las caras del dado serán del tipo `T[]`. Refactorice el código necesario para que el dado de Poker implemente `Dado<PokerFace>` (`PokerFace` actualmente implementa `Comparable<PokerFace>`) y el dado numérico implemente `Dado<Integer>`.
    > NOTA: Es muy importante lograr la máxiima reutilización en el código.

## Entrega de examen

Acuérdese de hacer al menos un **commit con el mensaje `Entrega examen`** con el último estado a guardar. Este commit debe tener sólo dos ficheros necesarios, añadir binarios por ejemplo será considerado una mala práctica penalizable. Compruebe que su commit está subido a su fork. Además copie su grabación de video en formato `.mkv` como se le ha indicado antes de comenzar el examen en la ubicación que se le indique.