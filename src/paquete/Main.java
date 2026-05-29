package paquete;

public class Main {

	public static void main(String[] args) {
		Automovil a = new Automovil("pepe");
		
		a.subirPasajero("pedro");
		System.out.println(a.desplazarse("palermo", "recoleta"));
		a.bajarPasajero();
		
		System.out.println();
		
		Remis r = new Remis("osvaldo");
		System.out.println(r.desplazarse("almagro", "palermo"));
		r.subirPasajero("pasajero1");
		r.subirPasajero("pasajero2");
		System.out.println(r.desplazarse("almagro", "palermo"));
		r.bajarPasajero();
		r.bajarPasajero();
		System.out.println(r.desplazarse("constitucion", "flores"));
	
	}

}
