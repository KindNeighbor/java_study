Chapter 25 Thread

1. Process와 Thread의 가장 큰 차이는 사용하는 자원의 차이다. Process하나가 실행하기 위해서는 많은 메모리를 필요로 하지만, Thread는 상대적으로 적은 메모리를 필요로한다. 
일반적인 프로그램은 Process하나에 하나 이상의 Thread가 수행된다. 

2. 쓰레드를 구현하기 위해서 java.lang.Runnable 인터페이스를 구현하면 된다.

3. Runnable 인터페이스에는 
public void run() 
메소드만이 선언되어 있다. 

4. 만약 별도로 확장하는 클래스가 없어 확장이 가능하다면, java.lang.Thread 클래스를 확장하여 사용해도 된다.

5. 쓰레드가 시작되는 메소드는 run() 메소드이다. 

6. 쓰레드를 시작하려면 run() 메소드가 아닌 start() 메소드를 호출해야만 한다.

7. Thread의 sleep() 메소드는 매개변수로 넘겨준 시간만큼 해당 쓰레드를 멈춘다.

8. sleep() 메소드로 대기하고 있는 중에 interrupt가 될 수 있으므로, InterruptedException 이 발생할 수 있다. 따라서, try-catch로 감싸주어야만 한다.

9. 데몬 쓰레드는 만약 프로세스가 종료되는 상황이 되었을때 해당 쓰레드가 종료되지 않아도 다른 실행중인 일반 쓰레드가 없다면, 해당 프로세스는 중지된다. 

10. synchronized 구문은 동시에 여러 쓰레드에서 하나의 값에 접근하려고 할 때 데이터의 정합성을 지키기 위해서 사용한다.
그러므로, 여러 쓰레드에서 동시에 접근할 일이 있을 경우에만 써야한다. 그렇지 않으면 성능상 큰 문제가 발생할 수 있다.

11. syhchronized는 메소드 자체를 synchronized로 선언하는 방법과 메소드 내에 필요한 부분만 synchronized로 선언하는 두가지 방법이 있다.

12. 쓰레드의 상태는 NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED로 나뉜다.

13. join()메소드는 해당 쓰레드가 종료될 때까지 대기한다.

14. interrupt() 메소드는 해당 쓰레드를 종료시킨다. 

15. sleep(), join(), wait() 메소드가 호출되어 대기중인 상태에만 interrupt() 메소드가 처리된다.

16. wait() 메소드는 다른 쓰레드가 Object 객체에 대한 notify() 메소드나 notifyAll() 메소드를 호출할 때까지 현재 쓰레드가 대기하고 있도록 한다.
만약 매개변수로 시간을 지정하면 wait() 메소드와 동일하지만, 해당 시간까지만 대기한다.

17. notify() 메소드는 wait() 메소드로 대기중인 쓰레드가 계속해서 작업을 하도록 깨우는 작업을 한다.

18. ThreadGroup의 enumerate() 메소드는 해당 쓰레드 그룹에 포함된 쓰레드나 쓰레드 그룹의 목록을 매개변수로 넘어온 배열에 담는다. 