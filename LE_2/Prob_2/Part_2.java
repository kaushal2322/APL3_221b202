class Voice2 extends Voice {
    public void templateMethod() {
        prepareVoice();
        hear();
    }
}

public class Part_2 {
    public static void main(String[] args) {
        Voice2 voice = new Voice2();
        
        voice.templateMethod();
    }
}
