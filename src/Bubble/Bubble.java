package Bubble;

public class Bubble {

	public static void main(String[] args) {
		int vetor[] = {3,6,8,1,4,9,0};
		int temp;
		boolean check;
				
		for (int i =0; i<vetor.length;++i){
			check=true;
			
		
			for(int j = 0;j<(vetor.length-1);++j){
				if(vetor[j]>vetor[j+1]) {
					temp=vetor[j];
					vetor[j]=vetor[j+1];
					vetor[j+1]=temp;
					check=false;
				}
			
					
				}
			if(check)
			break;
		}
			
		for (int i =0; i<vetor.length;++i){
			System.out.print(vetor[i]+"");
		}

	}

}
