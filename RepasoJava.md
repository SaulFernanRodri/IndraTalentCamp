
**Repaso Java**

**Herencia**

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

**Polimorfismo**

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

**Abstracta**

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

**Static**

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

**Private**

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

**Public**

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

**Protected**

Accesible por las clases herederas



