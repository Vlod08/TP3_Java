package historique;

import base.Complexe;

public class Operation {
    String nom;
    Complexe operande;
    Complexe res;

    public Operation(String s, Complexe operande, Complexe res){
        this.nom = s;
        this.operande =operande;
        this.res = res;
    }

}
