import java.awt.*;
import java.applet.Applet;
import java.util.Random;
public class Bored5 extends Applet{
    public void paint (Graphics page){
        final int [] X_INTS = {250, 50, 450};
        final int [] Y_INTS = {50, (int)(50 + (Math.sqrt(3) * 400) / 2), (int)(50 + (Math.sqrt(3) * 400) / 2)};
        int currentX = 250;
        int currentY = 50;
        int formerX;
        int formerY;
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
            point = rand.nextInt(3);
            switch (point){
                case 0: page.setColor(Color.red);
                    break;
                case 1: page.setColor(Color.magenta);
                    break;
                case 2: page.setColor(Color.blue);
                    break;
            }
            currentX = ((X_INTS[point] + currentX) / 2);
            currentY = ((Y_INTS[point] + currentY) / 2);
            page.drawOval(currentX, currentY, 1, 1);
        }
    }
}
