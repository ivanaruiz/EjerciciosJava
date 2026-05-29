package paquete;

//clase hija
public class Automovil extends Vehiculo{
	private String pasajero;
	
	public Automovil(String chofer) {
		super(chofer);
	}
	
	//son metodos de la clase hija
	public void subirPasajero(String nombre)
	{
		this.pasajero = nombre;
	}
	
	public void bajarPasajero()
	{
		this.pasajero = null;
	}
	
	//este es de la clase madre, pero la sobreescribe porque
	//la madre la tenia abstracta
	@Override
	public String getTipo() {
		return "automovil";
	}
}
