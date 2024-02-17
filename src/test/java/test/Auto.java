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
		int numeroAsientos = 0;
		for (int i = 0 ; i < asientos.length ; i++) {
			if (asientos[i] != null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	
	String verificarIntegridad() {
		String respuesta = null;
		if (this.registro == this.motor.registro) {
			for (int i = 0 ; i < asientos.length ; i++) {
				if (asientos[i] != null) {
					if (asientos[i].registro == registro) {
						respuesta = "Auto original";
					}
					else {
						respuesta = "Las piezas no son originales";
					}
				}
			}
			respuesta = "Auto original";
		}
		return respuesta;
	}	
}