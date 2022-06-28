package jdbc.modelo;

import java.sql.Date;

public class Reserva {
	private Integer id;
	private Date fechaE;
	private Date fechaS;
	private String valor;
	private String formaPago;
	
	public Reserva(Date fechaE, Date fechaS, String valor, String formaPago) {
		super();
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaE() {
		return fechaE;
	}

	public Date getFechaS() {
		return fechaS;
	}

	public String getValor() {
		return valor;
	}

	public String getFormaPago() {
		return formaPago;
	}
	
	
}


