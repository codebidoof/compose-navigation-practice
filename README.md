# Compose Navigation Practice

Jetpack Compose에서 Navigation을 연습하기 위한 간단한 실습 프로젝트.

---

## 내용

- `NavHost`, `NavController` 기본 사용
- 화면 간 이동 구현
- route에 인자(`/ {name}`) 전달
- `navArgument`로 인자 타입 정의
- `sealed class`로 화면(route) 관리
- `withArgs()`를 사용한 route 문자열 생성

---

## 구조

- **MainScreen**
  - TextField 입력
  - 버튼 클릭 시 DetailScreen으로 이동
- **DetailScreen**
  - 전달받은 name 인자 출력

---

## 공부한 내용  
https://gamerhw.tistory.com/46
