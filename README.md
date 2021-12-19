# Learing java with inflearn
### about '_java_'
### in '_eclipse_'
## 12/04 
>1. Oracle에서 java sdk 다운로드
>2. Eclipse 환경 구축
## 12/05
>1. System.out.print() 를 이용한 int, float 자료형 출력
>2. operator overview 학습 
>3. for / while / do-while / if-else / label-break / continue 문법 학습
## 12/06
>1. C, C++, Java의 배열 문법 차이점 학습
## 12/08
>1. for문을 이용한 배열 출력
>2. ★각 행마다 다른 index 갯수를 갖는 다차원 배열 학습★
## 12/09
>1. class 개요
>2. 멤버변수, 메소드 개요
>3. new를 이용한 객체 생성 및 메소드 활용
>4. ★new 이용시 garbage collector에 의해 메모리 해제를 따로 안해도 된다★
## 12/10
>1. 접근제어자가 붙은 변수,함수
>2. 함수 오버로딩 (C++과 다르게 Java는 연산자 오버로딩은 불가능하다)
>> - 함수의 입력 parameter의 자료형을 다르게하여 오버로딩 구현.
>> - 함수의 오버로딩은 return 값의 자료형의 차이로는 구현이 불가능하다.
>3. 생성자(constructor)
>> - 객체가 생성될 때 한번 호출되는 메소드
>> - 자동으로 호출되는 메소드
>> - 리턴형이 없고 클래스명과 함수명이 같다.
>> - 반드시 public의 속성을 갖는다.
>4. this
>> - 객체 자신을 참조하는 참조형 클래스 변수 또는 키워드
>> - ex) this.멤버변수, this.메소드()
>> - 잘 사용하지는 않는다.
>5. 접근제어자 static
 ## 12/11
>1. package
>> - 자주 사용되는 클래스를 모아 놓은 폴더
>> - 패키지명은 소문자를 사용하는 것이 관례.
>> - 사용 >> package 패키지명;
>2. import
>> - C언어의 #include와 유사한 역할
>> - 클래스를 포함하고자 할 경우
>> - 사용 >> import 패키지명.클래스명 --- (1)
>> - 사용 >> import 패키지명.*; --------- (2)
## 12/12 
>1. 멤버 상속
>> - 상위 클래스에 지정된 private 멤버는 해당 클래스에서만 사용할 수 있고, 하위 클래스에서는 사용할 수 없다.
>> - 상위 클래스에 지정된 public 멤버는 해당 클래스뿐만 아니라 하위 클래스에서도 사용할 수 있으며 외부에서도 언제든지 사용할 수 있다.
## 12/13
>1. 오버라이딩
>> - 상위 클래스의 함수를 하위 클래스에서 재정의 하는것.
>>  -상위, 하위 클래스의 함수가 함수명, 매개변수, 리턴형 세가지 모두 같아야 한다.
>2. final
>> - final이 메소드에 붙는 경우 >> 상속과 오버라이딩 불가, 클래스와 메소드의 맨 앞쪽에 위치.
>> - final이 변수에 붙는 경우 >> 변수의 값 수정이 불가능.
>3. super
>> - 하위 클래스에서 상위 클래스의 메소드나 변수를 호출할 때 사용
>4. 참조 변수를 이용한 형 변환과 호출
>> - 하위 클래스 > 상위 클래스 형 변환할 수 있으며, 접근지정자에 따라 접근이 결정된다.
>> - 상위 클래스 > 하위 클래스 형 변환을 불가능하다.
## 12/14
>1. 추상 클래스
>> - 하위에서 구현할 메소드의 원형을 가진 상위 클래스이다.
>> - 상위 클래스로만 존재
>> - 자체를 객체로 생성할 수 없다.
## 12/15
>1. 인터페이스
>> 1.1. 추상클래스와 인터페이스의 공통점
>>> - 상위 클래스로만 사용 가능
>>> - 하위에서 구현할 함수의 원형을 선언  

>> 1.2. 추상클래스와 인터페이스의 차이점
>>> - 추상클래스 = 일반 멤버 + 추상메소드
>>> - 인터페이스 = 추상메소드 + 상수
>>> - 추상클래스는 추상메소드를 일부 구현 가능. 인터페이스는 모두 구현해야 함(강제적)
>>> - 인터페이스는 다중 상속 가능
>>> - 인터페이스가 인터페이스를 다중 상속
## 12/19
>1. 인터페이스 상속
>> - 인터페이스-인터페이스 상속은 extends 사용
>> - 인터페이스-클래스 상속은 implements 사용
>> - 다중상속시에 하위 클래스는 모든 상위 인터페이스의 메소드를 구현해야함!
