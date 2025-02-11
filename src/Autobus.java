public class Autobus {
    String matricula, modelo;
    int numeroPlazas, potenciaCV;
    public Autobus(String matri, String model, int numPla, int potencia){
        this.matricula = matri;
        this.modelo = model;
        this.numeroPlazas = numPla;
        this.potenciaCV = potencia;
    }
    void setNumeroPlazas(int plzs) {
        numeroPlazas = plzs;
    }
    String getMatricula(){
        return matricula;
    }
    String getModelo(){
        return modelo;
    }
    int getNumeroPlazas(){
        return numeroPlazas;
    }
    int getPotenciaCV(){
        return potenciaCV;
    }
}
