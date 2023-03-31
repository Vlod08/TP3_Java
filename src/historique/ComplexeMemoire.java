package historique;

import base.Complexe;

import java.util.ArrayList;

public class ComplexeMemoire extends Complexe{

    ArrayList<String> opers;
    public ComplexeMemoire(double reel, double img) {
        super(reel, img);
        opers = new ArrayList<String>();
    }

    public void setopers(String str){
        opers.add(str);
    }
    public ArrayList<String> getopers(){
        return opers;
    }




}
