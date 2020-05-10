public class MainProcess {
    public static void main(String[] agrs){
        GenericeClass<Integer> list = new GenericeClass<>();
        try{
            list.addItem(1);
            list.addItem(2);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("\nList all from inputed");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.getItem(i));
        }
    }
}
