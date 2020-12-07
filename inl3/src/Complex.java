public class Complex {
    private double reZ1;
    private double imZ1;
    private double imZ2;
    private double reZ2;
    private double tempRe;
    private double tempIm;

    public Complex(double re, double im){
        this.reZ1 = re;
        this.imZ1 = im;
        imZ2 = 0;
        reZ2 = 0;
        tempRe = 0;
        tempIm = 0;

    }

    public double getRe(){
        return this.reZ1;
    }

    public double getIm(){
    return this.imZ1;
    }

    public double getAbs2(){

        return Math.pow(Math.abs(reZ1+imZ1),2);

    }
    public void add(Complex c){
        reZ1 = reZ1 + c.getRe();
        imZ1 = imZ1 + c.getIm();


    }
    public void mul(Complex c){
        // Z1*Z2 = (a+bi)(c+di) = ac + adi + bci + bdi^2
        imZ2 = c.getIm();
        reZ2 = c.getRe();

        tempRe = reZ1*reZ2 -(imZ1*imZ2);        // i^2 = -1, därav minus
        tempIm = reZ1*imZ2+imZ1*reZ2;           // En liten buffer så vi inte "overwritar" variabler som används i beräkningar

        reZ1 = tempRe;
        imZ1 = tempIm;




    }

}
