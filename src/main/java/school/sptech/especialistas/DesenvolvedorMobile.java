package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {
    private String plataforma;
    private String linguagem;
    private Integer horasPrototipacao;

    public DesenvolvedorMobile() {

    }


    public DesenvolvedorMobile(String nome, Integer qtdHoras, Double valorHora, Integer horasPrototipacao, String linguagem, String plataforma) {
        super(nome, qtdHoras, valorHora);
        this.horasPrototipacao = horasPrototipacao;
        this.linguagem = linguagem;
        this.plataforma = plataforma;
    }


    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (200 * horasPrototipacao);
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
