public class GenericeClass<E> {
    int[] object  = new int[20000];
    int index = 0;
    public void addItem(E value) throws DuplicateException, NullInputException {
        if (value == null) throw new NullInputException("Inputed null value");
        for(int i =0;i<object.length;i++){
            if(object[i]==Integer.valueOf((Integer) value)){
                throw new DuplicateException("Duplicate Value "+object[i]);
            }
        }
        object[index] = Integer.valueOf((Integer) value);
        index++;
    }
    public int getItem(int k) {
        return object[k];
    }
    public int size(){
        return (index);
    }
}

