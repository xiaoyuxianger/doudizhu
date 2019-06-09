package ������;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Background extends JPanel{
	
	private static BufferedImage logoImg;
	private static BufferedImage bbjImg;
	private static BufferedImage jiaodizhuImg;
	private static BufferedImage backgroundImg;
	//�������
	private int X;
	private int Y;
	//�����������
	private int X1;
	private int Y1;
	
	//��Ϸ״̬0-��ʼ�� 1-��Ϸ ��2-����
	private int BEGIN = 0;
	private int RUNNING1 = 1;
	private int RUNNING2 = 2;
	private int OVER = 3;
	public int state = BEGIN;
	
	public  boolean dizhu = false;
	public boolean dizhu1 = false;
	
	static {
	
	try {
		logoImg = ImageIO.read(Window.class.getResourceAsStream("/images/thame1.png"));
		backgroundImg = ImageIO.read(Window.class.getResourceAsStream("/images/background.png"));
		bbjImg = ImageIO.read(Window.class.getResourceAsStream("/images/bbj.png"));
		jiaodizhuImg = ImageIO.read(Window.class.getResourceAsStream("/images/bjdz.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}

	
	public void init(){
		MouseAdapter adapter = new MouseAdapter() {
			
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                if(e.getButton()==e.BUTTON1){       //  �жϻ�ȡ�İ�ť�Ƿ�Ϊ�����һ�         
                   X1 = e.getX();
                   Y1 = e.getY(); 				// ��������λ�õ����겢���͵���ǩ��������
                 }
                if(X1 >= 300 && X1 <= 393 && Y1 >= 400 && Y1 <= 447) {
                	state = RUNNING2;
                }
                if(X1 >= 500 && X1 <= 644 && Y1 >= 400 && Y1 <= 448) {
                	state = RUNNING2;
                	dizhu1 = true;
                	dizhu = true;
                }
            }

			public void mouseClicked(MouseEvent e) {
				
				if(state == BEGIN) {
					state = RUNNING1;
				}
			}
			public void mouseMoved(MouseEvent e) {
				//��ȡ����λ��
				if(state == RUNNING1) {
					X = e.getX();
					Y = e.getY();
					if(X >= 300 && X <= 393 && Y >= 400 && Y <= 447){
						try {
							bbjImg = ImageIO.read(Window.class.getResourceAsStream("/images/bj.png"));
						} catch (IOException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
					}
					else {
						try {
							bbjImg = ImageIO.read(Window.class.getResourceAsStream("/images/bbj.png"));
						} catch (IOException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
					}
					if(X >= 500 && X <= 644 && Y >= 400 && Y <= 448) {
						try {
							jiaodizhuImg = ImageIO.read(Window.class.getResourceAsStream("/images/jdz.png"));
						} catch (IOException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
					}
					else {
						try {
							jiaodizhuImg = ImageIO.read(Window.class.getResourceAsStream("/images/bjdz.png"));
						} catch (IOException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
					}
				}
			}
		};
		this.addMouseListener(adapter);
		this.addMouseMotionListener(adapter);
		
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				if(state == RUNNING1) {
					
				}
				repaint();
				//System.out.print("1");
			}
		},10,10);

}
	
	public boolean dizhu() {
		return dizhu;
	}
	
	public void paint(Graphics g) {
	if(state == BEGIN) {
		g.drawImage(logoImg, -50,0,null);
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,14);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("������Ļ��ʼ��Ϸ", 500, 500);
		}
	if(state == RUNNING1) {
		g.drawImage(backgroundImg,0,0,null);
		g.drawImage(bbjImg, 300, 400, null);
		g.drawImage(jiaodizhuImg, 500, 400, null);
		
		}
	if(state == RUNNING2) {
		g.drawImage(backgroundImg,0,0,null);
		}
	}
	
}
