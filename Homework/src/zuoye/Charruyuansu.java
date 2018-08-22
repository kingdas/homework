package zuoye;
//有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
public class Charruyuansu {
	public static void main(String[] args) {
		int[] shuzu = { 1, 2, 4, 5 };
		int n = 3;
		int mark = 0;
		int[] shuzu2 = new int[shuzu.length + 1];
		for (int i = 0; i < shuzu.length; i++) 
		{
			if (n >= shuzu[i] && n < shuzu[i + 1])
			{
				mark=i+1;
			}
		}
		shuzu2[mark] = n;
				for (int j = 0; j < shuzu2.length; j++)
				{
					 if (j < mark) {
							shuzu2[j] = shuzu[j];
					 }
				     else if (j == mark)
				    {
						shuzu2[j]=n;
					}
					 else{
					shuzu2[j] = shuzu[j - 1];
					 }
				}
				
		for (int i : shuzu2) {
			System.out.print(i + " ");
		}
	}

}
