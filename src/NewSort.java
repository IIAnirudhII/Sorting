import java.util.Arrays;

public class NewSort {

	public NewSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,2,4,3};
		int n=arr.length;
		int key;
		for(int i=1;i<=n-1;i++)
		{
			int j=i-1;
			key=arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
