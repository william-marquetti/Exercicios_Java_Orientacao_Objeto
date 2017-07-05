package orientacao_a_objetos;

import java.util.Date;

public class CartaoDeCredito {
	private String numero;
	private Date dataValidade;
	private Cliente cliente;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CartaoDeCredito(String numero) {
		this.numero = numero;
	}
}
