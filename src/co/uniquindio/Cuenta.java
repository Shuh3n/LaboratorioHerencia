package co.uniquindio;

import java.util.Objects;

public class Cuenta {
	
	private float saldo;
	private int numConsignaciones;
	private int numRetiros;
	private float tasaAnual;
	private float comisionMensual;
	
	public Cuenta() {
		super();
	}

	public Cuenta(float saldo, int numConsignaciones, int numRetiros, float tasaAnual, float comisionMensual) {
		super();
		this.saldo = saldo;
		this.numConsignaciones = numConsignaciones;
		this.numRetiros = numRetiros;
		this.tasaAnual = tasaAnual;
		this.comisionMensual = comisionMensual;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumConsignaciones() {
		return numConsignaciones;
	}

	public void setNumConsignaciones(int numConsignaciones) {
		this.numConsignaciones = numConsignaciones;
	}

	public int getNumRetiros() {
		return numRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comisionMensual, numConsignaciones, numRetiros, saldo, tasaAnual);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Float.floatToIntBits(comisionMensual) == Float.floatToIntBits(other.comisionMensual)
				&& numConsignaciones == other.numConsignaciones && numRetiros == other.numRetiros
				&& Float.floatToIntBits(saldo) == Float.floatToIntBits(other.saldo)
				&& Float.floatToIntBits(tasaAnual) == Float.floatToIntBits(other.tasaAnual);
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numConsignaciones=" + numConsignaciones + ", numRetiros=" + numRetiros
				+ ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	
	
	public void consignarCuenta(Cuenta cuenta, float valor) {
		float saldo = cuenta.getSaldo();
		saldo += valor;
		cuenta.setSaldo(saldo);
		cuenta.setNumConsignaciones(numConsignaciones++);
	}
	
	public void retirarCuenta(Cuenta cuenta, float valor) {
		float saldo = cuenta.getSaldo();
		if(valor <= saldo) {
			saldo = saldo-valor;
			cuenta.setSaldo(saldo);
			cuenta.setNumRetiros(numRetiros++);
		}
		
	}
	public void calcularInteres() {
		
	}
	
	public void extractoMensual() {
		
	}
	
	
	
	
	
	
	
	

}
