package historique;

import base.Complexe;

public class Operation {
    private String nom;
    private Complexe operande;
    private Complexe res;

    public String getNom() {
        return nom;
    }
    public Complexe getOperande(){
        return operande;
    }
    public Complexe getRes(){
        return res;
    }

    public Operation(String s, Complexe operande, Complexe res) {
        this.nom = s;
        this.operande = operande;
        this.res = res;
    }

    public Operation(Operation o){
        this.nom=o.getNom();
        this.operande= o.getOperande();
        this.res=o.getRes();
    }
}
