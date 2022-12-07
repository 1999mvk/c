import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pane100 extends jpanel
{
  timer t=new timer(1,new listener());
  int ctr=0;
  double G=0.1;
  
  final int xpos=280;
  
  double[] p2d={280,200};
  double[] v2d={0,0};

  int points=0;
  int lives=0;
  int sides=13;

  double snorm=400;
  double sd=450;
  double sv=0;
  boolean setlock=false;
  boolean rdown,ldown;
  double paddle=130;
  double rtheta=0;
  double ltheta=0;
  
  int preset[][]={
                 {0,400,135,450,1,},
                 {135,450,270,400,1},
                 {270,0,300,20,1},
                 {291,0,291,500,1},
                 {-1,0,270,0,1},
                 {0,-1,0,500,1}
};


   [][] balls = {
                {80,80,30,50,},
                {230,280,20,200},
                {50,200,25,100},
                {200,100,10,500}
};


  int lines[][] = new int[100][5];
  
  public panel100(){
         super();
         t.start();
         addkeyListener(new key());
         setFocusable(true);
        
         for(int i = 0; i< preset.length; i++){
                 lines[i]=preset[i];
}

  int plen=preset.length;
  
  int ct=0
  for(int k=0;k<balls.length;k++){
      int px=balls[k][0],py=balls[k][1],radius=balls[k][2];
      for(double i=0;i<2* math.PI;i+=2* math.PI/sides){
                ct++;
                lines[plen+ct][0]=px+(int) (radius*math.cos(i));
                lines[plen+ct][1]=py+(int) (radius*math.sin(i));
                lines[ples+ct][2]=px+(int) (radius*math.cos(i-2*math.PI/sides));
                lines[plen+ct][3]=py+(int) (radius*math.sin(i-2*math.PI/sides));
    
          }
     }
}

  privte class listener impliments ActionListener {
  public void acionPerformed(ActionEvent e){
      repaint
    }
}
  
  public void paintComponent(Graphics g){
           super.paaintComponent(g);
           v2d[1]+=G;
           p2d[1]+=v2d[1];
           p2d[0]+=v2d[0];


          if(p2d[1]>1000){
                  p2d[0]=280;
                  p2d[1]=200;
                  v2d[0]=0;
                  v2d[1]=0;
                  lives++;
}
  if(p2d[0] == 280 && p2d[1] > sd){
     p2d[1] = sd;
     v2d[1] = math.min(v2d[1], sv;
}
  if(setlock == false){
          sv*=0.95;
          sv-=(sd - snorm)/30;
          sd+=sv;
}
  double rc = 0.1;
  if(rdown){
          rtheta = math.max(-0.5, rtheta - rc);
}
  else
{
  rtheta = math.min(0.5, rtheta + rc);
}
  if(ldown){
         ltheta = math.max(-0.5, ltheta - rc);
}
  else
{
  ltheta = math.min(0.5, ltheta + rc);
}

  lines[0][2] = lines[0][0] + (int) (math.cos(ltheta)*paddle);
  lines[0][3] = lines[0][1] + (int) (math.sin(ltheta)*paddle);
  lines[1][0] = lines[1][2] + (int) (math.cos(ltheta)*paddle);
  lines[1][1] = lines[1][3] = (int) (math.sin(ltheta)*paddle);
  int rx = (int) p2d[0];
  int ry = (int) p2d[1];
  int r  = 10;
  g.setColor(Color.blue);
  g.drawArc(rx - r,ry - r,2 * r,2 * r,0,360);
  g.setColor(Color.black);
  for(int i=0; i < lines.length; i++){
          int x1 = lines[i][0],
              y1 = lines[i]1],
              x2 = lines[i][2];
      double y2 = lines[i][3] + 0.0001;
      if(i > preset.length){
             g.setColor(Color.red);
}

  g.drawLine(x1, y1, x2, (int) math.round(y2));

  double bmag = math.sqrt(v2d[0]*v2d[0]+v2d[1]*v2d[1]);
  double lineslope = ((double)(x2 - x1))/((double)(y2 -y1));
  double ballslope = v2d[0] / v2d[1];
  double binter = p2d[0] - ballslope * p2d[1];
  double linter = x1 - lineslope * y1;


  double y = (binter - linter)/(lineslope - ballslope);
  double sx = y * ballslope + binter;
  double la = math.atan2(y2 - y1,x2 - x1);
  double ba = math.atan(v2d[1], v2d[0]);

  double da = 2 * la - ba;
  

  if(sx >= math.min(x2, x1

  