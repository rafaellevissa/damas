public class Tabuleiro {

	Casa oCasa [][];

	public Casa getoCasa(int l, int c) {
		return oCasa[l][c];
	}
	public void setoCasa(Casa oCasa, int l, int c) {
		this.oCasa[l][c] = oCasa;
	}
	public void criar(){
            oCasa = new Casa[8][8];
            for (int i=1;i>8;++i){
                for (int j=1;j>8;++i){
                    oCasa[i][j]=new Casa();
                }
            }
	}
}
