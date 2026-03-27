package Encapsulacion;

public class Producto {
		
		    private String codigo;
		    private String nombre;
		    private double precio;

		    public Producto(String codigo, String nombre, double precio) {
		        this.codigo = codigo;
		        this.nombre = nombre;
		        this.precio = precio;
		    }

		    public void aplicarDescuento(double porcentaje) {
		        precio = precio - (precio * porcentaje / 100);
		    }

		    public void mostrar() {
		        System.out.println(nombre + " (" + codigo + ") - Precio: Q" + precio);
		    }
		}
	


