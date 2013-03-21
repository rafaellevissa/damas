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
            System.out.println("   1 2 3 4 5 6 7 8");
            for (int i=1;i<9;++i){//percorrendo linhas
                String str = String.valueOf(i);
                System.out.println(str+" | | | | | | | | |");
                for (int j=1;j<9;++j){//percorrendo colunas
                    oCasa[i][j]= new Casa();
                    oCasa[i][j].setStatus(true);
                    if ((i+j)%2==0){
                        oCasa[i][j].setCor("Preta");
                    }else{
                        oCasa[i][j].setCor("Branca");
                    }
                }
            }
	}
}
