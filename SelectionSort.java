import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int[] inputArray={3,7,5,4,3,90} ;
	int temp, pos;

	for (int i = 0; i < inputArray.length - 1; i++)
	{
		pos = i;

		

		for (int j = i+1; j < inputArray.length; j++)
		{
			if(inputArray[j] < inputArray[pos] )
			{
				pos = j;
			}
		}


		temp = inputArray[i];

		inputArray[i] = inputArray[pos];

		inputArray[pos] = temp;
	}

	for (int i = 0; i < inputArray.length; i++)
	{
		System.out.print(inputArray[i] + " ");
	}

}
}
