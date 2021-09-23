import java.awt.*;

public class FourRectangles {
    public static void main (String[] args){
        //JFrame frame = new JFrame();
        //frame.setSize(500, 500);
        //frame.setTitle("rectangle viewer");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //RectangleComponent component = new RectangleComponent();
        //frame.add(component);

        //frame.setVisible(true);
        int xwidth = 140;
        int yheight = 120;



        Rectangle box = new Rectangle(10,10,xwidth,yheight);
        //g.setColor(Color.red);
        //g2.draw(box);

        box.translate (xwidth,yheight);
        //g.setColor(Color.yellow);
        //g2.draw(box);

        box.translate (0,-yheight);
        //g.setColor(Color.green);
        //g2.draw(box);

        box.translate (-xwidth,yheight);
        //g.setColot(Color.blue);
        //g2.draw(box);


        System.out.println("Top left corner of first rectangle is:"+ " 0,0");
        System.out.println("Top left corner of top right rectangle is: "+ xwidth +",0");
        System.out.println("Top left corner of bottom left rectangle is: "+ "0, "+ yheight);
        System.out.println("Top left corner of bottom right rectangle is: "+ xwidth + ","+ yheight);








    }
}
