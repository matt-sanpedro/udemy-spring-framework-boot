class Computer {
    // void keyword indicates that the method will not return any value
    public void playMusic() {
        System.out.println("Playing music...");
    }

    // if returning a value, must declare the data type
    public String getMeAPen(int cost) {

        if (cost >= 10)
            return "Pen";
            
        return "Nothing";
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(9);
        System.out.println(str);
    }
    
}