import java.io.*;
import java.util.StringTokenizer;

public class Template {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            for(int j=0; j<s; j++) {
                int data = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(data));
                bw.newLine();
            }
        }

        bw.flush();
    }

    public void solution2() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int data = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(data));
            bw.newLine();
        }

        bw.flush();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}