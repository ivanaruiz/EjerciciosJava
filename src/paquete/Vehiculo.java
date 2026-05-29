package paquete;

//tengo una clase abstracta, entonces no puedo instanciar Vehiculo
public abstract class Vehiculo {
	protected String chofer; //atributo protected
	//significa que las hijas pueden ver este atribujo, y el paquete también
	//pero otras clases dentro de otros paquetes no 
	
	public Vehiculo(String chofer) {
		this.chofer = chofer;
	}
	
	//este metodo no es abstracto, así que lo implemento
	public String desplazarse(String origen, String destino) {
		return "Soy un "  + this.getTipo() + ". Me conduce " + this.chofer + ". \nMe desplazo de " + origen + " a " + destino;
	}
	
	//declaro un metodo abstracto, eso quiere decir que solo pongo la firma
	//pero se implementa en las clases hijas 
	public abstract String getTipo();
}
