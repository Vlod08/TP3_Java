package base;
/*base package*/
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
        Complexe c = new Complexe((Complexe)obj);
        return (this.img == c.getImage()) && (this.reel == c.getReel());
    }

    /*@Override
    public int hashCode() {
        return hash(Complexe c);
    }*/
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

