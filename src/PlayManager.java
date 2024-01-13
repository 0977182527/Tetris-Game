import java.awt.*;

public class PlayManager {
    final int WIDTH = 360;
    final int HEIGTH = 500;
    public static int left_x;
    public static int right_x;
    public static int bottom_y;
    public static int top_y;

    public PlayManager(){
        left_x = (GamePanel.WIDTH/2) - (WIDTH/2); // ( (700/2 = 350) - (360/2) = 180 ) = 120
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGTH;
        System.out.println(GamePanel.WIDTH/2);
    }

    public void update(){

    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(2f));
        g2.drawRect(left_x - 2,top_y - 2, WIDTH +8 , HEIGTH +8);

        //Mino frame
        int x =  right_x +50;
        int y = bottom_y - 120;
        g2.drawRect(x,y,100,100);
        g2.setFont(new Font("Arial", Font.PLAIN, 24));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("NEXT", x +20, y + 30);
    }
}
