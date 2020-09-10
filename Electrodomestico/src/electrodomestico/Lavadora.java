

package electrodomestico;

//clase hija que hereda de Electrodomestico
public class Lavadora extends Electrodomestico
{
    private float carga;

    //Constructor por defecto
    Lavadora()
    {
        super();    //llamo a constructor de clase padre
        this.carga = 5;
    }

    //Constructor parametrizado
    Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga)
    {
        super(precioBase, color, consumoEnergetico, peso);  
        
        this.carga = carga;
            precioFinal();    
    }

    //Método
    public void precioFinal()
    {
        if(this.carga>30)
            {
                float precio = getPrecioBase() + 50;
                super.setPrecioBase(precio);    //como el precioBase es atributo privado
                                                //uso un setter para cambiar su valor desde aquí
            }
        
    }

    //Getter
    public float getCarga()
    {
        return carga;
    }
    
}
