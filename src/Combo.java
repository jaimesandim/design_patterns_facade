public class Combo {
	private Burguer burguer;
	private Sobremesa sobremesa;
	private Bebida bebida;

	public Combo(){
		burguer = new Burguer();
		sobremesa = new Sobremesa();
		bebida = new Bebida();
	}

	public void CriarCombo(int tipo){
		switch(tipo){
			case 1:
				burguer.setDescricao("X-Burguer");
				burguer.setPreco(19.90);
				burguer.setGramas(100);
				sobremesa.setDescricao("Sorvete");
				sobremesa.setPreco(3.50);
				sobremesa.setTamanho("Pequeno");
				bebida.setDescricao("Coca Cola");
				bebida.setPreco(5);
				bebida.setMl(300);
				break;
			case 2:
				burguer.setDescricao("X-Tudo");
				burguer.setPreco(38.50);
				burguer.setGramas(280);
				sobremesa.setDescricao("Açaí");
				sobremesa.setPreco(21.00);
				sobremesa.setTamanho("Médio");
				bebida.setDescricao("Coca Cola");
				bebida.setPreco(10);
				bebida.setMl(700);
                break;
			default:
                break;
		}

	}

	public String MostrarCombo(){
		return "\nDescrição: " + burguer.getDescricao() + "\n" + "Preço: R$ " + burguer.getPreco() + "\n" + "Gramas: " + burguer.getGramas() + "g" + "\n\n" +
				"Descrição: " + sobremesa.getDescricao() + "\n" + "Preço: R$ " + sobremesa.getPreco() + "\n" + "Tamanho: " + sobremesa.getTamanho() + "\n\n" +
				"Descrição: " + bebida.getDescricao() + "\n" + "Preço: R$ " + bebida.getPreco() + "\n" + "Ml's: " + bebida.getMl() + "ml";
	}

	@Override
	public String toString(){
		return MostrarCombo();
	}
}
