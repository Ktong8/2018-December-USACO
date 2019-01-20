import java.io.*;
import java.util.*;

class mixmilk {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int cap1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int cap2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int cap3 = Integer.parseInt(st.nextToken());
		int m3 = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i<=100; i++){
			if(i%3==1){
				if(m1+m2>cap2){
					m1 -= cap2-m2;
					m2 = cap2;
				}
				else{
					m2+=m1;
					m1=0;
				}
			}
			else if(i%3==2){
				if(m2+m3>cap3){
					m2 -= cap3-m3;
					m3 = cap3;
				}
				else{
					m3+=m2;
					m2=0;
				}
			}
			else if(i%3==0){
				if(m3+m1>cap1){
					m3 -= cap1-m1;
					m1 = cap1;
				}
				else{
					m1+=m3;
					m3=0;
				}
			}
		}
		out.println(m1);
		out.println(m2);
		out.println(m3);
		out.close();
	}
}
