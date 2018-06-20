package main;

public class ValidateFourPower {

		int quo;
		public boolean func(int num)
		{	quo= num;
			while(quo>4) {
			quo = quo/4;}
			int rem = quo%4;
			if(rem == 0)
				return true;
			else
				return false;
		}
}
