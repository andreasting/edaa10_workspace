import java.awt.Color;

public class Generator {

    private double minRe;
    private double maxRe;
    private double minIm;
    private double maxIm;
    private Complex[][] complex;
    private final int MAX_ITER;
    private Color[] colorChart;
    private Color chosenColor;





    public Generator(MandelbrotGUI gui){
        this.minRe = gui.getMinimumReal();
        this.maxRe = gui.getMaximumReal();
        this.minIm = gui.getMinimumImag();
        this.maxIm = gui.getMaximumImag();
        MAX_ITER = 200;
        chosenColor = null;
        colorChart = new Color[MAX_ITER+1];
        for(int i = 0; i < MAX_ITER; i++){
            colorChart[i] = new Color(i+20,0,0);
        }




    }
    public void render(MandelbrotGUI gui,int height,int width, int pixelSize){
        gui.disableInput();
        minRe = gui.getMinimumReal();
        maxRe = gui.getMaximumReal();
        minIm = gui.getMinimumImag();
        maxIm = gui.getMaximumImag();
        complex = mesh(minRe, maxRe, minIm, maxIm, height,width);
        java.awt.Color[][] picture = new Color[height][width];




        for(int i = 0; i< height-1;i++){

            for(int j = 0; j<width-1;j++){
                
                    picture[i/pixelSize][j/pixelSize] = colorMap(gui.getMode(), complex[i][j]);


            }

        }

        gui.putData(picture,pixelSize,pixelSize);
        gui.enableInput();
    }
    public void renderCircle(MandelbrotGUI gui,int height,int width, int pixelSize){
        gui.disableInput();
        minRe = gui.getMinimumReal();
        maxRe = gui.getMaximumReal();
        minIm = gui.getMinimumImag();
        maxIm = gui.getMaximumImag();
        complex = mesh(minRe, maxRe, minIm, maxIm, height,width);
        java.awt.Color[][] picture = new Color[height][width];



        for(int i = 0; i< height-1;i++){

            for(int j = 0; j<width-1;j++){
                double rePart = complex[i][j].getRe();
                double imPart = complex[i][j].getIm();


                if(complex[i][j].getAbs2()>1){
                    picture[i/pixelSize][j/pixelSize] = Color.white;
                }
                else if(imPart >0 && rePart >0){
                    picture[i/pixelSize][j/pixelSize] = Color.red;
                }
                else if(imPart >0 && rePart < 0){
                    picture[i/pixelSize][j/pixelSize] = Color.blue;
                }
                else if(imPart <0 && rePart < 0){
                    picture[i/pixelSize][j/pixelSize] = Color.green;
                }
                else if(imPart <0 && rePart > 0){
                    picture[i/pixelSize][j/pixelSize] = Color.orange;
                }


            }

        }

        gui.putData(picture,pixelSize,pixelSize);
        gui.enableInput();
    }

    private Complex[][] mesh(double minRe, double maxRe, double minIm, double maxIm, int height,int width){
        Complex[][] mesh= new Complex[height][width];
        double reDiff = (maxRe-minRe)/((double)width-1.0);
        double imDiff = (maxIm-minIm)/((double)height-1.0);

        for(int i = 0; i<(height);i++){

            for(int j=0; j<(width);j++){

                mesh[i][j] = new Complex((minRe+(reDiff*(double)j)),(maxIm -(imDiff*(double)i)));
            }
        }

        return mesh;
    }
    public int diverges(Complex c){
        int k = 0;
        Complex z = new Complex(0,0);
        double absolute;

        do{
            z.mul(z);
            z.add(c);
            absolute = z.getAbs2();
            k++;
        }while(MAX_ITER>k && absolute <=2);

        return k;
    }
    public Color colorMap(int colorChoice, Complex c) {
       int k = diverges(c);
       chosenColor = null;

        if(colorChoice == 64) {
           chosenColor = colorChart[k];

            if (k == 200) {
                chosenColor = Color.black;
            }

        }


        if(colorChoice == 32) {  // Svartvit

            if (k == 200) {
                chosenColor = Color.black;
            }

            if (k < 200) {
                chosenColor = Color.white;
            }
        }


            return chosenColor;

    }
    }

