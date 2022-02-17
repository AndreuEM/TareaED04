package cuentas;
/**
 * No tengo los conociminetos previos para poder comentar el código, solo hago FOL y Entornos de desarrollo, 
 * ya que fueron las unicas asignaturas de las que pude matricularme.
 * @author Andreu Ensenyat
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterÃs;

    public CCuenta()
    {
    }
/**
 * 
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        saldo=sal;
    }
/**
 * Nos muestra el saldo
 * @return
 */
    public double estado()
    {
        return saldo;
    }
/**
 * 
 * @param cantidad
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * 
 * @param cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getTipoInterÃs() {
		return tipoInterÃs;
	}

	public void setTipoInterÃs(double tipoInterÃs) {
		this.tipoInterÃs = tipoInterÃs;
	}
	
	
}
