package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria() {

    }

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<Desenvolvedor>();
    }

    public void contratar(Desenvolvedor desenvolvedor) {
        if(vagas > desenvolvedores.size()) {
            desenvolvedores.add(desenvolvedor);
        }


    }

    public Double getTotalSalarios(){
        Double total = 0.0;
        for(Desenvolvedor desenvolvedor : desenvolvedores){
            total += desenvolvedor.calcularSalario();
        }

        return total;
    }





    public void contratarFullstack(DesenvolvedorWeb desenvolvedor){
        if(desenvolvedor.isFullstack()){
            contratar(desenvolvedor);
        }
    }


    public Integer qtdDesenvolvedoresMobile(){
        int cont = 0;
        for(Desenvolvedor desenvolvedor : desenvolvedores){
            if(desenvolvedor instanceof DesenvolvedorMobile){
                cont ++;
            }
        }

        return cont;
    }

    public List<Desenvolvedor> buscarPorSalarioMaiorIgualQue(Double salario){
        List<Desenvolvedor> desenvolvedoresRicos = new ArrayList<>();

        for(Desenvolvedor desenvolvedor : desenvolvedores){
            if(desenvolvedor.calcularSalario() >= salario){
                desenvolvedoresRicos.add(desenvolvedor);
            }
        }

        return desenvolvedoresRicos;
    }


    public Desenvolvedor buscarMenorSalario(){
        if(desenvolvedores.isEmpty()){
            return null;
        }

        Desenvolvedor devPobre = desenvolvedores.get(0);

        for(Desenvolvedor desenvolvedor : desenvolvedores){
            if (desenvolvedor.calcularSalario() < devPobre.calcularSalario()){
                devPobre = desenvolvedor;
            }
        }

        return devPobre;
    }

    public List<Desenvolvedor> buscarPorTecnologia(String tecnologia){
        List<Desenvolvedor> devsTec = new ArrayList<>();

        for(Desenvolvedor desenvolvedor : desenvolvedores){
            if(desenvolvedor instanceof DesenvolvedorWeb){
                if(((DesenvolvedorWeb) desenvolvedor).getBackend().equals(tecnologia) ||
                        ((DesenvolvedorWeb) desenvolvedor).getFrontend().equals(tecnologia) ||
                ((DesenvolvedorWeb) desenvolvedor).getSgbd().equals(tecnologia)){
                    devsTec.add(desenvolvedor);
                }


            }

            if(desenvolvedor instanceof DesenvolvedorMobile){
                if(((DesenvolvedorMobile) desenvolvedor).getLinguagem().equals(tecnologia) ||
                        ((DesenvolvedorMobile) desenvolvedor).getPlataforma().equals(tecnologia)){
                    devsTec.add(desenvolvedor);
                }
            }

        }

        return devsTec;
    }

    public Double getTotalSalariosPorTecnologia(String tecnologia){
        Double total = 0.0;
        List<Desenvolvedor> devsTec = buscarPorTecnologia(tecnologia);
        for(Desenvolvedor desenvolvedor : devsTec){
            total += desenvolvedor.calcularSalario();
        }

        return total;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
}
