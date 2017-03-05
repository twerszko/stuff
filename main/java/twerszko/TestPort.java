package twerszko;

import java.io.IOException;
import java.net.ServerSocket;

public class TestPort {
    public synchronized static int nextPort() {
        try (ServerSocket socket = new ServerSocket(0)) {
            return socket.getLocalPort();
        } catch (IOException e) {
            throw new RuntimeException("Could not find free port", e);
        }
    }
}