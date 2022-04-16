# Chapter 20 java.lang

## 1. 자바 패키지 중 같은 패키지에 있는 클래스를 제외하고, 별도로 import하지 않아도 되는 패키지는 무엇인가요?

    java.lang 패키지는 별도로 import하지 않아도 된다. 

## 2. 자바의 메모리가 부족해서 발생하는 에러는 무엇인가요?

    자바의 메모리가 부족하여 발생하는 에러는 OutOfMemoryError이다. 

## 3. 메소드 호출 관계가 너무 많아서 발생하는 에러는 무엇인가요?

    자신의 메소드를 자기가 다시 부르는 재귀 호출 메소드와 같은 것을 잘못 구현하면 StackOverflowError가 발생한다.

## 4. java.lang 패키지에 선언되어 있는 3개의 어노테이션에는 어떤 것들이 있고, 각각의 역할은 무엇인가요?

    - Deprecated : 더 이상 사용하지 않는 다는 것을 명시
    - Override : Override 명시
    - SuppressWarnings : 경고 무시

## 5. Double과 Integer 같은 숫자 타입에서 처리할 수 있는 최대, 최소값을 알 수 있는 상수의 이름은 무엇인가요?

    기본 자료형을 참조자료형으로 만든 클래스들의 MIN_VALUE(최소값)와 MAX_VALUE(최대값) 를 사용하면, 
    각 타입의 최대 최소값을 확인할 수 있다.

## 6. Integer 값을 2진법으로 표현하려면 어떤 메소드를 사용해야 하나요?

    Integer클래스의 toBinaryString() 메소드를 호출하면 매개변수의 값을 2진법으로 나타낸다.

## 7. Integer 값을 16진법으로 표현하려면 어떤 메소드를 사용해야 하나요?

    Integer클래스의 toHexString() 메소드를 호출하면 매개변수의 값을 2진법으로 나타낸다.

## 8. 속성(Properties)과 환경(Environment) 값의 차이는 무엇인가요?

    Properties는 JVM에서 사용하는 속성 값을 제공하며, Environmemt는 시스템(장비)에서 사용하는 환경 값을 제공한다.

## 9. System.out과 System.err에서 사용할 수 있는 메소드들을 확인하려면 어떤 클래스를 찾아봐야 하나요?

    System.out과 System.err는 모두 java.io.PrintStream 클래스를 의미한다. 

## 10. System 클래스에서 현재 시간을 조회하는 용도로 사용하는 메소드 이름은 무엇인가요?

    System.currentTimeMillis() 메소드를 호출하면 현재 시간을 밀리초(1/1000)단위로 제공한다. 

## 11. System 클래스에서 시간 측정 용도로 사용하는 메소드 이름은 무엇인가요?

    System.nanoTime() 메소드는 나노초 단위로 결과를 제공하며, 
    이 메소드에서 제공하는 시간은 오직 소요 시간을 측정하기 위해서 사용된다.

## 12. System.out.print() 메소드와  System.out.println() 메소드의 차이는 무엇인가요?

    System.out.print() 메소드는 데이터를 출력후 줄바꿈을 하지 않으며, 
    System.out.println()메소드는 데이터를 출력후 줄바꿈을 수행한다.

## 13. System.out.println() 메소드에 객체가 매개 변수로 넘어 왔을 때 String의 어떤 메소드가 호출되어 결과를 출력하나요? 그리고, 그 메소드를 사용하는 이유는 무엇인가요?

    System.out.println() 메소드에서 출력을 할 때에는 String 클래스에 선언된 valueOf()메소드가 수행된다. 
    toString()메소드가 수행되는 것이 아니다. 
