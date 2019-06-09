package 斗地主;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector<String> a = new Vector<>();
		a.add("h5");
		a.add("h2");
		a.add("h1");
		a.add("s3");
		String c = "";
		int v[] = new int[a.size()];
		for(int i=0;i<a.size();i++) {
			c = ""+a.get(i).charAt(1);
			v[i] = Integer.parseInt(c);
		}
		int pos;
		int hold;	
		String d;
		for(int i=0;i<a.size();i++){
			pos = i;
			int j; 
			for(j=i+1;j<a.size();j++){
				if(v[pos]>v[j]){
					pos = j;
				}
			}
			hold   = v[i];
			v[i]   = v[pos];
			v[pos] = hold;
			
			d = a.get(i);
			a.set(i, a.get(pos));
			a.set(pos, d);
		}
		System.out.print(a);
	}
}
