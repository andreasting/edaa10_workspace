import java.awt.Color;

public class Generator {

    private double minRe;
    private double maxRe;
    private double minIm;
    private double maxIm;
    private int width;
    private int height;

    public Generator(MandelbrotGUI gui){
        this.minRe = gui.getMinimumReal();
        this.maxRe = gui.getMaximumReal();
        this.minIm = gui.getMinimumImag();
        this.maxIm = gui.getMaximumImag();
        this.width = gui.getWidth();
        this.height = gui.getHeight();



    }
    public void render(MandelbrotGUI gui){
        gui.disableInput();
        gui.getMaximumReal();
        Complex[][] complex = new Complex[height][width];

        java.awt.Color[][] picture = new Color[height][width];
        for(int i = 0; i< height-1;i++){

            for(int j = 0; j<width-1;j++){

                if(complex[i][j].getAbs2()>1){
                    picture[i][j] = Color.white;
                }
                else if(complex[i][j].getIm()>0 && complex[i][j].getRe() >0){ // 1:a kvad
                    picture[i][j] = Color.red;

                }

                else if(complex[i][j].getIm()>0 && complex[i][j].getRe() <0){   //2:a kvad
                    picture[i][j] = Color.blue;

                }

                else if(complex[i][j].getIm()<0 && complex[i][j].getRe() <0){   // 3:e kvad
                    picture[i][j] = Color.green;

                }
                else if(complex[i][j].getIm()<0 && complex[i][j].getRe() >0){   // 4:e kvad
                    picture[i][j] = Color.orange;
                }
                else{
                    picture[i][j] = Color.black;           // skapar axis

                }

            }

        }

        gui.putData(picture,width,height);
        gui.enableInput();
    }

    private Complex[][] mesh(double minRe, double maxRe, double minIm, double maxIm,int width, int height){
        Complex[][] mesh= new Complex[height][width];
        for(int i = 0; i<height-1;i++){

            for(int j=0; i<width-1;j++){

                mesh[i][j] = new Complex((minRe+j),(maxIm-i));

            }
        }
        return mesh;
    }

}
