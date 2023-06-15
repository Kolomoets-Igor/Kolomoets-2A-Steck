
package stack;

class Stack1{
    private int mSize;
    private int[] stackArray;
    private int top;
    
    public Stack1(int m){
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }
    public void addElement(int element){ //Увеличение индекса массива, 
        stackArray[++top] = element; //добавление элемента на позицию
    }
    
    public int deleteElement(){ //Удаление элемента
        return stackArray[top--];
    }
    
    public int readTop(){ //Возвращает элемент, который 
        return stackArray[top]; //находится на вершине стека
    }
    
    public boolean isEmpty(){ //Проверка на заполненность массива
        return (top == -1);
    }
    
    public boolean isFull(){ //Проверка на заполненность массива
        return(top == mSize -1);
    }
}

public class Stack {

    
    public static void main(String[] args) {
       Stack1 mStack = new Stack1(10);
       
       mStack.addElement(79);
       mStack.addElement(59);
       mStack.addElement(35);
       mStack.addElement(24);
       
       mStack.deleteElement();
       
       System.out.print('Стек :');
       while (!mStack.isEmpty()){
           int value = mStack.deleteElement();
           System.out.print(value);
           System.out.print(" ");
       }
       System.out.println("");
    }
    
}
