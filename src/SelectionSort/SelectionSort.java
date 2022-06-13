package SelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int vetor[] = {3,6,8,1,4,9,0};
		
		
		System.out.println("Desordenado");
		for(int i = 0; i<vetor.length;i++) {
			System.out.print(vetor[i]);
			
		}
		int menor, temp;
		for(int i = 0; i<vetor.length;i++) {
			menor=i;
			for(int j = i+1; j <vetor.length; j++) {
				if(vetor[j]<vetor[menor]) {
					menor=j;
				}
			}
			temp=vetor[menor];
			vetor[menor]=vetor[i];
			vetor[i]=temp;
			
		}
		
		System.out.print("\n\nOrdenado\n");
		for(int i=0;i <vetor.length;i++){
			System.out.println(vetor[i]);
		}

	}

}
