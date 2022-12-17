package Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // it will call CustomStack - Default Constructor
    }
    public DynamicStack(int size){
        super(size); // this will call CustomStack(int size)
    }
    @Override
    public boolean push(int item) throws StackException {
        // This can take care of it being full.
        if (this.isFull()){
            // Double the array size
            int[] temp = new int[data.length*2];

            // copy all the previous item into new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know array is not full hence we can insert the item normally
        // In the end insert item
        return super.push(item);

    }
}
