package negocio;

import java.util.Calendar;
import java.util.Date;
	//Propriedades da classe
public class Compra {
	private Produto objProduto = null;
	private int quantidade = 0;
	private Date data = null;
	private String cartao = "";
	
	//Metodos construtores da classe
	
	
	public Compra(Produto objProduto, int quantidade, Date data, String cartao) {
		this.objProduto = objProduto;
		this.quantidade = quantidade;
		this.data = data;
		this.cartao = cartao;
	}

	public Compra() {
	
	}

	//Get and Set
	public String getDataTela() {
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(data);
		
		return objCalendario.get(Calendar.DAY_OF_MONTH) + "/" +
				(objCalendario.get(Calendar.MONTH) + 1) + "/" +
				objCalendario.get(Calendar.YEAR);
	}
	
	public String getDataBanco() {
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(data);
		
		return objCalendario.get(Calendar.YEAR) + "-" +
				(objCalendario.get(Calendar.MONTH) + 1) + "-" +
				objCalendario.get(Calendar.DAY_OF_MONTH);
	
	}
	
	public void setDataTela(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.DAY_OF_MONTH,
						Integer.parseInt
						(data.substring(0,2)));
		objCalendario.set(Calendar.MONTH,
				Integer.parseInt
				(data.substring(3,5)) - 1);
		objCalendario.set(Calendar.YEAR,
				Integer.parseInt
				(data.substring(6,10)));
		
		setData(objCalendario.getTime());
	}
	
	public void setDataBanco(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.YEAR,
						Integer.parseInt
						(data.substring(0, 4)));
		objCalendario.set(Calendar.MONTH,
				Integer.parseInt
				(data.substring(5,7)) - 1);
		objCalendario.set(Calendar.DAY_OF_MONTH,
				Integer.parseInt
				(data.substring(8,10)));
		
		setData(objCalendario.getTime());
	}
	
	
	
	public Produto getObjProduto() {
		return objProduto;
	}

	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	
}
