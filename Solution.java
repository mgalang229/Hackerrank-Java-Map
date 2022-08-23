import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	
	static Scanner fs;
	
	public static void main(String[] args) {
		fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		//T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			fs.nextLine();
			HashMap<String, String> mp = new HashMap<>();
			for (int i = 0; i < n; i++) {
				String name = fs.nextLine();
				String phoneNum = fs.next();
				mp.put(name, phoneNum);
				fs.nextLine();
			}
			while (fs.hasNext()) {
				String key = fs.nextLine();
				if (mp.containsKey(key)) {
					out.println(key + "=" + mp.get(key));
				} else {
					out.println("Not found");
				}
			}
		}
		fs.close();
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int x : a) {
			arr.add(x);
		}
		Collections.sort(arr);
		for (int i = 0; i < a.length; i++) {
			a[i] = arr.get(i);
		}
	}
	
	static int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		return a;
	}
}
