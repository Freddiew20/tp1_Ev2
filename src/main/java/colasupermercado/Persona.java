package colasupermercado;

public class Persona {
	private String nombre;
	private int edad;
	private double compra;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getCompra() {
		return compra;
	}
	public void setCompra(double compra) {
		this.compra = compra;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(compra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Double.doubleToLongBits(compra) != Double.doubleToLongBits(other.compra))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", compra=" + compra + "]";
	}
	
	public void pedirPersona(){
		this.nombre=PedirDatos.leerCadena("Dime el nombre del cliente");
		this.edad=PedirDatos.leerEntero("Dime la edad");
		this.compra=PedirDatos.leerDecimal("Dime el importe de la compra");
	}
}
