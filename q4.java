package org.koud.example;
import java.text.DecimalFormat;
public class q4 {

    public double z = 4.21 ; //instance ( Global) variable  z

    public double  my_z (){

        double z = 23455.862 ; // local variable

        this.z = z ; // assign the value of the local variable to the instance variable

        return this.z;
    }

    public static void main(String[] args) {


        q4 md = new q4();

        double x = 12.236931728 ;
        double z = 153.2 ;
        double y = 234.6 ;

        System.out.println("numbers befor "
                +"\n x= "  +  x
                +"\n z= "  +  z
                +"\n y= "  +  y);

        md.my_z();

        new DecimalFormat("#0").format(x);
        new DecimalFormat("#0").format(z);
        new DecimalFormat("#0").format(y);

        System.out.println("\nnumbers after ");

        System.out.println(" x= "  +  new DecimalFormat("#0").format(x)
                +"\n z= "  +  new DecimalFormat("#0").format(z)
                +"\n y= "  +  new DecimalFormat("#0").format(y));

    }

}

