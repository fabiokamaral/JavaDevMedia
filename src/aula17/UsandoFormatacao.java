package aula17;


import java.text.DecimalFormat;

public class UsandoFormatacao {

    public static void main(String[] args) {

        /*Date now = new Date();

        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(now));
        System.out.println(new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy").format(now));*/


        double result = 10.0 / 3.0;

        System.out.println(new DecimalFormat("0.00").format(result));
        System.out.println(new DecimalFormat("000.00").format(result));
        System.out.println(new DecimalFormat("###.00").format(result));
        System.out.println(new DecimalFormat("0%").format(result));

    }

}
