package paquete;

import java.util.ArrayDeque;
import java.util.Deque;

public class Remis extends Vehiculo{
	//es una pila
	private Deque<String> pasajeros = new ArrayDeque<String>();
	
	public Remis(String chofer) {
		super(chofer);
	}

	public void subirPasajero(String nombre) {
		if (this.pasajeros.size() < 5)
			this.pasajeros.push(nombre);
	}
	
	public void bajarPasajero() {
		if (this.pasajeros.size() > 0)
			this.pasajeros.pop();
	}
	
	@Override
	public String getTipo() {
		return "remis";
	}
	
	@Override
	public String desplazarse(String origen, String destino) {
		String frase;
		if (this.pasajeros.size() == 0) {
			frase = "estoy yendo a " + origen + " a recoger a un pasajero";
		}
		else {
			frase = super.desplazarse(origen, destino) + "\nLlevo " + this.pasajeros.size() + " pasajeros";
		}
		return frase;
	}
}
