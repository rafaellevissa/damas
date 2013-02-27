
public class Jogada {

	Integer Status;
	boolean Turno;
	Jogador oJogador;
	
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public boolean isTurno() {
		return Turno;
	}
	public void setTurno(boolean turno) {
		Turno = turno;
	}
	public Jogador getoJogador() {
		return oJogador;
	}
	public void setoJogador(Jogador oJogador) {
		this.oJogador = oJogador;
	}
	
	

}
