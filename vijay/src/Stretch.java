
import java.util.Scanner;
import java.util.Arrays;
public class Stretch {
    // initialize the 2dArray
	/*static int[][] Intit2DArray(int r, int c, int count){
		int[][] RG= new int[r][c];
		for(int rows=0; rows<r;rows++) {
			for(int col= 0; col<c;col++) {
				RG[rows][col]= count;
				count+=1;

			}
		}
		//used for testing purposes
		return RG;
	}*/
    static boolean CheckEnding( int[]result,int BlockA, int BlockB, int BlockC ) {
        for( int i= 0; i<=5; i++) {
            if(BlockB== result[i]||BlockA==result[i]||BlockC==result[i]) {
                return true;
            }
        }
        return false;
    }// checks if it already went to the ending part
    static boolean CheckIfBlockRestricted(int nBlock, int n2)  {
        if( nBlock==n2) {
            return true;
        }
        return false;
    }// checks of the block is restricted
    static String[] finalComputation(int BlockA, int BlockB, int BlockC, int s, int n, int n2, int[]result ) {
        int count =0;// switch between Blocks
        int secondCounter =0;// dont know why I need this
        int BlockACounter=0;// ends blockA's turn
        int BlockBCounter=0;// keeps track of Block b's turn
        BlockA = s-1;

        String[] answer= new String[1];// going to return this later
        while( CheckEnding(result , BlockA, BlockB, BlockC)== false){// while the blocks dont reach the end
            // supposed to keeping on checking this condition
            if( count == 0 && BlockACounter!=3 ) {// BlockA's turen
                if (CheckIfBlockRestricted(BlockA, n2 )==false) {// while the blockA isn't restricted
                    BlockA+=1;
                    BlockACounter+=1; // after it adds by three it will switch to block B
                }
                else {
                    count+=1;// switches turn to BlockB
                }

            }
            else {
                if( count ==1&& BlockACounter==3) {
                    BlockACounter=0;// once its blockB's turn Block A's counter gets reset

                    answer[0]="A";

                }
				/*if( count==1 && (BlockBCounter==0|| BlockBCounter==3)) {
					if (CheckIfBlockRestricted(BlockB, n2 )==false) {// if block b is not restricted
					BlockB=BlockA;// blockB gets set to equal BlockA
					BlockB+=1;
					BlockBCounter+=1;// blockB counter increments by 1


					}
				}*/
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int r= 6;
        int c= 10;
        int s= 11;
        int n= 1;
        int n2= 37;
        int count= 1;// this counter was used to make the unneccesary 2d array
        int BlockA=0;
        int BlockB=0;
        int BlockC= 0;
        // I initialized these variables to test my logic for the program

        //int[] BlockA= {s,s+1,s+2};// only refers to the first Block A BlockB and Block C usless code
        //int BlockB[]= {s+3, s+13, s+14}; code is useless
        //int BlockC[]= {s+15, s+16,s+26,s+36};
        int result[]= {10,20,30,40,50,60};
        //int rectangularGrid[][]=Intit2DArray( r , c, count);

        String a[] = new String[1];
        a= finalComputation(BlockA, BlockB, BlockC,s, n,n2, result);
        System.out.print(a[0]);//why is it printing null



        // dont know why not working
    }

}

