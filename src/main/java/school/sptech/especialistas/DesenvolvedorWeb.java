package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorWeb extends Desenvolvedor {
    private String backend;
    private String frontend;
    private String sgbd;
    private Integer horasMentoria;

    public DesenvolvedorWeb(){

    }


    public DesenvolvedorWeb(String nome, Integer qtdHoras, Double valorHora, String backend, String frontend, Integer horasMentoria, String sgbd) {
        super(nome, qtdHoras, valorHora);
        this.backend = backend;
        this.frontend = frontend;
        this.horasMentoria = horasMentoria;
        this.sgbd = sgbd;
    }

    @Override
    public Double calcularSalario() {


        return super.calcularSalario() + (300 * horasMentoria);
    }


    public Boolean isFullstack(){
        if(backend != null && frontend != null && sgbd != null){
            return true;
        }

        return false;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public Integer getHorasMentoria() {
        return horasMentoria;
    }

    public void setHorasMentoria(Integer horasMentoria) {
        this.horasMentoria = horasMentoria;
    }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }
}
