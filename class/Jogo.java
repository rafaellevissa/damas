public class Jogo {
    private boolean status = false;
    public boolean getStatus() {
            return status;
    }
    public void setStatus(boolean status) {
            this.status = status;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Jogador Jogador1 = new Jogador();
        Jogador Jogador2 = new Jogador();
        Jogo oJogo = new Jogo();
        System.out.println("Digite o nome do jogador 1");
        String jname = in.nextLine(); 
        Jogador1.setNome(jname); 
        System.out.println("Digite o nome do jogador 2");
        jname = in.nextLine();
        Jogador2.setNome(jname);
        oJogo.setStatus(true);
        System.out.println("Carregando o jogo...");
        Jogador1.setQtdPecas(12);
        Jogador2.setQtdPecas(12);
        Jogador1.setCor(0);
        Jogador2.setCor(1);
        Tabuleiro oTabuleiro = new Tabuleiro();
        oTabuleiro.criar();
    }
}
