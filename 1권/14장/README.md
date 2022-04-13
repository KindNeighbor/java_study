Chapter 14 exception

1. 예외는 try - catch - finally 블록으로 처리한다.

2. 예외가 발생 가능한 부분을 try 블록으로 묶어 준다.

3. finally 블록은 예외 발생 여부와 상관 없이 무조건 실행하도록 할 때 사용한다.

4. 예외는 다음의 3가지로 나뉜다.
- checked exception
- error
- runtime exception 혹은 unchecked exception

5. error는 치명적인 오류를 의미한다. 기본적으로는 프로그램 내에서 발생한다기 보다는 JVM 이나 시스템에서 문제가 발생했을 때 error가 발생한다.

6. throw를 사용하여 새로운 예외를 발생시키면, 해당 예외를 호출한 메소드로 던진다.

7. throw가 메소드 내에 있다면 메소드 선언시 throws 를 사용하여 던질 예외의 종류를 명시하는 것이 좋다.

8. Exception클래스를 확장하여 예외 클래스를 만들 수 있다.
하지만, 이렇게 되면 무조건 해당 예외를 던지는 메소드에서 try-catch로 묶어야 한다는 단점이 있다.
따라서, RuntimeException 클래스를 확장하여 선언하는 것을 권장한다.