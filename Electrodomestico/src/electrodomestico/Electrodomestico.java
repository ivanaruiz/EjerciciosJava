/*
Crear una clase llamada Electrodoméstico con las siguientes características:
- Sus atributos son precio base, color, consumo energético (letras entre A
y F) y peso.
- Por defecto, el color sera blanco, el consumo energético sera F, el
precioBase es de $100 y el peso de 5 kg.
- Los constructores que se implementaran serán:
    . Un constructor por defecto.
    . Un constructor parametrizado con el precio y peso
    . Un constructor parametrizado con todos los atributos.
- Los métodos que implementara serán:
    . Métodos get de todos los atributos.
    . comprobarConsumoEnergetico(char letra): comprueba que la letra
    es correcta, sino es correcta usara la letra por defecto. Se invocara al
    crear el objeto y no sera visible.
    . precioFinal():, si tiene un peso mayor de 3 kg, aumentara el precio
    $10, sino es así no se incrementara el precio.

Crearemos una subclase llamada Lavadora con las siguientes características:
- Su atributo es carga, ademas de los atributos heredados.
- Por defecto, la carga es de 5 kg.
- Los constructores que se implementaran serán:
    . Un constructor por defecto.
    . Un constructor con la carga y el resto de atributos heredados.
    Recuerda que debes llamar al constructor de la clase padre.
- Los métodos que se implementara serán:
    . Método get de carga.
    . precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio
    $50, sino es así no se incrementara el precio. Llama al método padre
    y añade el código necesario.
*/

package electrodomestico;


public class Electrodomestico {

    //Atributos de la clase Electrodomestico
    private float precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;

    //Constructor por defecto 
    Electrodomestico()
    {
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }
    
    //Constructor parametrizado
    Electrodomestico(float precioBase, float peso)
    {
        this();
        this.precioBase= precioBase;
        this.peso = peso;
            precioFinal();
    }

    //Constructor parametrizado
    Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso)
    {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
            comprobarConsumoEnergetico(this.consumoEnergetico);
        this.peso = peso;
            precioFinal();
            
    }

    //Getters
    public float getPrecioBase()
    {
        return precioBase;
    }

    public String getColor()
    {   
        return color;
    }

    public char getConsumoEnergetico()
    {
        return consumoEnergetico;
    }

    public float getPeso()
    {
        return peso;
    }

    //Métodos
    public void comprobarConsumoEnergetico(char letra)
    {
        if(this.consumoEnergetico > 'F')
            this.consumoEnergetico = 'F';
    }

    public void precioFinal()
    {
        if(this.peso > 3)
            this.precioBase += 10;
    }

    //Setter
    public void setPrecioBase(float pre)
    {
        this.precioBase = pre;
    }
    
    
    public static void main(String[] args) 
    {
        //creo objetos de ambas clases y los muestro
        Electrodomestico e1 = new Electrodomestico (2000, "gris", 'C', 200);

        System.out.println("Precio base: " + e1.getPrecioBase() + "  Color: " + e1.getColor() + "  Consumo energetico: "
                            + e1.getConsumoEnergetico() + "  Peso: " + e1.getPeso());


        Lavadora lav = new Lavadora(2000, "gris", 'M', 100, 400);
        
        System.out.println("Precio base: " + lav.getPrecioBase() + "  Color: " + lav.getColor() + "  Consumo energetico: "
                            + lav.getConsumoEnergetico() + "  Peso: " + lav.getPeso() + "  Carga: " + lav.getCarga());
    
    }

}
