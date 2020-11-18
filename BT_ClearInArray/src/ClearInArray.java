import java.util.ArrayList;
    public class ClearInArray {
        public static void main(String[] args)  {
            ArrayList objArray = new ArrayList();
            objArray.clear();
            objArray.add(0,"1");
            objArray.add(1,"2");
            objArray.add(2,"3");
            System.out.println("Array before removing an element"+objArray);
            objArray.remove(1);
            objArray.remove("0th element");
            System.out.println("Array after removing an element"+objArray);
        }
    }

