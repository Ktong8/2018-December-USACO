import java.io.*;
import java.util.*;

class blist {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("blist.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int num = Integer.parseInt(st.nextToken());
		int[] start = new int[num];
		int[] end = new int[num];
		int[] bucknum = new int[num];
		for(int i = 0; i<num; i++){
			st = new StringTokenizer(f.readLine());
			start[i] = Integer.parseInt(st.nextToken());
			end[i] = Integer.parseInt(st.nextToken());
			bucknum[i] = Integer.parseInt(st.nextToken());
		}
		int total=0;
		int using = 0;
		for(int t = 1; t<=1000;t++){
			for(int i = 0; i<end.length; i++){
				if(end[i] == t){
					using -= bucknum[i];
				}
			}
			for(int i = 0; i<start.length; i++){
				if(start[i] == t){
					if((using + bucknum[i] > total)){
						total = using+bucknum[i];
					}
					using +=bucknum[i];
				}
			}
		}
		out.println(total);
		out.close();
	}
}
