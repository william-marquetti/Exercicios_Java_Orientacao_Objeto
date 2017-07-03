package orientacao_a_objetos;

import java.util.Date;

public class CartaoDeCredito {
	String numero;
	Date dataValidade;
	Cliente cliente;

	public CartaoDeCredito(String numero) {
		this.numero = numero;
	}
}
