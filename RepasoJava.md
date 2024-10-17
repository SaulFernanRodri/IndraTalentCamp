
## Repaso Java

---
## Herencia

En Java, una clase hija hereda de una clase padre, permitiendo reutilizar código y organizar las clases en una jerarquía.

```java

//Clase Padre
class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String hacerSonido() {
        return "Sonido genérico";
    }
}

// Clase Hija (hereda de Animal)
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);  // Llama al constructor de la clase padre
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }
}

// Clase Hija (hereda de Animal)
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Mishi");

        System.out.println(perro.hacerSonido());  // Salida: Guau
        System.out.println(gato.hacerSonido());   // Salida: Miau
    }
}
```
---
## Polimorfismo

La capacidad de un método para actuar de diferentes maneras dependiendo del objeto que lo invoque. Un mismo método puede tener múltiples implementaciones según la clase que lo defina.

 ```java

public class Main {
    public static void describirAnimal(Animal animal) {
        System.out.println(animal.hacerSonido());
    }

    public static void main(String[] args) {
        Animal perro = new Perro("Firulais");
        Animal gato = new Gato("Mishi");

        describirAnimal(perro);  // Salida: Guau
        describirAnimal(gato);   // Salida: Miau
    }
}
```
---
## Abstracta

Significa que no se puede crear una instancia directamente de esa clase.

```java

// Clase abstracta Persona
public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto (debe ser implementado por las subclases)
    public abstract void mostrarIdentidad();
}

// Clase Medico que hereda de Persona
public class Medico extends Persona {
    private String especialidad;

    public Medico(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarIdentidad() {
        System.out.println("Soy un médico. Mi nombre es " + nombre + " y mi especialidad es " + especialidad);
    }
}
```
---
## Static

El modificador static en Java se usa para definir miembros de clase en lugar de miembros de instancia. Un miembro estático pertenece a la clase en sí, no a una instancia específica de la clase.

Atributos estáticos: Solo se almacena una copia de la variable estática para toda la clase.

Métodos estáticos: Pueden ser llamados sin crear una instancia de la clase.

```java

public class Calculadora {
    // Variable estática (compartida por todas las instancias)
    public static final double PI = 3.14159;

    // Método estático
    public static int sumar(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Acceso a variable estática sin crear una instancia de la clase
        System.out.println("Valor de PI: " + Calculadora.PI);

        // Llamada a un método estático
        int resultado = Calculadora.sumar(5, 3);
        System.out.println("Suma: " + resultado);
    }
}

```
---
## Private

El modificador private se usa para declarar atributos o métodos privados, lo que significa que solo pueden ser accedidos dentro de la misma clase. No se pueden usar fuera de la clase ni por otras clases, lo que garantiza el encapsulamiento y protege la lógica interna de la clase.

```java

public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos para acceder a los atributos privados (Getters y Setters)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Álvaro", 25);

        // Acceso a los atributos privados mediante los métodos públicos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
```
---

## Public

El modificador public permite que un atributo o método sea accesible desde cualquier parte del programa. Los elementos públicos son visibles desde otras clases o paquetes.

```java

public class Vehiculo {
    // Atributos públicos
    public String marca;
    public int año;

    // Constructor
    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    // Método público
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Año: " + año);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 2021);

        // Acceso directo a los atributos públicos
        System.out.println("Marca: " + vehiculo.marca);
        System.out.println("Año: " + vehiculo.año);

        // Llamada al método público
        vehiculo.mostrarDetalles();
    }

}
```
---
        
## Protected

Accesible por las clases herederas, pero la clase padre no puede acceder a los atributos de la clase hija.

---
## Expresiones Lamda

Las expresiones lambda son funciones anónimas que permiten pasar bloques de código como argumentos a métodos o funciones. Se utilizan para simplificar la sintaxis y mejorar la legibilidad del código.
```java
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usando una expresión lambda para imprimir cada número
        numeros.forEach(n -> System.out.println(n));
    }
}
```
---
## Interfaz `Consumer`

La interfaz `Consumer<T>` es parte del paquete `java.util.function` y está diseñada para operaciones que aceptan un único argumento de entrada y no devuelven ningún resultado. Es una interfaz funcional, lo que significa que tiene un solo método abstracto.

### Método principal

```java
void accept(T t);
```

El método `accept` toma un argumento de tipo `T` y no devuelve nada. Generalmente, se utiliza para ejecutar algún tipo de operación con el objeto proporcionado, como imprimirlo, modificar su estado, etc.

### Ejemplo

A continuación, un ejemplo de cómo se puede usar un `Consumer` en Java:

```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printConsumer = s -> System.out.println(s);
        
        printConsumer.accept("Hola Mundo!"); // Imprime: Hola Mundo!
    }
}
```

En este caso, el `Consumer` toma un `String` como entrada y simplemente lo imprime en la consola.

### Aplicaciones comunes
- Utilizado en métodos de procesamiento de colecciones como `forEach`.
- Puede usarse en flujos (Streams) para realizar operaciones sobre los elementos del flujo sin modificar su resultado.

---

## Interfaz `Runnable`

La interfaz `Runnable` está en el paquete `java.lang` y es una de las interfaces más básicas de Java, utilizada para representar una tarea que se puede ejecutar en un hilo. Esta interfaz es funcional, ya que tiene un solo método abstracto.

### Método principal

```java
void run();
```

El método `run` no toma parámetros ni devuelve nada. Generalmente, se usa para definir el código que se ejecutará en un hilo separado.

### Ejemplo

Aquí un ejemplo básico del uso de `Runnable`:

```java
public class RunnableExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Tarea ejecutándose en un hilo.");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
```

En este ejemplo, la interfaz `Runnable` se usa para definir una tarea que imprime un mensaje en la consola. Esta tarea se ejecuta en un hilo separado utilizando la clase `Thread`.

### Aplicaciones comunes
- Ejecutar tareas en un nuevo hilo de manera asíncrona.
- Es la base para crear hilos personalizados o administrar el comportamiento de hilos en clases como `ThreadPoolExecutor`.

---

## Comparación entre `Consumer` y `Runnable`

| Aspecto       | `Consumer<T>`                                    | `Runnable`                                  |
|---------------|--------------------------------------------------|---------------------------------------------|
| Paquete       | `java.util.function`                             | `java.lang`                                |
| Método        | `accept(T t)`                                    | `run()`                                     |
| Parámetros    | Acepta un argumento de entrada de tipo `T`        | No acepta parámetros                       |
| Valor de retorno | No devuelve valor (void)                        | No devuelve valor (void)                   |
| Uso principal | Procesar un valor sin devolver nada               | Ejecutar una tarea en un hilo               |

---

## Sintaxis de manejo de excepciones

Java utiliza los bloques `try`, `catch`, `finally`, `throw` y `throws`para manejar excepciones:

### Estructura básica

```java
try {
    // Código que puede lanzar una excepción
} catch (TipoDeExcepcion e) {
    // Código para manejar la excepción
} finally {
    // Código que se ejecuta siempre, haya o no una excepción
}
```

### Ejemplo

```java
public class ExcepcionEjemplo {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Esto lanzará ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}
```

### Uso del bloque `finally`

El bloque `finally` se ejecuta siempre, independientemente de si se produjo una excepción o no. Es útil para liberar recursos, como cerrar archivos o conexiones a bases de datos.

### Lanzamiento de excepciones con `throw` y `throws`

```java
public class LanzarExcepcion {
    public static void main(String[] args) {
        try {
            lanzarExcepcion();
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static void lanzarExcepcion() throws IllegalArgumentException{
        throw new IllegalArgumentException("Este es un argumento ilegal");
    }
}
```

## Creación de excepciones personalizadas

Es posible crear clases de excepciones personalizadas que extiendan de `Exception` o `RuntimeException`:

```java
class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class ExcepcionPersonalizadaEjemplo {
    public static void main(String[] args) {
        try {
            lanzarMiExcepcion();
        } catch (MiExcepcion e) {
            System.out.println("Capturada excepción personalizada: " + e.getMessage());
        }
    }

    public static void lanzarMiExcepcion() throws MiExcepcion {
        throw new MiExcepcion("Esto es una excepción personalizada");
    }
}
```

## Principales tipos de excepciones en Java

- **`NullPointerException`**: Ocurre cuando se intenta acceder a un objeto cuyo valor es `null`.
- **`ArrayIndexOutOfBoundsException`**: Ocurre cuando se accede a una posición fuera de los límites de un array.
- **`ClassNotFoundException`**: Ocurre cuando la JVM no puede encontrar la clase especificada.
- **`IOException`**: Relacionada con la entrada/salida, como la lectura o escritura de archivos.

