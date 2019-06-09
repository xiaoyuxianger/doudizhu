package 斗地主;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends JLabel {
	
	String type = "";
	private int x;
	public int y ;
	private int result = 0;
	private int clickcount = 0;
	private static BufferedImage[] cardsh = new BufferedImage[13];
	private static BufferedImage[] cardsd = new BufferedImage[13];
	private static BufferedImage[] cardsp = new BufferedImage[13];
	private static BufferedImage[] cardss = new BufferedImage[13];
	private static BufferedImage[] joker = new BufferedImage[2];
	private static BufferedImage pk ;
	
	static {
		
		try {
			for(int i=0;i<13;i++) {
				cardsh[i] = ImageIO.read(Window.class.getResourceAsStream("/cards/h"+ (i+3)+".jpg"));
				cardsd[i] = ImageIO.read(Window.class.getResourceAsStream("/cards/d"+ (i+3)+".jpg"));
				cardsp[i] = ImageIO.read(Window.class.getResourceAsStream("/cards/p"+ (i+3)+".jpg"));
				cardss[i] = ImageIO.read(Window.class.getResourceAsStream("/cards/s"+ (i+3)+".jpg"));
			}
			joker[0] = ImageIO.read(Window.class.getResourceAsStream("/cards/"+"98"+".jpg"));
			joker[1] = ImageIO.read(Window.class.getResourceAsStream("/cards/"+"99"+".jpg"));
			pk = ImageIO.read(Window.class.getResourceAsStream("/images/pk.png"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public Card(String a) {
		type = a;
		y = 450;
	}
	
	
	public int init(){
		
//		Timer timer1 = new Timer();
//		timer1.schedule(new TimerTask() {
//			public void run() {
//				repaint();
//			}
//		},10,10);
		
		MouseAdapter adapter = new MouseAdapter() {	//添加鼠标点击事件
			public void mouseClicked(MouseEvent e) {
				clickcount = e.getClickCount();
				if(e.getButton()==e.BUTTON1 && clickcount % 2 != 0) {
					result = 1;
				}
				else if(e.getButton()==e.BUTTON1 && clickcount % 2 == 0) {
					result = 0;
				}
				else if(e.getButton()==e.BUTTON3) {
					result = 2;
				}
			}
		};
		this.addMouseListener(adapter);
		this.addMouseMotionListener(adapter);
		return result;
		


}
	
		public void paint (Graphics g) {
			if(type.equals("h3")) {
				g.drawImage(cardsh[0], 0, 0,null);
			}
			if(type.equals("h4")) {
				g.drawImage(cardsh[1], 0, 0,null);
		}
			if(type.equals("h5")) {
				g.drawImage(cardsh[2], 0, 0,null);
		}
			if(type.equals("h6")) {
				g.drawImage(cardsh[3], 0, 0,null);
		}
			if(type.equals("h7")) {
				g.drawImage(cardsh[4], 0, 0,null);
		}
			if(type.equals("h8")) {
				g.drawImage(cardsh[5], 0, 0,null);
		}
			if(type.equals("h9")) {
				g.drawImage(cardsh[6], 0, 0,null);
		}
			if(type.equals("h10")) {
				g.drawImage(cardsh[7], 0, 0,null);
		}
			if(type.equals("h11")) {
				g.drawImage(cardsh[8], 0, 0,null);
		}
			if(type.equals("h12")) {
				g.drawImage(cardsh[9], 0, 0,null);
		}
			if(type.equals("h13")) {
				g.drawImage(cardsh[10], 0, 0,null);
		}
			if(type.equals("h14")) {
				g.drawImage(cardsh[11], 0, 0,null);
		}
			if(type.equals("h15")) {
				g.drawImage(cardsh[12], 0, 0,null);
		}
			if(type.equals("s3")) {
				g.drawImage(cardss[0], 0, 0,null);
		}
			if(type.equals("s4")) {
				g.drawImage(cardss[1], 0, 0,null);
		}
			if(type.equals("s5")) {
				g.drawImage(cardss[2], 0, 0,null);
		}
			if(type.equals("s6")) {
				g.drawImage(cardss[3], 0, 0,null);
		}
			if(type.equals("s7")) {
				g.drawImage(cardss[4], 0, 0,null);
		}
			if(type.equals("s8")) {
				g.drawImage(cardss[5], 0, 0,null);
		}
			if(type.equals("s9")) {
				g.drawImage(cardss[6], 0, 0,null);
		}
			if(type.equals("s10")) {
				g.drawImage(cardss[7], 0, 0,null);
		}
			if(type.equals("s11")) {
				g.drawImage(cardss[8], 0, 0,null);
		}
			if(type.equals("s12")) {
				g.drawImage(cardss[9], 0, 0,null);
		}
			if(type.equals("s13")) {
				g.drawImage(cardss[10], 0, 0,null);
		}
			if(type.equals("s14")) {
				g.drawImage(cardss[11], 0, 0,null);
		}
			if(type.equals("s15")) {
				g.drawImage(cardss[12], 0, 0,null);
		}
			if(type.equals("p3")) {
				g.drawImage(cardsp[0], 0, 0,null);
		}
			if(type.equals("p4")) {
				g.drawImage(cardsp[1], 0, 0,null);
		}
			if(type.equals("p5")) {
				g.drawImage(cardsp[2], 0, 0,null);
		}
			if(type.equals("p6")) {
				g.drawImage(cardsp[3], 0, 0,null);
		}
			if(type.equals("p7")) {
				g.drawImage(cardsp[4], 0, 0,null);
		}
			if(type.equals("p8")) {
				g.drawImage(cardsp[5], 0, 0,null);
		}
			if(type.equals("p9")) {
				g.drawImage(cardsp[6], 0, 0,null);
		}
			if(type.equals("p10")) {
				g.drawImage(cardsp[7], 0, 0,null);
		}
			if(type.equals("p11")) {
				g.drawImage(cardsp[8], 0, 0,null);
		}
			if(type.equals("p12")) {
				g.drawImage(cardsp[9], 0, 0,null);
		}
			if(type.equals("p13")) {
				g.drawImage(cardsp[10], 0, 0,null);
		}
			if(type.equals("p14")) {
				g.drawImage(cardsp[11], 0, 0,null);
		}
			if(type.equals("p15")) {
				g.drawImage(cardsp[12], 0, 0,null);
		}
			if(type.equals("d3")) {
				g.drawImage(cardsd[0], 0, 0,null);
		}
			if(type.equals("d4")) {
				g.drawImage(cardsd[1], 0, 0,null);
		}
			if(type.equals("d5")) {
				g.drawImage(cardsd[2], 0, 0,null);
		}
			if(type.equals("d6")) {
				g.drawImage(cardsd[3], 0, 0,null);
		}
			if(type.equals("d7")) {
				g.drawImage(cardsd[4], 0, 0,null);
		}
			if(type.equals("d8")) {
				g.drawImage(cardsd[5], 0, 0,null);
		}
			if(type.equals("d9")) {
				g.drawImage(cardsd[6], 0, 0,null);
		}
			if(type.equals("d10")) {
				g.drawImage(cardsd[7], 0, 0,null);
		}
			if(type.equals("d11")) {
				g.drawImage(cardsd[8], 0, 0,null);
		}
			if(type.equals("d12")) {
				g.drawImage(cardsd[9], 0, 0,null);
		}
			if(type.equals("d13")) {
				g.drawImage(cardsd[10], 0, 0,null);
		}
			if(type.equals("d14")) {
				g.drawImage(cardsd[11], 0, 0,null);
		}
			if(type.equals("d15")) {
				g.drawImage(cardsd[12], 0, 0,null);
		}
			if(type.equals("98")) {
				g.drawImage(joker[0], 0, 0,null);
		}
			if(type.equals("99")) {
				g.drawImage(joker[1], 0, 0,null);
		}
			if(type.equals("pk")) {
				g.drawImage(pk, 0, 0,null);
			}
			
		}
}

