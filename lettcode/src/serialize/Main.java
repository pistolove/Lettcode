package serialize;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JavaSerialize javaSerialize = new JavaSerialize();
        javaSerialize.start();
        
        JsonSerialize jsonSerialize = new JsonSerialize();
        jsonSerialize.start();
        
        ProtoBuffSerialize protoBuffSerialize = new ProtoBuffSerialize();
        protoBuffSerialize.start();
    }
}
