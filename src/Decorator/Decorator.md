- OCP(Open Closed Principle)
    - 클래스 확장에는 열려있지만, 변경에는 닫혀있어야 한다.
        - 직접 코드를 수정하지 않고도, 코드를 확장할 수 있다. ⇒ 데코레이터
- Decorator 패턴 → 객체에 추가 요소를 동적으로 더하는 것.
    - **장식**과 실제 내용물을 동일시
        - 클래스를 장식[감싼다 개념]으로 확장
            - 한 객체를 여러개의 데코레이터들로 감쌀 수 있따.
        - 데코레이터의 슈퍼클래스는 자신이 장식하고있는 객체의 슈퍼 클래스와 같다.
    - 객체에 **동적으로 책임을 추가**
        - 데코레이터는 자신이 장식하고 있는 객체에게 어떤 행동을 위임하는 일 말고도 추가 작업을 수행할 수 있다.
    - 상속을 사용하지 않고 **기능의 유연한 확장이 가능한 패턴**
    - 객체에 **동적으로 새로운 서비스를 추가 할 수 있음**
    - 전체가 아닌 **개별적인 객체에 새로운 기능을 추가 할 수 있음**

**구성요소**
- Component : 동적으로 추가할 서비스를 가질 수 있는 객체 정의 
- ConcreteComponent : 추가적인 서비스가 필요한 실제 객체 
- Decorator : Component의 참조자를 관리하면서 Component에 정의된 인터페이스를 만족하도록 정의 
- ConcreteDecorator : 새롭게 추가되는 서비스를 실제 구현한 클래스로 addBehavior()를 구현한다.
- 자바의 I/O 스트림 클래스는 Decorator 패턴이라고 한다.

- BufferedReader예제
    - 아래 보는것과 같이 키보드 입력받기 위해 자잘한 클래스가 엄청나게 추가된다.

    ```java
            InputStream in = System.in;
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);
    
            String a = br.readLine();
            System.out.println(a);
    ```

