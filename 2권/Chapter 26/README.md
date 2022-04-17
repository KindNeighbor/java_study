Chapter 26 I/O

1. I/O는 Input과 Output을 의미한다.

2. java.io 패키지의 File 클래스는 파일과 경로(path)를 나타낼 수 있다.

3. File 클래스에 선언되어 있는 separator 상수는 현재 JVM이 사용중인 OS의 경로 구분자를 의미한다.

4. mkdir() 메소드는 현재 존재하는 경로의 하위 폴더만 생성 가능하며, mkdirs() 메소드는 지정된 경로에 존재하지 않는 모든 폴더를 생성한다.

5. 두 메소드 모두 현재 디렉터리의 하위에 있는 목록을 나타내는데, list() 메소드는 String[] 타입으로, listFiles() 메소드는 File[] 타입으로 리턴한다.

6. 두 Filter 인터페이스는 모두 넘어온 File과 관련된 정보를 이용하여 파일을 필터링할 목적으로 사용된다.
FileFilter 인터페이스에는 accept(File pathName)으로 선언되어 있는 메소드가 있고, FilenameFilter 인터페이스에는 accept(File dir, String name) 으로 선언되어 있는 메소드가 있다는 점이 다르다. 
따라서, FilenameFilter는 가장 하위에 있는 대상의 이름만 넘어오기 때문에, 가장 하위에 있는 것이 파일인지 경로인지를 구분할 수가 없다.

7. InputStream 클래스는 입력된 byte 데이터를 다루기 위해서 만들어 졌다. 

8. OutputStream 클래스는 byte 데이터를 출력하기 위해서 만들어 졌다.

9. Reader 클래스는 입력된 텍스트 데이터(char 기반의 문자열)를 다루기 위해서 만들어 졌다.

10. Writer 클래스는 텍스트 데이터(char 기반의 문자열)를 출력하기 위해서 만들어 졌다.

11. java.io 패키지의 Buffered가 붙은 클래스들은 버퍼라는 공간에 저장할 데이터를 보관해 두었다가, 버퍼가 차게되면 데이터를 저장하도록 도와준다. 따라서, 매우 효율적인 저장이 가능하다. 

12. Scanner 클래스는 java.util 패키지에 선언되어 있다. 