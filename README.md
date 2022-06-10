# Java (자바 관련 질문. 추가중)

### Q. Managed - Unmanaged 언어의 차이는 무엇이고 어떤 장, 단점이 있나요?
  
  - Managed : CLR이나 JVM같은 런타임에서 실행이 관리되는 코드
    - 장점 
      - 메모리 관리, 보안, 스레딩에 관련된 서비스를 JVM(CLR)에서 제공해준다. 
      - JIT 컴파일러에 의해 최적화된 변환과정을 제공받는다. 
      - 운영체제에 종속되지 않으며 개발할 수 있다. 
    - 단점  
      - Native Code에 비교하여 실행 속도가 느리다. 
      - JVM(CLR)이 설치되어 있지않으면 실행할 수 없다
  - Unmanaged : CLR(JVM)에 의존하지 않는 언어
    - 장점 
      - Managed Code와 비교해서 속도가 더 빠르다. 
    - 단점 
      - 확장성의 한계를 가진다. 
  
### Q. Java 접근 제어자에는 무엇이 있는지 설명해주시고 Protect와 Private는 어느 시점에 어떻게 사용될 수 있는지 이야기 해주세요.

 - private 접근 제어자 : 단어 뜻 그대로 개인적인 것이라 외부에서 사용될 수 없도록 한다.
 - default 접근 제어자 : 같은 패키지에 소속된 클래스에서만 사용할 수 있도록 한다.
 - protected 접근 제어자 : 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 한다.
 - public 접근 제어자 : 단어 뜻 그대로 외부 클래스가 자유롭게 사용할 수 있도록 한다.
 - private -> default -> protected -> public 순으로 점점 보다 많은 접근을 허용

### Q. JVM의 메모리 구조에 대해서 설명해 주세요.

![제목 없음](https://user-images.githubusercontent.com/97837003/170873617-cc00b2aa-ebfc-408e-98b3-385b26a13ecd.jpg)

- Class Loader

JVM 내로 클래스 파일을 로드하고, 링크를 통해 배치하는 작업을 수행하는 모듈. 런타임 시에 동적으로 클래스를 로드한다.

- Execution Engine

클래스 로더를 통해 JVM 내의 Runtime Data Area에 배치된 바이트 코드들을 명렁어 단위로 읽어서 실행. 최초 JVM이 나왔을 당시에는 인터프리터 방식이었기때문에 속도가 느리다는 단점이 있었지만 JIT 컴파일러 방식을 통해 이 점을 보완. JIT는 바이트 코드를 어셈블러 같은 네이티브 코드로 바꿈으로써 실행이 빠르지만 역시 변환하는데 비용이 발생함. 이 같은 이유로 JVM은 모든 코드를 JIT 컴파일러 방식으로 실행하지 않고, 인터프리터 방식을 사용하다가 일정한 기준이 넘어가면 JIT 컴파일러 방식으로 실행.

- Garbage Collector

Garbage Collector(GC)는 힙 메모리 영역에 생성된 객체들 중에서 참조되지 않은 객체들을 탐색 후 제거하는 역할을 한다. 이때, GC가 역할을 하는 시간은 언제인지 정확히 알 수 없다.

- Runtime Data Area

JVM의 메모리 영역으로 자바 애플리케이션을 실행할 때 사용되는 데이터들을 적재하는 영역. 이 영역은 크게 Method Area, Heap Area, Stack Area, PC Register, Native Method Stack로 나뉜다.


### Q. JVM은 어떤 방식으로 코드를 해석하고 실행시키는지 흐름에 맞게 설명해 주세요. (Java 실행 흐름)

 1. 자바로 개발된 프로그램을 실행하면 JVM은 OS로부터 메모리를 할당.

 2. 자바 컴파일러(javac)가 자바 소스코드(.java)를 자바 바이트코드(.class)로 컴파일.

 3. Class Loader를 통해 JVM Runtime Data Area로 로딩.

 4. Runtime Data Area에 로딩 된 .class들은 Execution Engine을 통해 해석.

 5. 해석된 바이트 코드는 Runtime Data Area의 각 영역에 배치되어 수행하며 이 과정에서 Execution Engine에 의해 GC의 작동과 스레드 동기화가 이루어진다.
 

### Q. Garbage Collector은 무엇이고, Parallel GC와 CMS GC, G1 GC의 큰 차이는 무엇인지 설명해주세요. (mark-sweep-compact, concurrency-sweep, garbage-first)

 - Serial GC
   - 하나의 CPU로 Young 영역과 Old 영역을 연속적으로 처리하는 방식.
   - GC가 수행될 때 STW(Stop The World)가 발생.
   
 - Parallel GC
   - Parallel GC의 목표는 다른 CPU가 GC의 진행시간 동안 대기 상태로 남아 있는 것을 최소화 하는 것.
   - Serial GC의 Young 영역에서 진행하는 방식을 병렬로 처리하여 부하를 줄인다.
   
  - Parallel Compacting GC
    - Parallel GC에서 Old 영역의 알고리즘을 변경.
    
  - Concurrent Mark-Sweep(CMS) GC
    - Application의 Thread와 GC Thread가 동시에 실행되어 STW를 최소화 하는 GC.
    
  - Parallel GC와 가장 큰 차이점은 Compaction 작업 유무로 구분 가능.
    - Compaction은 메모리 공간에서 사용하지 않는 빈 공간이 없도록 옮겨서 메모리 분산을 제거하는 작업을 의미)
    
  - G1(Garbage First) GC
    - G1 GC는 CMS GC를 대체하기 위해 만들어졌다. 
    - G1 GC는 Garbage만 있는 Region을 처음에 수거하기 때문에 Garbage First라는 이름이 붙었다. 
    - CMS GC와 다르게 Compaction 단계를 진행해 메모리 단편화를 없앴다.

### Q. Java 8 버전에 추가된 중요 기능들에 대하여서 설명해주세요.

 - Lambda 표현식
   - 익명 클래스를 사용하면 가독성도 떨어지는 불편함이 있는데 이를 보완하기 위해서 람다 표현식이 만들어졌다. 
   - 대신 이 표현식은 인터페이스에 메소드가 하나인 것들만 적용 가능하다.(default method 가 생긴 이유 중 하나이다) 
   - 람다 표현식은 익명 클래스로 전환이 가능하며, 익명 클래스는 람다 표현식으로 전환이 가능하다.
 
 - Functional 인터페이스
   - 하나의 메소드만 선언되어 있는 interface. 
   - 인터페이스 선언시 @FunctionalInterface 어노테이션을 사용하면 해당 인터페이스는 내용이 없는 하나의 메소드만 선언 할 수 있다. 
   - 두개 선언 시 컴파일 오류가 난다.
 
 - Stream
   - 스트림은 데이터의 흐름. 
   - 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.
   - 간단하게 병렬처리(multi-threading)가 가능.
 
 - Optional
   - Optional은 Funtional 언어인 Haskell과 Scala에서 제공하는 기능을 따 온 것이다. 
   - 객체를 편리하게 처리하기 위해서 만든 클래스이다. 
   - null 처리를 보다 간편하게 하기 위해서 만들어졌다. 
   
 - 인터페이스의 Default method
 
 - 날짜 관련 클래스들 추가
   - java.time.ZoneDateTime / java.time.LocalDate 
   - java.time.format.DateTimeFormatter
   - 요일 : java.time.DayOfWeek (enum) 
   
 - 병렬 배열 정렬
   - java 8 에서는 parallelSort()라는 정렬 메소드가 제공되며, Fork-Join 프레임워크가 내부적으로 사용된다. 
   - 일반적인 sor()의 경우 단일 쓰레드로 수행되며, parallelSort()는 필요에 따라 여러 개의 쓰레드로 나뉘어 작업이 수행된다. 
   - CPU를 더 많이 사용하게 되겠지만 처리속도는 더 빠르다. 
   
 - StringJoiner
   - 공백이나 구분자를 반복해서 붙여야하는 경우에 유용하게 사용.


### Q. Java는 Call By Value일까요, Call By Reference 일까요?

 - Java는 Call By 'Value' 이다.
 - 값만 전달하는 방식
 - 포인터를 사용하면 유연성과 성능을 향상시킬 수 있지만 안정성이 떨어지기 때문에 Java에서는 포인터라는 개념을 개발자에게 제공하지 않는다.
 - JAVA에서 Call by reference는 해당 객체의 주소값을 직접 넘기는 게 아닌 객체를 보는 또 다른 주소값을 만들어서 넘긴다. 
 - GC가 실행될 때마다 Heap 영역의 객체의 주소가 계속 바뀐다. C,C++ 에서의 포인터가 Java에는 존재하기 힘들다.

### Q. Shallow Copy와 Deep Copy의 차이는 무엇인가요? 자바에서 Deep Copy를 하기 위해서는 무엇을 사용하여야 하나요?

  - Shallow Copy는 주소값을 복사하기(스텍 영역) 때문에 참조하고 있는 실제 값은 같다.
  - Deep Copy는 실제 값을 메모리 공간에 복사하기(힙 영역) 때문에 참조하고 있는 실제 값이 다르다.
  - Depp Copy를 하기위한 방법
    - 복사 생성자 또는 복사 팩토리를 이용하여 복사
    - 직접 객체를 복사하는 방법
    - Clonable 인터페이스를 구현하고 clone()함수를 오버라이딩하여 복사
    - https://choiblack.tistory.com/41 (방법 참조)

### Q. Java Reflection이란 무엇이고, 어떨 때 사용되는 것인가요?

  -  Java Reflection이란 힙 영역에 로드된 Class 타입의 객체를 통해, 원하는 클래스의 인스턴스를 생성할 수 있도록 지원하고, 인스턴스의 필드와 메소드를 접근 제어자와 상관 없이 사용할 수 있도록 지원하는 API이다.
  -  규모가 작은 콘솔 단계에서는 개발자가 충분히 컴파일 시점에 프로그램에서 사용될 객체와 의존 관계를 모두 파악할 수 있다. 하지만 프레임워크와 같이 큰 규모의 개발 단계에서는 수많은 객체와 의존 관계를 파악하기 어렵다. 이때 리플렉션을 사용하면 동적으로 클래스를 만들어서 의존 관계를 맺어줄 수 있다.

### Q. Java Instrumentation이란 무엇이고 사용했을 때 어떤 장점이 있을까요?

  - Java Instrumentation은 응용 프로그램 외부에 독립된 에이전트(agent) 프로그램으로 JVM에서 실행되는 응용 프로그램을 모니터링하고 지원하는 것을 말한다.
  - BCI를 통해 모니터링 대상이 되는 어플리케이션의 수정없이 성능 측정에 필요한 요소들을 삽입할 수 있다. 

### Q. Java Stream API의 특징은 무엇이 있나요?

  - 컬렉션의 요소를 람다식으로 처리할 수 있도록 하는 함수형 프로그래밍 도구
  - 간결한 코드로 작성할 수 있다.
  - 데이터 소스에 대한 공통된 접근 방식 제공 한다.
  - Stream으로 변경해주고 나면, List, Set, Map 모두 동일한 방식으로 데이터를 처리할 수 있다.

### Q. Java Lambda는 왜 만들어졌고, 어느 때 주로 사용할까요?

   - 익명 클래스를 사용하면 가독성도 떨어지는 불편함이 있는데 이를 보완하기 위해서 람다 표현식이 만들어졌다. 
   - 대신 이 표현식은 인터페이스에 메소드가 하나인 것들만 적용 가능하다.(default method 가 생긴 이유 중 하나이다) 
   - 람다 표현식은 익명 클래스로 전환이 가능하며, 익명 클래스는 람다 표현식으로 전환이 가능하다.

### Q. Java의 Functional interface는 무엇인가요?

 - 메서드를 하나만 가지는 인터페이스를 Functional interface라고 한다.
 - 람다식과 인터페이스의 메서드가 1:1로 연결시키기 위해서 사용.

### Q. foreach를 사용할 수 있는 자료구조는 어떤 인터페이스를 상속 받고 있나요?

 - Iterable 인터페이스를 상속 받는다.

### Q. iterator와 iterable 차이는 무엇인가요?

 - Iterator와 Iterable은 List 같은 자료구조에 저장된 데이터를 순차적으로 접근하는 객체.
 - Iterable은 List처럼 데이터를 순회할 수 있는 객체. 
 - Iterator는 Iterable 객체를 순회하는 객체.
 - Iterable은 iter() 메소드로 Iterator 객체를 생성할 수 있다. 
 - Iterator는 __next__() 메소드로 Iterable의 데이터에 순차적으로 접근 가능. 
 - Iterator 객체는 항상 Iterable 객체가 된다. 하지만 Iterable 객체는 Iterator 객체가 될 수 있지만 아닐 수도 있다.

### Q. Fast-fail iterator는 무엇이고 어떤 것을 위해 사용되는 건가요?
 
 - Fail fast Iterator는 장애가 발생할때 작업을 중단하고, 멈추고 전체작업을 중지한다.
 - 컬렉션 순회도중 컬렉션의 변경이생기면 예외를던진다. 
 - Fail Safe에 비해 속도가빠르며, 메모리도 비교적 적게 요구된다.

### Q. 자바의 synchronized 키워드에 대해 설명해주시고 Reentrant Lock와의 차이는 무엇인지 말씀해주세요.

 - synchronized는 여러개의 스레드가 객체에 접근하는 것을 제어하여 객체의 thread-safe를 가능케 하는 방식이다.
 - Reentrant Lock은 시작점과 끝점을 수동적으로 설정이 가능한 명시적인 동기화이다.
 - 기존의 synchronized는 메소드전체나 구간을 묶어서 동기화를 시켰으나, Reentrant Lock은 시작점과 끝점을 명백히 명시할 수 있다.

### Q. Java의 synchronized Lock 범위에 대해서 알려주세요. (Class Lock, Instance Lock)
 
 - Methods 자체에 Syncronized를 설정 하는 경우 Class Lock이 된다.
 - synchronized(this)와 같이 Synchronized Statements를 사용하면 특정 Block 영역 범위로 Synchronized를 제한하는 Instance Lock이 된다.

### volatile 키워드에 대해 설명해 주세요.

 - Java 변수를 Main Memory에 저장하겠다라는 것을 명시한다.
 - 매번 변수의 값을 Read할 때마다 CPU cache에 저장된 값이 아닌 Main Memory에서 읽는다.
 - 또한 변수의 값을 Write할 때마다 Main Memory에 까지 작성한다.
 - Multi Thread환경에서 Thread가 변수 값을 읽어올 때 각각의 CPU Cache에 저장된 값이 다르기 때문에 변수 값 불일치 문제가 발생한다.
 - 이 경우 volatile 키워드를 추가하게 되면 Main Memory에 저장하고 읽어오기 때문에 변수 값 불일치 문제를 해결 할 수 있다.

### Q. atomic Type과 CAS는 무엇이고 언제 사용되는 것인가요?

 - synchronized를 통해 blocking을 사용하는 경우, lock을 걸게 되는데 이 경우 해당 lock에 접근하는 스레드들은 블로킹 상태에 들어가기 때문에 아무 작업도 하지 못한 채 자원을 낭비하게 되고 이는 곧 성능 저하로 이어진다.
 - 이러한 문제점 때문에 non-blocking을 하며 원자성을 보장하기 위한 방법이 atomic 변수이다.
 - 이런 atomic의 핵심 동작 원리는 CAS(Compare And Swap) 알고리즘이다.
 
### Q. 스레드에서 Race condition에 대해서 설명해주세요.

 - 2개 이상의 concurrent한 쓰레드들이 공유된 자원에 접근하려고 할 때 동기화 메커니즘 없이 접근하려고 하는 상황을 의미하며 데이터간의 불일치성이 발생
 - 코드에서 Race Condition이 발생할 수 있는 부분을 critical section이라 한다.

### Q. Java final 키워드에 대해서 설명해주세요. 각각의 쓰임에 따라 어떻게 동작하나요? (Class, Variable)

 - final 키워드는 변수(variable), 메서드(method), 또는 클래스(class)에 사용될 수 있다.
 - 변수에 final을 붙이면 이 변수는 수정할 수 없다는 의미
 - 메서드에 final을 붙이면 override를 제한
 - final 키워드를 클래스에 붙이면 상속 불가능 클래스

### Q. String이 final인 이유는 무엇인가요?

 - 메모리 절약을 위한 캐싱 기능을 위해서.
 - 보안상의 이유. 만약 final이 아니라면 사용자는 시스템의 특정 파일에 대한 엑세스 권한을 얻은 후 Path의 변경이 가능하게 되며, 이렇게 되었을 경우 심각한 보안 문제가 발생가능.
 - 문자열은 HashMap, Hashtable 같은 해시 기반 컬렉션의 키로써 많이 사용되기 때문에 동일한 값으로 저장된 객체의 value를 검색할 수 있도록 immutable한 것이 중요.

### Q. Wrapper Class란 무엇이고 Primitive Type과의 차이는 무엇인가요?

 - 8개의 기본 타입에 해당하는 데이터를 객체로 표현하기 위해 포장해주는 클래스.
 - 래퍼 클래스로 산술 연산을 위해 정의된 클래스가 아니다. 따라서 인스턴스에 저장된 값을 변경할 수 없다.
 - 값을 참조하기 위해 새로운 인스턴스를 생성하고 생성된 인스턴스의 값만을 참조할 수 있다.

### Q. 객체 지향의 클래스, 객체, 인스턴스 차이에 대해서 설명해 주세요.

 - 클래스
    - 객체를 만들어 내기 위한 설계도 혹은 틀 
    - 연관되어 있는 변수와 메서드의 집합

 - 객체
    - 소프트웨어 세계에 구현할 대상 
    - 클래스에 선언된 모양 그대로 생성된 실체
    - ‘클래스의 인스턴스(instance)’ 라고도 부른다. 
    - 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 갖는다. 
    - oop의 관점에서 클래스의 타입으로 선언되었을 때 ‘객체’라고 부른다.

 - 인스턴스
    - 설계도를 바탕으로 소프트웨어 세계에 구현된 구체적인 실체. 즉, 객체를 소프트웨어에 실체화 하면 그것을 ‘인스턴스’라고 부른다.
    - 실체화된 인스턴스는 메모리에 할당된다.
    - 인스턴스는 객체에 포함된다고 볼 수 있다. 
    - oop의 관점에서 객체가 메모리에 할당되어 실제 사용될 때 ‘인스턴스’라고 부른다. 
    - 추상적인 개념(또는 명세)과 구체적인 객체 사이의 관계 에 초점을 맞출 경우에 사용한다. 
    - ‘~의 인스턴스’ 의 형태로 사용된다. 
    - 객체는 클래스의 인스턴스다. 
    - 객체 간의 링크는 클래스 간의 연관 관계의 인스턴스다.

 - 클래스 vs 객체
    - 클래스는 ‘설계도’, 객체는 ‘설계도로 구현한 모든 대상’을 의미한다.
  
 - 객체 vs 인스턴스
    - 클래스의 타입으로 선언되었을 때 객체라고 부르고, 그 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 부른다.
    - 객체는 현실 세계에 가깝고, 인스턴스는 소프트웨어 세계에 가깝다. 
    - 객체는 ‘실체’, 인스턴스는 ‘관계’에 초점을 맞춘다. 
    - 객체를 ‘클래스의 인스턴스’라고도 부른다.

### Q. 불변 객체는 무엇이고 Java에서 어떻게 구현할까요?

 - 불변 객체란 객체 생성 이후 내부의 상태가 변하지 않는 객체이다.
 -  불변 객체는 read-only 메소드만을 제공하며, 객체의 내부 상태를 제공하는 메소드를 제공하지 않거나 방어적 복사(defensive-copy)를 통해 제공
 -  Java의 대표적인 불변 객체로는 String이 있다.
 -  불변 객체를 사용해야 하는 이유
   - Thread-Safe하여 병렬 프로그래밍에 유용하며, 동기화를 고려하지 않아도 된다.
   - 실패 원자적인(Failure Atomic) 메소드를 만들 수 있다.
   - Cache나 Map 또는 Set 등의 요소로 활용하기에 더욱 적합하다.
   - 부수 효과(Side Effect)를 피해 오류가능성을 최소화할 수 있다.다른 사람이 작성한 함수를 예측가능하며 안전하게 사용할 수 있다.
   - 가비지 컬렉션의 성능을 높일 수 있다.

 -  Java에서 불변 객체 구현 방법
   - 클래스를 final로 선언
   - 모든 클래스 변수를 private와 final로 선언
   - 객체를 생성하기 위한 생성자 또는 정적 팩토리 메소드를 추가
   - 참조에 의해 변경가능성이 있는 경우 방어적 복사를 이용하여 전달


### Q. Interface와 Abstract Class의 차이는 무엇인가요?

 - 인터페이스는 implements 라는 키워드처럼 인터페이스에 정의된 메소드를 각 클래스의 목적에 맞게 기능을 구현 
 - 추상 클래스는 extends 키워드를 사용해서 자신의 기능들을 하위 클래스로 확장
 
### Q. Interface가 사용되면 좋은 시점은 언제일까요?

 - 상속 관계를 쭉 타고 올라갔을 때, '다른' 조상클래스를 상속하는데 '같은 기능'이 필요할 경우 인터페이스 사용
  
### Q. Abstract Class가 사용되면 좋은 시점은 언제일까요?

 - 상속 관계를 쭉 타고 올라갔을 때, '같은' 조상클래스를 상속하는데 '기능까지 완벽히 똑같은 기능'이 필요한 경우

### Q. Interface와 Abstract Class를 같이 상속받는 경우에는 왜 그렇게 작성하였을까요?

 - 

### Q. 데이터 직렬화(Serialization)과 역직렬화(Deserialization)에 대해서 설명해 주세요.

### Q. Java Serialization은 왜 만들어졌고, 어떤 단점들이 있을까요?

### Q. Java Generic에 대해서 설명해 주세요.

### Q. Java Generic의 반공변, 공변, 무공변은 무엇인지 설명해주세요.

### Q. "재 정의된" equals와 ==의 차이는 무엇인가요?

### Q. hashCode의 의미는 무엇인가요?

### Q. 문자열을 리터럴(`string = "abcd"`)로 할당하는 것과 객체(`string = new String("abcd")`)로 할당하는 방식의 차이가 무엇인가요?

### Q. 객체 지향 프로그래밍을 왜 사용한다고 생각하시나요?

### Q. Array와 ArrayList의 차이점은 무엇인가요?

### Q. LinkedList와 ArrayList의 차이점은 무엇인가요?

### Q. Java Compiler는 문자열 연산 최적화를 어떻게 진행하나요? (String Builder, String...)

### Q. SringBuilder를 사용하는 것과 String을 사용하여 연산하는 것에서 어떠한 큰 차이가 존재할까요?

### Q. Stack을 사용하지 못하는 상황에서 대체할 수 있는 Collection은 무엇이 있을까요?

### Q. Vector와 Stack을 사용하지 않는 이유는 무엇인가요?

### Q. Lock Stripping은 무엇이고 어떠한 자료구조가 해당 방식을 구현하였나요?

### Q. HashMap에 대해서 설명해주시고, Hash Collision 발생 시 자바는 어떻게 대처하나요?

### Q. Hash Collision이 많이 발생할 경우 어떤 최적화가 진행될까요?

### Q. ConcurrentHashMap은 어떤 방식으로 스레드 동시성을 보장하나요?

### Q. CopyOnWriteArrayList은 어떤 방식으로 스레드 동시성을 보장하나요?
