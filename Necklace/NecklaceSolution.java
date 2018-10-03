// 21 13 34 42 22

import java.util.Scanner;

public class Necklace {
	static int[][] beads = new int[1000][3]; //active (0/1)
	static int nbeads;  //number of beads
	
	static int[][] necklace = new int[1000][2]; //one end, other end
	static int nstrung;
	
	// array to hold loops temporarily
	static int[][] side = new int[1000][3];  //index of bead in beads, one end, other end
	static int nside;
	
	static Scanner kb = new Scanner(System.in);
	
	static class FailException extends RuntimeException{}
	
	static void readBeads(){
		// read one test case
		nbeads = kb.nextInt();
		for(int i = 0; i<nbeads; i++){
			beads[i][0] = 1;
			beads[i][1] = kb.nextInt();
			beads[i][2] = kb.nextInt();
		}
	}
	
	static int findColor(int color){
		// return index of active bead with given color
		// after deactivating that bead
		// return -1 if no match
		for(int i = 0;i<nbeads;i++)
			if(beads[i][0] == 1 && (beads[i][1] == color || beads[i][2] == color)){
				beads[i][0]=0;
				return i;
			}
		throw new FailException();
		
	}
	
	static void stringSide(int b, boolean forward) {
		side[nside][0] = b;
		side[nside][1] = forward ? beads[b][1] : beads[b][2];
		side[nside][2] = forward ? beads[b][2] : beads[b][1];
	}
	
	//Find loop with starting color specified. Returns true if loop is found .
	static boolean formLoop(int loop){
		int b;
		
		nside = 0;
		try{
			b = findColor(loop);
		}catch(FailException e){
			return false; //no beads taken, so just return
		}
		stringSide(b, beads[b][1] == loop);
		int open = (beads[b][1] == loop) ? beads[b][2] : beads[b][1];
		while(open != loop){
			try{
				b = findColor(open);
			} catch (FailException e){
				//need tp return boads to active
				for(int i = 0; i<nside;i++)
					beads[side[i][0]][0] = 1;
				return false;
			}
			stringSide(b, beads[b][1] == open);
			open = side[nside-1][2];
		}
		return true;
	}
	
	static void copyLoop(int loc){
		for (int i = nstrung - 1; i >= loc; i--){
			necklace[i+nside][0] = necklace[i][0];
			necklace[i+nside][1] = necklace[i][1];
		}
		nstrung += nside;
		for(int i=0; i<nside; i++){
			necklace[loc + i][0] = side[i][1];
			necklace[loc + i][1] = side[i][2];
		}
	}
	
	static void tryNecklace(){
		readBeads();
		nstrung = 0; //clear necklace
		if(!formLoop(beads[0][1])){
			System.out.println("some beads may be lost");
			return;
		}
		copyLoop(0);
		while(nstrung != nbeads){
			boolean added = false;
			// try to add another loop
			for(int i = 0; i<nstrung;i++){
				if(formLoop(necklace[i][1])){
					copyLoop(i+1);
					added = true;
					break;
				}
			}
			if (!added){
				break;
			}
		}
		if(nstrung != nbeads)
			System.out.println("some beads may be lost");
		else
			for (int i =0; i<nstrung;i++)
				System.out.println(necklace[i][0] + " " + necklace[i][1]);
	}
	
	public static void main (String[] args){
		int ncases = kb.nextInt();
		for(int c = 1; c<=ncases; c++){
			if(c>1)
				System.out.println(); //blank line between cases
			System.out.println("Case #" + c);
			tryNecklace();
		}
	}
	
}
