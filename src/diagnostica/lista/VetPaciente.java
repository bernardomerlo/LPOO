package diagnostica.lista;

import diagnostica.entidades.Paciente;

public class VetPaciente {

    private Paciente[] vet;
    private int nElem;

    public VetPaciente(int tamanho) {
        this.nElem = 0;
        this.vet = new Paciente[tamanho];
    }

    public Paciente getPaciente(int pos) {
        if (pos >= 0 && pos < this.nElem) {
            return this.vet[pos];
        }
        return null;
    }

    public int pesquisa(String cpf) {
        for (int i = 0; i < nElem; i++) {
            if (vet[i].getCpf().equals(cpf)) {
                return i;
            }
        }
        return -1;
    }

    public int insere(Paciente pacienteNovo) {
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
        int pos = this.pesquisa(cpf);
        if (pos == -1) {
            return false;
        } else {
            this.vet[pos] = null;
            return true;
        }
    }

    public void mostraVetor() {
        for (Paciente p : this.vet) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
}
