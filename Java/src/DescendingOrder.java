
public class DescendingOrder {
public static void main(String[] args) {
	int a[]= {12,35,46,76,11};
	int temp;
	for (int i = 0; i < a.length; i++) {
for (int j = i+1; j < a.length; j++) {
			if(a[i] < a[j]) {
			temp =a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
	System.out.println("descending "+a[i]);
}
}
}