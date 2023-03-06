public class Stack {
    int size, top;
    int arrStack[];
    Stack(int sizeOfStack){

        this.size = sizeOfStack;
        int tempArr[] = new int[sizeOfStack];

        for(int i = 0; i < sizeOfStack ;i++){
            tempArr[i] = 0;
        }
        this.arrStack = tempArr;
    }

    Stack(){
        this.size = 0;
        this.top = 0;
    }

    public boolean empty(){
        if(this.top == 0){
            return true;
        } else {
            return false;
        }
    }

    public void printElements(){
        if(this.size != 0){
            for(int i = 0; i<this.size ;i++){
                System.out.print(this.arrStack[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Empty Stack");
        }

    }

    public void push(int element){
//        System.out.println(this.top);
//        System.out.println(this.size);
        if(this.top != this.size){
            this.arrStack[this.top] = element;
            this.top++;
        } else {
            resizeStack();
            push(element);
        }

    }

    public int pop(){
        if(this.top != 0){
            int popped = this.arrStack[this.top - 1];
            arrStack[this.top - 1] = 0;
            this.top--;
            return popped;
        }
        return 0;
    }

    public int peek(){
        if(this.top != 0){
            int popped = this.arrStack[this.top - 1];
            this.top--;
            return popped;
        }
        return 0;
    }

    public int search(int element){
        if(this.top != 0){
            for(int i = 0; i<this.top ;i++){
                if(this.arrStack[i] == element){
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public void resizeStack(){

        if(this.size == 0){
            this.size = 1;
            int tempArr[] = new int[1];
            this.arrStack = tempArr;
        } else {
            this.size *= 2;

            int tempArr[] = new int[this.size];

            for(int i = 0; i<this.size/2 ;i++) {
                tempArr[i] = this.arrStack[i];
            }

            for(int i = this.size/2; i<this.size ;i++){
                tempArr[i] = 0;
            }

            this.arrStack = tempArr;
        }

    }

}
