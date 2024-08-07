package lista;

import entidades.Paciente;

public class VetPaciente {

	private Paciente[] vet;
	private int nElem;

	public VetPaciente(int tamanho) {
		this.nElem = 0;
		this.vet = new Paciente[tamanho];
	}

	public Paciente getPaciente(int pos) {
		if (pos > nElem || pos < 0) {
			return null;
		}
		return vet[pos];
	}

	public int pesquisa(String cpf) {
		if (nElem > 0) {
			for (int i = 0; i < nElem; i++) {
				if (vet[i].getCpf().equals(cpf)) {
					return i;
				}
			}
		}
		return -1;
	}

	public int inserePaciente(Paciente pacienteNovo) {
		boolean existe = false;
		if (this.vet.length > this.nElem) {
			for (Paciente p : this.vet) {
				if (p != null) {
					if (p.getCpf().equals(pacienteNovo.getCpf())) {
						existe = true;
					}
				}
			}
			if (!existe) {
				this.vet[nElem] = pacienteNovo;
				this.nElem++;
				return 0;
			} else {
				return -2;
			}
		}
		return -1;
	}

	public boolean remove(String cpf) {
		if (nElem > 0) {
			for (Paciente p : vet) {
				if (p.getCpf().equals(cpf)) {
					return true;
				}
			}
		}
		return false;
	}
}
