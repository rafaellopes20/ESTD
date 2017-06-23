package queue;
//3- Dada uma fila de números inteiros, retorne a soma de todos eles.
public class Q3 {

	public int q3(Queue<Integer> q){
		// como é soma a estrutura muda
		int result = 0;
		
		while(!q.isEmpty()){
			result += q.dequeue();
		}
		
		return result;
	}
}
