import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,2,4,3};
		int n=arr.length;
		int temp;
		boolean swap;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-2;j++)
			{
				swap=false;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(swap=false)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
