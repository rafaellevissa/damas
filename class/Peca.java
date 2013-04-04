public class Peca {

	private String Cor;
	private Integer[] Posicao;

	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public Integer getPosicao(Integer i) {
            return Posicao[i];
	}
	public void setPosicao(Integer x, Integer y) {
		Posicao[1]= x;
                Posicao[2]= y;
	}
	public void mover(){

	}
}
