package historique;

import base.Complexe;

import java.util.ArrayList;

public class ComplexeMemoireCollective extends Complexe{
    private static ArrayList<Operation> hist;

    public ComplexeMemoireCollective(double r,double i){
        super(r,i);
    }
    public  ComplexeMemoireCollective(Complexe c){
        super(c);
    }

    @Override
    public Complexe addition(Complexe c) {
        return super.addition(c);
    }
}
