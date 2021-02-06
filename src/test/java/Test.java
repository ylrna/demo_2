import java.util.List;

public class Test {

    @org.junit.Test
    public void test(){
        int arr[] = {2,3};
        List list = null;
        try {
            list = demo.get_letter_combinations(arr);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
