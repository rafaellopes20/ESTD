package queue;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {

	private E[] array;

	private int head = 0;

	private int tail = 0;

	private int size = 0;

	public ArrayQueue() {
		array = (E[]) new Object[20];
	}

	public ArrayQueue(int i) {
		array = (E[]) new Object[i];
	}

	@Override
	public void enqueue(E e) {
		if(isFull()){
			tail = array.length;
			System.out.println("Redimensionando...");
			E[] temp = (E[]) new Object[array.length * 2];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
		if(tail == array.length){
			tail = 0;
		}
		array[tail] = e;
		tail++;
		size++;
		//tail = tail % array.length //Esse método é o mesmo do IF(tail == array.length)
		System.out.println(Arrays.toString(array));
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			E aux = array[head];
			array[head] = null;
			head++;
			if(head == array.length){
				head = 0;
			}
			size--;
			System.out.println(Arrays.toString(array));
			return aux;			
		}

	}

	@Override
	public E front() {
		return array[head];
	}

	@Override
	public boolean isEmpty() {
		return getSize() == 0;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	private boolean isFull(){
		return getSize() == array.length;
	}

}
