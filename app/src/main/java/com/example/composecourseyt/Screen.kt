package com.example.composecourseyt


// sealed class : 상속 가능한 클래스인데, 상속할 수 있는 애들을 ‘내가 정한 애들만’ 허용하는 클래스
sealed class Screen(val route: String) {
    //object : 싱글톤 객체
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")

    //route 문자열을 안전하고 깔끔하게 만들어주는 헬퍼 함수
    //vararg : 가변 개수 인자
    fun withArgs(vararg args: String) : String {
        return buildString {
            append(route)
            args.forEach { args ->
                append("/$args")
            }
        }
    }
}