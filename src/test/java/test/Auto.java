package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int asientosReales = 0;
		for (int i = 0 ; i < asientos.length ; i++) {
			if (asientos[i] != null) {
				asientosReales++;
			}
		}
		return asientosReales;
	}
	
	String verificarIntegridad() {
		if (this.registro != this.motor.registro) {
			return "Las piezas no son originales";
		}
		for (int i = 0; i < asientos.length; i++) {
		    if (asientos[i] != null && asientos[i].registro != this.registro) {
		        return "Las piezas no son originales";
		    }
		}
		return "Auto original";
	}
}