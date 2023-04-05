package historique;

import base.Complexe;

import java.util.ArrayList;


public class ComplexeMemoire extends Complexe{

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

    ArrayList<Operation> hist;
    public ComplexeMemoire(double reel, double img) {
        super(reel, img);
        hist = new ArrayList<Operation>();
    }


    public Complexe multiplication(Complexe c) {
        Complexe res = super.multiplication(c);
        hist.add(new Operation("multiplication",c,res));
        return res;
    }
}

