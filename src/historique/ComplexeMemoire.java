package historique;

import base.Complexe;

import java.util.ArrayList;
import java.util.Objects;
import java.lang.Comparable;



public class ComplexeMemoire extends Complexe{



    public ComplexeMemoire(ComplexeMemoire c) {
        super((Complexe) c);
        this.hist = c.getHistorique();
    }

    public class Operation {
        String nom;
        Complexe operande;
        Complexe res;

        public Operation(String s, Complexe operande, Complexe res){
            this.nom = s;
            this.operande =operande;
            this.res = res;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Operation operation = (Operation) o;
            return Objects.equals(nom, operation.nom) && Objects.equals(operande, operation.operande) && Objects.equals(res, operation.res);
        }


    }

    ArrayList<Operation> hist;
    public ComplexeMemoire(double reel, double img) {
        super(reel, img);
        hist = new ArrayList<Operation>();
    }

    public ArrayList<Operation> getHistorique(){
        return (ArrayList<Operation>)this.hist.clone();
    }






    @Override
    public Complexe multiplication(Complexe c) {
        Complexe res = super.multiplication(c);
        this.hist.add(new Operation("multiplication",c,res));
        if(c instanceof ComplexeMemoire){
            ((ComplexeMemoire) c).hist.add(new Operation("multiplication",this,res));
        }
        return res;
    }

    @Override
    public Complexe addition(Complexe c){
        Complexe res = super.addition(c);
        this.hist.add(new Operation("addition",c,res));
        if(c instanceof ComplexeMemoire){
            ((ComplexeMemoire) c).hist.add(new Operation("multiplication",this,res));
        }
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){return true; }
        else if (obj == null){return false;}

        else if(super.equals(obj)  && (obj instanceof ComplexeMemoire))
        {
            ComplexeMemoire autre = (ComplexeMemoire) obj;
            if(autre.hist.size()!=this.hist.size()){return false;}
            else {
                int length = this.hist.size();
                for (int i =0;i<length;i++) {
                    this.hist.get(i).equals(autre.hist.get(i));
                }
                return true;
            }


        }
        else{return false;}
    }

    @Override
    public int compareTo(Complexe c) {
        if(! (c instanceof ComplexeMemoire)){
            super.compareTo(c);
        }
        else {
            ComplexeMemoire cm = new ComplexeMemoire((ComplexeMemoire) c);
            if(this.getHistorique().size()>cm.getHistorique().size()){
                return -1;
            }
            else if(this.getHistorique().size()==this.getHistorique().size()){
                return 0;
            }

        }
        return 1;
    }
}

