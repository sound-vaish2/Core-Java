package com.vs.java.problems;

public class Dungeon {

	public static void main(String[] args) {
		int[] arr = {3,2,4};
		//2 1 3  1 1 2  1 1 1
		int shot = 0,i=0;
		while(shot != 8)
		{
			if(arr[i]>1)
			{
				if(shot == 6)
				{
					for(int j=0;j<3;j++)
					{
						arr[j]=arr[j]--;	
						System.out.print("yes");
				  	}
					break;
				}
				arr[i]=arr[i]--;
				shot++;
			}
			else
			{
				System.out.print("no");
				break;
			}
			i++;
			if(i == 2)
			{
				i = 0;
			}
			
		}
	}

}
