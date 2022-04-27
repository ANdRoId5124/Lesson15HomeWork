public class Test4 implements Test1 <Integer> {
    @Override
    public Integer methodOfInterface(Integer variable) {
        Integer variable2 = 1;
            for (Integer i = 1; i <= variable; i++) {
               variable2 = variable2 * i;

        }
        return variable2;
    }
}