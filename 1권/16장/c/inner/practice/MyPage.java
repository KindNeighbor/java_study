package c.inner.practice;

public class MyPage {

    InputBox input;
    public static void main(String[] args) {
        MyPage mypage = new MyPage();
        mypage.setUI();
        mypage.pressKey();
    }

    public void setUI(){
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void oneKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void oneKeyUp() {
                System.out.println("Key Up");
            }
        };
        input.setKeyListener(listener);
    }
     public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
         input.listenerCalled(InputBox.KEY_UP);
     }
}
