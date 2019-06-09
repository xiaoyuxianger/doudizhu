package 斗地主;

import java.util.Collections;
import java.util.Vector;

public class Deal {
	
	//查看是不是第一次实例化
	boolean first = true;
	
	Vector<String> player1 = new Vector<>();
	Vector<String> player2 = new Vector<>();
	Vector<String> player3 = new Vector<>();
	Vector<String> dipai = new Vector<>();
	

	
	public Vector shuffle(int player,boolean dizhu) {
		
		//System.out.print(first);
		Vector <String> card = new Vector<>();
		String [] colors = {"h","d","p","s"};
		String [] number = {"3","4","5","6","7","8","9","10","11","12","13","14","15"};
		Vector<String> poker = new Vector<>();
		
		for(String s1:colors) {
			for(String s2:number) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("98");
		poker.add("99");
		//洗牌
		

		
		if(first) {
			Collections.shuffle(poker);

		//发牌		
		for(int i=0;i<poker.size();i++) {
			if(i >= poker.size()-3) {			//先处理三张底牌
				dipai.add(poker.get(i));
			}
			else if (i % 3 == 0){
				player1.add(poker.get(i));
			}
			else if(i % 3 == 1) {
				player2.add(poker.get(i));
			}
			else {
				player3.add(poker.get(i));
			}
		}
	}
		if(dizhu) {
			player1.add(dipai.get(0));
			player1.add(dipai.get(1));
			player1.add(dipai.get(2));
		}
		player1 = sort(player1);
		player2 = sort(player2);
		player3 = sort(player3);
		
		first = false;
		if(player == 1) {
			return player1;
		}
		else if (player == 2) {
			return player2;
		}
		else if(player == 3) {
			return player3;
		}
		else {
			return dipai;
		}
	}
	
	public Vector<String> sort(Vector<String> a) {	//排序方法：将数字提出来后进行排序
		
		int [ ] b = new int [a.size()];
		for(int i = 0;i < a.size();i++) {
			if(a.get(i).equals("98")) {
				b[i] = 98;
			}
			else if(a.get(i).equals("99")){
				b[i] = 99;
			}
			else if(a.get(i).length() == 2) {
				String c = ""+a.get(i).charAt(1);;
				b[i] = Integer.parseInt(c);
			}
			else {
				String c = ""+a.get(i).charAt(1)+a.get(i).charAt(2);
				b[i] = Integer.parseInt(c);
			}
		}
		
		int pos;
		int hold;	
		String d;
		for(int i=0;i<a.size();i++){
			pos = i;
			int j; 
			for(j=i+1;j<a.size();j++){
				if(b[pos]<b[j]){
					pos = j;
				}
			}
			hold   = b[i];
			b[i]   = b[pos];
			b[pos] = hold;
			
			d = a.get(i);
			a.set(i, a.get(pos));
			a.set(pos, d);
		}
		return a;				
	}
}
