package base;

import java.util.Objects;

public class Complexe implements Comparable<Complexe> {
    private final double reel;
    private final double img;
    public Complexe(double reel, double img){
        this.reel= reel;
        this.img = img;
    }
    public Complexe(Complexe c){
        this.reel = c.getReel();
        this.img = c.getImage();
    }

    @Override
    public String toString(){
        String str = reel + " + "+img+"i";
        return str;
    };
    public double getReel(){
        return reel;
    }
    public double getImage(){
        return img;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }
        else if(!(obj instanceof Complexe)){
            return false;
        }
        else if (obj == this){
            return true;
        }
        else {
            Complexe autre = new Complexe((Complexe) obj);
            if (autre.img==this.img && autre.reel == this.reel){
                return true;
            }
            else{
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.reel,this.img);
    }
    public double module(){
        return Math.sqrt((reel*reel) + (img*img));
    }

    public double argument(){
        return Math.acos(reel/this.module());
    }
    public Complexe addition(Complexe c){
        Complexe res = new Complexe((this.reel+c.reel), (this.img+c.img));
        return res;
    }
    public Complexe multiplication(Complexe c){
        Complexe res = new Complexe(((this.reel*c.reel)-(this.img*c.img)),((this.reel*c.img)+(this.img*c.reel)));
        return res;
    }

    @Override
    public int compareTo(Complexe c) {
        if(this.module()==c.module()){
            return 0;
        }
        else if (this.module()>c.module()){
            return 1;
        }
        else{
            return -1;
        }
    }
}

