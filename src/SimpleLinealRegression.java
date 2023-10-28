import java.util.ArrayList;

public class SimpleLinealRegression{

    public static void main(String[] args){
        ArrayList<DatosT> datos = DatosT.Benetton();
        new SimpleLinealRegression(datos);



    }
    public SimpleLinealRegression (ArrayList<DatosT> datosd){
        double sumax=0, sumay=0;
        double multxy=0, cuadradox=0;
        double n = datosd.size();
        double pendiente;
        double intercepto;


        for(DatosT p: datosd){
            sumax+=p.x;
            sumay+=p.y;
            multxy+=p.x * p.y;
            cuadradox+= p.x*p.x;
        }
        pendiente = (n * multxy - sumax * sumay) / (n * cuadradox - sumax * sumax);
        intercepto = (sumay - pendiente * sumax) / n;
        System.out.println("Pendiente Coeficiente de Regression:"+ pendiente);//b1
        System.out.println("Intercepto:"+intercepto);//b0
        System.out.println("y= "+pendiente+"x+"+intercepto);

        for (DatosT p: datosd){
            double pre = pendiente * p.x + intercepto;
            System.out.println("Para X ="+ p.x +", Y = "+ pre);
        }

        //simulation de prediction
        System.out.println("Simulacion Prediction:");
        double simu1 = 50, simu2=40, simu3=20;
        System.out.println("Para X = "+simu1 +",Y = "+(pendiente*simu1)+intercepto);
        System.out.println("Para X = "+simu2 +",Y = "+(pendiente*simu2)+intercepto);
        System.out.println("Para X = "+simu3 +",Y = "+(pendiente*simu3)+intercepto);
    }
}
