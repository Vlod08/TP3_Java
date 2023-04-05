package historique;

import base.Complexe;

import java.util.ArrayList;


public class ComplexeMemoire extends Complexe{

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

