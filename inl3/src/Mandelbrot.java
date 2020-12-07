public class Mandelbrot {

    public static void main(String[] args) {
        Boolean run = true;
        MandelbrotGUI gui = new MandelbrotGUI();
        Generator gen = new Generator(gui);
        int choice;

        while(run){
            choice = gui.getCommand();
            switch(choice){
                case 1:
                    gen.render(gui);
                    System.out.println("Render");
                    break;
                case 8:
                    gui.clearPlane();
                    gui.resetPlane();
                    System.out.println("Reset");
                    break;
                case 16:
                    System.out.println("Quit");
                    run = false;

                    break;

            }        }
    }
}
