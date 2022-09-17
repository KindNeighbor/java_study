# Chapter 27 NIO

## 1. java.io.Serializable을 import 하는 이유는 무엇인가요?

    java.io 패키지에 있는 Serializable 인터페이스는 선언되어 있는 메소드가 없다. 
    클래스를 파일에 읽거나 쓸 수 있도록 하거나, 다른 서버로 보내거나 받을 수 있도록 
    하려면 반드시 이 인터페이스를 구현(implements) 해야만 한다.
    
## 2. java.io.Serializable의 serialVersionUID 를 지정하는 이유는 무엇인가요? 

    serialVersionUID 라는 변수는 지정하지 않을 경우 컴파일러에서 자동으로 생성해준다. 
    저장되거나 전송되는 클래스의 버전을 관리해 주기 때문에 이 값이 다르면 다른 클래스로 인식된다. 
    따라서, 클래스가 변경되었을 경우에는 이 값을 변경해 주는 것이 좋다.
        
## 3. 자바에서 객체를 파일로 읽거나 쓸 때 사용하는 Stream 클래스 이름은 무엇인가요?

    객체를 저장할 때에는 FileOutputStream 클래스를, 읽을 때에는 FileInputStream 클래스를 사용한다

## 4. transient 예약어의 용도는 무엇인가요? 

    transient 로 선언된 변수는 Serializable 한 클래스를 저장하거나 전송할 때 대상에서 제외된다.
    
## 5. NIO가 생긴 이유는 무엇인가요?

    NIO는 java.io 패키지에서 제공하는 클래스들의 속도 및 성능이 느린것을 보완하기 위해서 만들어졌다.
    
## 6. NIO에서 Channel의 용도는 무엇인가요?

    NIO의 Channel은 데이터를 처리하기 위한 통로로 볼 수 있다.
    
## 7. NIO에서 Buffer의 용도는 무엇인가요?

    NIO의 Buffer는 데이터를 담기 위한 객체로 볼 수 있다.
    
## 8. NIO에서 Buffer의 상태를 확인하기 위한 메소드들에는 어떤 것들이 있나요?

     Buffer에서 상태를 확인하기 위한 메소드는 capacity(), limit(), position() 이 있다.
     
## 9. NIO에서 Buffer의 position을 변경하기 위한 메소드들에는 어떤 것들이 있나요?

    Buffer에서 위치를 변경하는 메소드는 flip(), mark(), reset(), rewind(), remaining(), hasRemaining(), clear() 가 있다.
