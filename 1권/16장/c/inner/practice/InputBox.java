package c.inner.practice;

import java.awt.event.KeyListener;

public class InputBox {
    public InputBox() {
    }
    KeyEventListener listener;
    public void setKeyListener(KeyEventListener listener) {
        this.listener = listener;
    }
    public static final int KEY_DOWN = 2;
    public static final int KEY_UP = 4;
    public void listenerCalled(int eventType) {
        if(eventType == KEY_DOWN) {
            listener.oneKeyDown();
        } else if(eventType == KEY_UP) {
            listener.oneKeyUp();
        }
    }
}
