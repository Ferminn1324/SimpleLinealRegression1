import java.util.ArrayList;

public class DatosT {

    public static ArrayList<DatosT> datosd = new ArrayList<>();

    double x, x1, x2,x3, y;

    public DatosT(double x, double y){
        this.y=y;
        this.x=x;


    }


    public static ArrayList<DatosT>Benetton() {
        datosd.add(new DatosT(1,2));
        datosd.add(new DatosT( 2,4));
        datosd.add(new DatosT( 3,6));
        datosd.add(new DatosT( 4,8));
        datosd.add(new DatosT( 5,10));
        datosd.add(new DatosT( 6,12));
        datosd.add(new DatosT( 7,14));
        datosd.add(new DatosT( 8,16));
        datosd.add(new DatosT( 9,18));
        return datosd;
    }









}