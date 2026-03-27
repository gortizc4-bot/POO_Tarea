package Encapsulacion;

public class Main {

    public static void main(String[] args) {
        personas();
        rectangulos();
        productos();
        cuenta();
        libros();
        calculadora();
        fechas();
    }

    public static void personas() {
        System.out.println("\nPERSONAS");

        Persona p1 = new Persona("Giselle", "Calvillo", 19);
        Persona p2 = new Persona("Sucely", "Palma", 21);
        Persona p3 = new Persona("Briseyda", "Pivaral", 30);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
    }

    public static void rectangulos() {
        System.out.println("\nRECTANGULOS");

        Rectangulo r1 = new Rectangulo(9, 6);
        Rectangulo r2 = new Rectangulo(3, 10);

        System.out.println("Area R1: " + r1.area());
        System.out.println("Area R2: " + r2.area());

        if (r1.area() > r2.area()) {
            System.out.println("R1 tiene mayor área");
        } else {
            System.out.println("R2 tiene mayor área");
        }
    }

    public static void productos() {
        System.out.println("\nPRODUCTOS");

        Producto prod1 = new Producto("001", "Laptop", 4500);
        Producto prod2 = new Producto("002", "Mouse", 50);

        prod1.aplicarDescuento(10);
        prod2.aplicarDescuento(20);

        prod1.mostrar();
        prod2.mostrar();
    }

    public static void cuenta() {
        System.out.println("\nCUENTA");

        Cuenta cuenta = new Cuenta("Giselle", 10000);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000); // prueba de error
        cuenta.mostrarSaldo();
    }

    public static void libros() {
        System.out.println("\nLIBROS");

        Libro l1 = new Libro("Libro A", "Autor A", 150);
        Libro l2 = new Libro("Libro B", "Autor B", 350);
        Libro l3 = new Libro("Libro C", "Autor C", 500);

        if (l1.esLargo()) l1.mostrar();
        if (l2.esLargo()) l2.mostrar();
        if (l3.esLargo()) l3.mostrar();
    }

    public static void calculadora() {
        System.out.println("\nCALCULADORA");

        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(7, 7));
        System.out.println("Resta: " + calc.restar(3, 5));
        System.out.println("Multiplicación: " + calc.multiplicar(8, 5));
        System.out.println("División: " + calc.dividir(10, 0));
    }

    public static void fechas() {
        System.out.println("\nFECHAS");

        Fecha f1 = new Fecha(10, 5, 2026);
        Fecha f2 = new Fecha(32, 1, 2026);
        Fecha f3 = new Fecha(15, 13, 2026);

        System.out.println("Fecha 1 válida: " + f1.esValida());
        System.out.println("Fecha 2 válida: " + f2.esValida());
        System.out.println("Fecha 3 válida: " + f3.esValida());
    }
}