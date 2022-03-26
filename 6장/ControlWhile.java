public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control=new ControlWhile();
        control.whileloop1();
    }
    public void whileloop1() {
        ControlSwitch control= new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            }
        }
    }
