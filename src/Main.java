import base.Complexe;

public class Main {
    public static void main(String[] args) {

        for (int i = 0;i<10;i++){
            for (int j = 10; j<20;j++){
                Complexe c = new Complexe(i,j);
                System.out.println(c.toString());
            }
        }
    }
}
