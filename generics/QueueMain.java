package generics;

public class QueueMain
{
    public static void main(String[] args)
    {
       Queue<String> sq = new Queue<>();
		sq.enqueue("Generics");
		sq.enqueue("with");
		sq.enqueue("Java");
		
		while(!sq.isEmpty()) {
			String s = sq.dequeue();
			System.out.println(s);
		}
		
		// Integers
		Queue<Integer> iq = new Queue<Integer>();
		iq.enqueue(3);
		iq.enqueue(42);
		iq.enqueue(666);
		
		while(!iq.isEmpty()) {
			int i = iq.dequeue();
			System.out.println(i);
		}

		// test getAll(T[])
		Queue<String> sq2 = new Queue<>();
		sq2.enqueue("Generics");
		sq2.enqueue("with");
		sq2.enqueue("Java");

		String[] copy = new String[5]; // deliberately larger than needed
		copy = sq2.getAll(copy);

		for(String s : copy) {
			System.out.println(s);
        }   
    }
}