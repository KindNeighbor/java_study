# Chapter 16 nested class

## 1. Nested 클래스에 속하는 3가지 클래스에는 어떤 것들이 있나요?

    Nested 클래스는 Static nested class, Local inner class, Anonymous inner class로 나뉜다.

## 2. Nested 클래스를 컴파일하면 Nested 클래스 파일의 이름은 어떻게 되나요?

    Nested 클래스를 컴파일하면 "감싼클래스$Nested클래스.class"가 생성된다.

## 3. Static Nested 클래스는 다른 Nested 클래스와 어떤 차이가 있나요?

    Static nested 클래스와 다른 nested 클래스의 차이점은 객체를 생성하는 방법이 다르다는 것이다.

## 4. StaticNested 클래스의 객체 생성은 어떻게 하나요?

    OuterClass클래스 내에 StaticNestedClass 이라는 static nested 클래스가 있다면,
    OuterClass.StaticNestedClass staticNested=new OuterClass.StaticNestedClass();
    와 같이 선언한다.

## 5. 일반적인 내부 클래스의 객체 생성은 어떻게 하나요?

    OuterClass클래스 내에 NestedClass 라는 inner 클래스가 있다면,
    OuterClass outer=new OuterClass();
    OuterClass.NestedClass nested=outer.new NestedClass();
    로 선언한다. 

## 6. Nested 클래스를 만드는 이유는 무엇인가요?

    Nested 클래스를 생성하는 이유는 다음과 같다.
    - 한 곳에서만 사용되는 클래스를 논리적으로 묶어서 처리할 필요가 있을 때
    - 캡슐화가 필요할 때(예를 들어 A 라는 클래스에 private 변수가 있다. 이 변수에 접근하고 싶은 B라는 클래스를 선언하고, 
    B 클래스를 외부에 노출시키고 싶지 않을 경우가 여기에 속한다.) 
    - 소스의 가독성과 유지보수성을 높이고 싶을 때 

## 7. Nested 클래스에서 감싸고 있는 클래스의 private로 선언된 변수에 접근할 수 있나요?

    내부 클래스와 익명 클래스는 감싸고 있는 클래스의 어떤 변수라도 참조할 수 있다. 

## 8. 감싸고 있는 클래스에서 Nested 클래스에 선언된 private로 선언된 변수에 접근할 수 있나요?

    감싸고 있는 클래스에서 Static Nested 클래스의 인스턴스 변수나 내부 클래스의 인스턴스 변수로의 접근하는 것도 가능하다. 
