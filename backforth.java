import java.io.*;
import java.util.*;

class backforth {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("backforth.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int buck1[] = new int[10];
		int buck2[] = new int[10];
		
		for(int i = 0; i<10; i++){
			buck1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(f.readLine());
		for(int i = 0; i<10; i++){
			buck2[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer> possible = new ArrayList<Integer>();
		for(int i = 0; i<10; i++){
			for(int j=0; j<9; j++){
				if(!possible.contains(buck1[i]-buck2[j])){
					possible.add(buck1[i]-buck2[j]);
				}
			}
		}
		for(int i = 0; i<10; i++){
			for(int j=i+1; j<10; j++){
				for(int k = 0; k<9; k++){
					for(int l=k+1; l<10; l++){
						if(!possible.contains(buck1[i]+buck1[j]-buck2[k]-buck2[l])){
							possible.add(buck1[i]+buck1[j]-buck2[k]-buck2[l]);
						}
					}
				}
			}
		}
		if(!possible.contains(0)){
			possible.add(0);
		}
		
		out.println(possible.size());
		out.close();
	}
}
