Chapter 13 interface, enum

1. 인터페이스에서는 메소드를 선언만 해야 한다. 메소드 선언후 중괄호를 열고 닫기만해도 컴파일이 되지 않는다.

2. 클래스 선언시 class 가 들어가는 자리에 interface가 위치해야 한다.

3. abstract 클래스는 인터페이스처럼 메소드를 선언만 할 수도 있고, 일부 메소드를 구현 할 수도 있다.

4. abstract 메소드 선언시에는 abstract 예약어를 사용해야 한다. 당연히 해당 클래스도 abstract class로 선언 되어 있어야만 한다.

5. final로 선언된 클래스는 확장(extends)할 수 없다.

6. 메소드를 final로 선언하면 override할 수 없다. 

7. 변수를 final로 선언하면, 그 값을 변경할 수 없다. 따라서 변수는 대부분 선언과 동시에 값을 할당한다. 

8. enum 클래스의 상수들은 콤마 , 로 구분한다. 

9. 모든 enum 클래스의 부모 클래스는 java.lang.Enum 이다. 

10. values() 메소드는 enum클래스에 선언된 상수의 목록을 배열로 리턴한다.