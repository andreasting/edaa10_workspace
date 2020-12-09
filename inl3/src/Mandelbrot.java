public class Mandelbrot {

    public static void main(String[] args) {
        Boolean run = true;
        Boolean imageDrawn = false;
        MandelbrotGUI gui = new MandelbrotGUI();
        Generator gen = new Generator(gui);
        int choice;

        while(run){
            choice = gui.getCommand();
            switch(choice){
                case 1:                                             //Render
                    gen.render(gui,gui.getHeight(),gui.getWidth(), resolutionIndex(gui));
                    imageDrawn = true;
                    break;
                case 2:                                              //Zoom
                    if(imageDrawn){
                        gen.render(gui, gui.getHeight(), gui.getWidth(), resolutionIndex(gui));
                    }
                    break;
                case 8:                                             //Reset
                    gui.clearPlane();
                    gui.resetPlane();
                    imageDrawn = false;
                    break;
                case 16:                                            //Reset quit
                    System.out.println("Quit");
                    run = false;

                    break;

            }        }
    }
    static int resolutionIndex(MandelbrotGUI gui){
        int resolution =gui.getResolution();
        switch(resolution){
            case 2048:
                resolution = 1;
                break;
            case 1024:
                resolution = 3;
                break;
            case 512:
                resolution = 5;
                break;
            case 256:
                resolution = 7;
                break;
            case 128:
                resolution = 9;
                break;
        }
        return resolution;

    }
}
