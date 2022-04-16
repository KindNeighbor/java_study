Chapter 20 java.lang

1. java.lang 패키지는 별도로 import하지 않아도 된다. 

2. 자바의 메모리가 부족하여 발생하는 에러는 OutOfMemoryError이다. 
이 에러에 대한 보다 자세한 설명은 "자바 개발자와 시스템 운영자를 위한 트러블 슈팅 이야기"를 참조하기 바란다.

3. 자신의 메소드를 자기가 다시 부르는 재귀 호출 메소드와 같은 것을 잘못 구현하면 StackOverflowError가 발생한다.

4. java.lang 패키지에 선언되어 있는 어노테이션은 다음과 같다.
- Deprecated : 더 이상 사용하지 않는 다는 것을 명시
- Override : Override 명시
- SuppressWarnings : 경고 무시

5. 기본 자료형을 참조자료형으로 만든 클래스들의 MIN_VALUE(최소값)와 MAX_VALUE(최대값) 를 사용하면, 각 타입의 최대 최소값을 확인할 수 있다.

6. Integer클래스의 toBinaryString() 메소드를 호출하면 매개변수의 값을 2진법으로 나타낸다.

7. Integer클래스의 toHexString() 메소드를 호출하면 매개변수의 값을 2진법으로 나타낸다.

8. Properties는 JVM에서 사용하는 속성 값을 제공하며, Environmemt는 시스템(장비)에서 사용하는 환경 값을 제공한다.

9. System.out과 System.err는 모두 java.io.PrintStream 클래스를 의미한다. 

10. System.currentTimeMillis() 메소드를 호출하면 현재 시간을 밀리초(1/1000)단위로 제공한다. 이 시간은 1970년 1월 1일 00:00 부터 현재까지의 시간이다.

11. System.nanoTime() 메소드는 나노초 단위로 결과를 제공하며, 이 메소드에서 제공하는 시간은 오직 소요 시간을 측정하기 위해서 사용된다.

12. System.out.print() 메소드는 데이터를 출력후 줄바꿈을 하지 않으며, System.out.println()메소드는 데이터를 출력후 줄바꿈을 수행한다.

13. System.out.println() 메소드에서 출력을 할 때에는 String 클래스에 선언된 valueOf()메소드가 수행된다. toString()메소드가 수행되는 것이 아니다. 

14. 숫자 계산을 위해서 Math라는 클래스가 존재한다. 

15. Math 클래스에 있는 상수와 메소드는 모두 static 으로 선언되어 있기 때문에 별도의 객체를 선언할 필요가 없다.

16. 숫자의 절대값은 Math 클래스의 abs() 메소드를 사용하면 된다.

17. 반올림을 하는 Math 클래스의 메소드는 round()와 rint() 이다. 

18. Math클래스에서 Radian으로 변환하는 메소드는 toRadians()메소드이며, Degree로 변환하는 메소드는 toDegrees() 메소드이다. 

19. Math 클래스의 pow() 메소드는 제곱값을 구하는 데 사용한다. 5의 4제곱은 Math.pow(5,4)과 같이 사용하면 된다. 