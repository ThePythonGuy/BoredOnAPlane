import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class Bored6 extends Applet{
    public void paint (Graphics page){
        final int [] X_INTS = {50, 450, 450, 50};
        final int [] Y_INTS = {50, 50, 450, 450};
        int currentX = 50;
        int currentY = 50;
        int point;
        Random rand = new Random();

        setBackground(Color.lightGray);
        setSize(500, 500);
        page.setColor(Color.black);
        for (int i = 0; i < X_INTS.length; i++){
            page.fillOval(X_INTS[i] - 2, Y_INTS[i] - 2, 4,4);
        }
        //while(true){
        for (int i = 0; i < 100000; i++){
            point = rand.nextInt(4);
            switch (point){
                case 0: page.setColor(Color.red);
                    break;
                case 1: page.setColor(Color.magenta);
                    break;
                case 2: page.setColor(Color.blue);
                    break;
                case 3: page.setColor(Color.orange);
            }
            currentX = ((int)Math.sqrt(X_INTS[point] * currentX));
            currentY = ((int)Math.sqrt(Y_INTS[point] * currentY));
            page.drawOval(currentX, currentY, 1, 1);
        }
    }
}
