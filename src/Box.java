import javax.print.DocFlavor;

public class Box <T>{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    protected <T> T getData (String hashKey, String dataKey, Class<T> tClass) {
        if(hashKey.equals("userCache") && dataKey.equals("user123")){
           return tClass.cast("John Doe");
        }
        return null;
    }

}
