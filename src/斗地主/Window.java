package 斗地主;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;




public class Window extends JFrame{
		//logo图
		
	Vector<String> cardtem = new Vector<String>();
	
	ImageIcon logoImg;
	ImageIcon bbjImg;
	ImageIcon jiaodizhuImg;
	ImageIcon backgroundImg;
	ImageIcon paiImg;
	JLayeredPane layeredPane = new JLayeredPane();
	Background background = new Background();

	int cardy = 450;

	public static void  main (String [] args){
		//创建游戏窗体
		
		new Window();
//		Deal deal = new Deal();
//		deal.shuffle();

		
	}
		//设置游戏窗体的一些属性
	public Window (){
			
		logoImg=new ImageIcon("src/斗地主/thame1.png");
		bbjImg = new ImageIcon("src/斗地主/bbj.png");
		jiaodizhuImg = new ImageIcon("src/斗地主/bjdz.png");
		paiImg = new ImageIcon("src/斗地主/dpk.png");
		backgroundImg = new ImageIcon("src/斗地主/background.png");
		
		background.setBounds(0, 0, backgroundImg.getIconWidth(), backgroundImg.getIconHeight());
		layeredPane.add(background,JLayeredPane.DEFAULT_LAYER);//最底层
		this.setVisible(true);//true false表示是否显示界面
		this.setSize(backgroundImg.getIconWidth(), backgroundImg.getIconHeight());
		this.setTitle("斗地主");
		this.setLocationRelativeTo(null);//参数为null即居中
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击X命令为关闭，没有这句不会关闭
		this.setResizable(false);//false true表示是否可以由用户改变窗口大小
		this.setLayeredPane(layeredPane);
		background.init();
		

		Deal deal1 = new Deal();
		cardtem = deal1.shuffle(1,background.dizhu);
		
		//实例化每张牌
		Card card1 = new Card(cardtem.get(0));
		Card card2 = new Card(cardtem.get(1));
		Card card3 = new Card(cardtem.get(2));
		Card card4 = new Card(cardtem.get(3));
		Card card5 = new Card(cardtem.get(4));
		Card card6 = new Card(cardtem.get(5));
		Card card7 = new Card(cardtem.get(6));
		Card card8 = new Card(cardtem.get(7));
		Card card9 = new Card(cardtem.get(8));
		Card card10 = new Card(cardtem.get(9));
		Card card11 = new Card(cardtem.get(10));
		Card card12 = new Card(cardtem.get(11));
		Card card13 = new Card(cardtem.get(12));
		Card card14 = new Card(cardtem.get(13));
		Card card15 = new Card(cardtem.get(14));
		Card card16 = new Card(cardtem.get(15));
		Card card17 = new Card(cardtem.get(16));

		
		layeredPane.add(card1,JLayeredPane.MODAL_LAYER);//高一层
		layeredPane.add(card2,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card3,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card4,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card5,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card6,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card7,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card8,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card9,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card10,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card11,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card12,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card13,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card14,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card15,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card16,JLayeredPane.MODAL_LAYER);
		layeredPane.add(card17,JLayeredPane.MODAL_LAYER);
		
		Card cardr1 = new Card("pk");
		Card cardr2 = new Card("pk");
		Card cardr3 = new Card("pk");
		Card cardr4 = new Card("pk");
		Card cardr5 = new Card("pk");
		Card cardr6 = new Card("pk");
		Card cardr7 = new Card("pk");
		Card cardr8 = new Card("pk");
		Card cardr9 = new Card("pk");
		Card cardr10 = new Card("pk");
		Card cardr11 = new Card("pk");
		Card cardr12 = new Card("pk");
		Card cardr13 = new Card("pk");
		Card cardr14 = new Card("pk");
		Card cardr15 = new Card("pk");
		Card cardr16 = new Card("pk");
		Card cardr17 = new Card("pk");
		
		Card cardl1 = new Card("pk");
		Card cardl2 = new Card("pk");
		Card cardl3 = new Card("pk");
		Card cardl4 = new Card("pk");
		Card cardl5 = new Card("pk");
		Card cardl6 = new Card("pk");
		Card cardl7 = new Card("pk");
		Card cardl8 = new Card("pk");
		Card cardl9 = new Card("pk");
		Card cardl10 = new Card("pk");
		Card cardl11 = new Card("pk");
		Card cardl12 = new Card("pk");
		Card cardl13 = new Card("pk");
		Card cardl14 = new Card("pk");
		Card cardl15 = new Card("pk");
		Card cardl16 = new Card("pk");
		Card cardl17 = new Card("pk");
		
		layeredPane.add(cardr1,JLayeredPane.MODAL_LAYER);//高一层
		layeredPane.add(cardr2,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr3,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr4,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr5,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr6,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr7,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr8,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr9,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr10,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr11,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr12,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr13,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr14,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr15,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr16,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardr17,JLayeredPane.MODAL_LAYER);
		
		layeredPane.add(cardl1,JLayeredPane.MODAL_LAYER);//高一层
		layeredPane.add(cardl2,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl3,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl4,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl5,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl6,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl7,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl8,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl9,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl10,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl11,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl12,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl13,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl14,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl15,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl16,JLayeredPane.MODAL_LAYER);
		layeredPane.add(cardl17,JLayeredPane.MODAL_LAYER);
		
		//添加计时器，反复查看有无鼠标点击
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				cardtem = deal1.shuffle(1,background.dizhu);//反复调用，查看是否叫了地主
				
				if(background.dizhu) {
					background.dizhu = false;//防止过度添加牌
				}
		


			
			if(background.state == 1||background.state == 2) {
								
				cardr1.setBounds(790, 460, 161,132);
				cardr2.setBounds(790, 435, 161,132);
				cardr3.setBounds(790, 410, 161,132);
				cardr4.setBounds(790, 385, 161,132);
				cardr5.setBounds(790, 360, 161,132);
				cardr6.setBounds(790, 335, 161,132);
				cardr7.setBounds(790, 310, 161,132);
				cardr8.setBounds(790, 285, 161,132);
				cardr9.setBounds(790, 260, 161,132);
				cardr10.setBounds(790, 235, 161,132);
				cardr11.setBounds(790, 210, 161,132);
				cardr12.setBounds(790, 185, 161,132);
				cardr13.setBounds(790, 160, 161,132);
				cardr14.setBounds(790, 135, 161,132);
				cardr15.setBounds(790, 110, 161,132);
				cardr16.setBounds(790, 85, 161,132);
				cardr17.setBounds(790, 60, 161,132);
			
				cardl1.setBounds(0, 460, 161,132);
				cardl2.setBounds(0, 435, 161,132);
				cardl3.setBounds(0, 410, 161,132);
				cardl4.setBounds(0, 385, 161,132);
				cardl5.setBounds(0, 360, 161,132);
				cardl6.setBounds(0, 335, 161,132);
				cardl7.setBounds(0, 310, 161,132);
				cardl8.setBounds(0, 285, 161,132);
				cardl9.setBounds(0, 260, 161,132);
				cardl10.setBounds(0, 235, 161,132);
				cardl11.setBounds(0, 210, 161,132);
				cardl12.setBounds(0, 185, 161,132);
				cardl13.setBounds(0, 160, 161,132);
				cardl14.setBounds(0, 135, 161,132);
				cardl15.setBounds(0, 110, 161,132);
				cardl16.setBounds(0, 85, 161,132);
				cardl17.setBounds(0, 60, 161,132);
				
				
				int x1 = card1.init();
				if(x1==1) {
					card1.setBounds(660, 400, 105,150);
				}
				if(x1==0) {
					card1.setBounds(660, 450, 105,150);
				}
				if(x1 == 2) {
					card1.setBounds(430, 300, 105, 150);
				}
				//card1.setVisible(!(x1==2));

				int x2 = card2.init();
				if(x2==1) {
					card2.setBounds(630, 400, 105,150);
				}
				if(x2==0) {
					card2.setBounds(630, 450, 105,150);
				}
				if(x2 == 2) {
					card2.setBounds(430, 300, 105, 150);
				}
				//card2.setVisible(!(x2==2));
								
				int x3 = card3.init();
				if(x3==1) {
					card3.setBounds(600, 400, 105,150);
				}
				if(x3==0) {
					card3.setBounds(600, 450, 105,150);
				}
				if(x3 == 2) {
					card3.setBounds(430, 300, 105, 150);
				}
				//card3.setVisible(!(x3==2));
				
				int x4 = card4.init();
				if(x4==1) {
					card4.setBounds(570, 400, 105,150);
				}
				if(x4==0) {
					card4.setBounds(570, 450, 105,150);
				}
				if(x4 == 2) {
					card4.setBounds(430, 300, 105, 150);
				}
				//card4.setVisible(!(x4==2));
				
				int x5 = card5.init();
				if(x5==1) {
					card5.setBounds(540, 400, 105,150);
				}
				if(x5==0) {
					card5.setBounds(540, 450, 105,150);
				}
				if(x5 == 2) {
					card5.setBounds(430, 300, 105, 150);
				}
				//card5.setVisible(!(x5==2));
				
				int x6 = card6.init();
				if(x6==1) {
					card6.setBounds(510, 400, 105,150);
				}
				if(x6==0) {
					card6.setBounds(510, 450, 105,150);
				}
				if(x6 == 2) {
					card6.setBounds(430, 300, 105, 150);
				}
				//card6.setVisible(!(x6==2));
				
				int x7 = card7.init();
				if(x7==1) {
					card7.setBounds(480, 400, 105,150);
				}
				if(x7==0) {
					card7.setBounds(480, 450, 105,150);
				}
				if(x7 == 2) {
					card7.setBounds(430, 300, 105, 150);
				}
				//card7.setVisible(!(x7==2));
				
				int x8 = card8.init();
				if(x8==1) {
					card8.setBounds(450, 400, 105,150);
				}
				if(x8==0) {
					card8.setBounds(450, 450, 105,150);
				}
				if(x8 == 2) {
					card8.setBounds(430, 300, 105, 150);
				}
				//card8.setVisible(!(x8==2));
				
				int x9 = card9.init();
				if(x9==1) {
					card9.setBounds(420, 400, 105,150);
				}
				if(x9==0) {
					card9.setBounds(420, 450, 105,150);
				}
				if(x9 == 2) {
					card9.setBounds(430, 300, 105, 150);
				}
				//card9.setVisible(!(x9==2));
				
				int x10 = card10.init();
				if(x10==1) {
					card10.setBounds(390, 400, 105,150);
				}
				if(x10==0) {
					card10.setBounds(390, 450, 105,150);
				}
				if(x10 == 2) {
					card10.setBounds(430, 300, 105, 150);
				}
				//card10.setVisible(!(x10==2));
				
				int x11 = card11.init();
				if(x11==1) {
					card11.setBounds(360, 400, 105,150);
				}
				if(x11==0) {
					card11.setBounds(360, 450, 105,150);
				}
				if(x11 == 2) {
					card11.setBounds(430, 300, 105, 150);
				}
				//card11.setVisible(!(x11==2));
				
				int x12 = card12.init();
				if(x12==1) {
					card12.setBounds(330, 400, 105,150);
				}
				if(x12==0) {
					card12.setBounds(330, 450, 105,150);
				}
				if(x12 == 2) {
					card12.setBounds(430, 300, 105, 150);
				}
				//card12.setVisible(!(x12==2));
				
				int x13 = card13.init();
				if(x13==1) {
					card13.setBounds(300, 400, 105,150);
				}
				if(x13==0) {
					card13.setBounds(300, 450, 105,150);
				}
				if(x13 == 2) {
					card13.setBounds(430, 300, 105, 150);
				}
				//card13.setVisible(!(x13==2));
				
				int x14 = card14.init();
				if(x14==1) {
					card14.setBounds(270, 400, 105,150);
				}
				if(x14==0) {
					card14.setBounds(270, 450, 105,150);
				}
				if(x14 == 2) {
					card14.setBounds(430, 300, 105, 150);
				}
				//card14.setVisible(!(x14==2));
				
				int x15 = card15.init();
				if(x15==1) {
					card15.setBounds(240, 400, 105,150);
				}
				if(x15==0) {
					card15.setBounds(240, 450, 105,150);
				}
				if(x15 == 2) {
					card15.setBounds(430, 300, 105, 150);
				}
				//card15.setVisible(!(x15==2));
				
				int x16 = card16.init();
				if(x16==1) {
					card16.setBounds(210, 400, 105,150);
				}
				if(x16==0) {
					card16.setBounds(210, 450, 105,150);
				}
				if(x16 == 2) {
					card16.setBounds(430, 300, 105, 150);
				}
				//card16.setVisible(!(x16==2));
				
				int x17 = card17.init();
				if(x17==1) {
					card17.setBounds(180, 400, 105,150);
				}
				if(x17==0) {
					card17.setBounds(180, 450, 105,150);
				}
				if(x17 == 2) {
					card17.setBounds(430, 300, 105, 150);
				}
				//card17.setVisible(!(x17==2));

			
		}
			}
		},10,10);


//		timer.schedule(new TimerTask() {
//			public void run() {

					
					
//					
					
					//System.out.print(background.dizhu1);
					
//					if(background.dizhu1&&cardtem.size()==20) {
						
						//System.out.print(cardtem.get(0));
						
//						card1 = new Card(cardtem.get(0));
//						card2 = new Card(cardtem.get(1));
//						card3 = new Card(cardtem.get(2));
//						card4 = new Card(cardtem.get(3));
//						card5 = new Card(cardtem.get(4));
//						card6 = new Card(cardtem.get(5));
//						card7 = new Card(cardtem.get(6));
//						card8 = new Card(cardtem.get(7));
//						card9 = new Card(cardtem.get(8));
//						card10 = new Card(cardtem.get(9));
//						card11 = new Card(cardtem.get(10));
//						card12 = new Card(cardtem.get(11));
//						card13 = new Card(cardtem.get(12));
//						card14 = new Card(cardtem.get(13));
//						card15 = new Card(cardtem.get(14));
//						card16 = new Card(cardtem.get(15));
//						card17 = new Card(cardtem.get(16));
//						card18 = new Card(cardtem.get(17));
//						card19 = new Card(cardtem.get(18));
//						card20 = new Card(cardtem.get(19));
						
//						layeredPane.add(card18,JLayeredPane.MODAL_LAYER);
//						layeredPane.add(card19,JLayeredPane.MODAL_LAYER);
//						layeredPane.add(card20,JLayeredPane.MODAL_LAYER);
//						card18.setBounds(160, 400, 105,150);
//						card19.setBounds(150, 400, 105,150);
//						card20.setBounds(140, 400, 105,150);
//					}					
//			}
//		},10,10);


		
	}
}