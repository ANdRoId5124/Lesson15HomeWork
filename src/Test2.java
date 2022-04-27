public class Test2 implements Test1 <StringBuilder>{
    @Override
    public  StringBuilder methodOfInterface(StringBuilder variable) {
        variable.reverse();
        return variable;
    }
}




