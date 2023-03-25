package co.uniquindio;

import java.util.Objects;

public class CuentaAhorros extends Cuenta {
	
	private boolean estadoCuenta;

	public CuentaAhorros() {
		super();
	}

	public CuentaAhorros(boolean estadoCuenta) {
		super();
		this.estadoCuenta = estadoCuenta;
	}

	public boolean isEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(boolean estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(estadoCuenta);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaAhorros other = (CuentaAhorros) obj;
		return estadoCuenta == other.estadoCuenta;
	}
	
	public void verificarEstadoCuenta(CuentaAhorros cuenta) {
		if(cuenta.getSaldo() > 10000) {
			setEstadoCuenta(true);
		}
		else {
			setEstadoCuenta(false);
		}
		
		
	}
	
	public float calcularExtracto(CuentaAhorros cuenta) {
		float extracto = cuenta.getComisionMensual() ;
		if(cuenta.isEstadoCuenta()) {
			int numRetirosExtras = cuenta.getNumRetiros();
			if(numRetirosExtras > 4) {
				numRetirosExtras = numRetirosExtras - 4;
				extracto += numRetirosExtras * 1000;
				
			}
			
			
		}
		return extracto;
	}
		
	
	
	public void imprimir(CuentaAhorros cuenta) {
		Funciones.imprimir("Saldo de la cuenta:  " + cuenta.getSaldo() + "\nComisión mensual:  " + calcularExtracto(cuenta) + 
				"\nNúmero de consignaciones:  " + cuenta.getNumConsignaciones() + "\nNúmero de retiros:  " + cuenta.getNumRetiros());
	}
	
	
	
	
	
}
