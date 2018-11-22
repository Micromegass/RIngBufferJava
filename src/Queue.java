
public class Queue {

    private Entry firstElement;
	

	
	Queue (int size) {
		firstElement = new Entry(); 
        Entry lastElementInserted = firstElement;
        
        for (int i = 0; i < size - 1; i++) {
        	
        	Entry nextElement = new Entry(); 
        	lastElementInserted.next = nextElement; 
        	nextElement.previous = lastElementInserted; 
        	nextElement.next = lastElementInserted; 
        	lastElementInserted = nextElement; 
        	
        }
        
        	lastElementInserted.next = firstElement; 
        	firstElement.previous = lastElementInserted; 
          		
	}
	
		
		public void insert(String element) {
			firstElement =  firstElement.next;
			firstElement.element = element; 
			
		}
		
		
		
		public void print() {
			
			Entry actualElement = firstElement; 
			
			do {
				System.out.println(actualElement.element);
				actualElement = actualElement.next;
			} while (actualElement != firstElement);
			
		}
		
		class Entry  {
			String element; 
			Entry next; 
			Entry previous;
				
			}
			
		
	}
	
		
	
