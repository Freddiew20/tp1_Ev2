package colasupermercado;

public class ColaSupermercado {
	private Persona[] clientes=new Persona[100];
	private int posicion=0;
	private double totalcaja=0;
	
	public void menu(){
		int opcion = 0;
		do {		
			System.out.println("1. Nuevo cliente");
			System.out.println("2. Paga Cliente");
			System.out.println("3. Mostrar primer cliente");
			System.out.println("4. Muestra clientes en la cola");
			System.out.println("5. Mostrar total caja");
			System.out.println("0. Salir.");
			opcion=PedirDatos.leerEntero("Introduzca una opción.");
		
			switch (opcion) {
			case 1:
				nuevoCliente();
				break;
			case 2:
				pagaCliente();
				break;
			case 3:
				muestraPrimerCliente();
				break;
			case 4: 
				muestraCola();
				break;
			case 5:
				muestraTotalCaja();
				break;
			case 0:
				
				break;
			default:
				System.out.println("Debe introducir un número del 0 al 5.");
				break;
			}
		} while (opcion!=0);
		
	}

	private void muestraCola() {
		for(int i=0;i<posicion;i++){
			System.out.println(clientes[i]);
		}
	}

	private void muestraTotalCaja() {
		System.out.println("El importe existente en la caja es "+this.totalcaja);
	}

	private void muestraPrimerCliente() {
		System.out.println(clientes[0]);
	}

	private void pagaCliente() {
		this.totalcaja+=clientes[0].getCompra();
		System.out.println("El cliente "+clientes[0].getNombre()+" ha pagado y se ha ido");
		for(int i=0;i<posicion;i++){
			clientes[i]=clientes[i+1];
		}
		posicion--;
	}

	private void nuevoCliente() {
		Persona p=new Persona();
		p.pedirPersona();
		if(existePersona(p.getNombre())){
			System.out.println("El cliente ya está en la cola");
			return;
		}
		clientes[posicion]=p;
		posicion++;
	}
	
	private boolean existePersona(String nombre){
		for(int i=0;i<posicion;i++){
			if(clientes[i].getNombre().equals(nombre)){
				return true;
			}
		}
		
		return false;
	}

}
