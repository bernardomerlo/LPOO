package entidades;

public class Paciente {

	private String nome;
	private String cpf;
	private String dataNascimento;
	private String historico;

	public Paciente() {
	}

	public String getNome() {
		return nome;
	}

	public Paciente(String nome, String cpf, String dataNascimento, String historico) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.historico = historico;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + "\n histórico=" + historico;
	}

}
