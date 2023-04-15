import java.util.Calendar

// 2023-04-14에서 2023을 추출
private fun GetYear(today: String): String{
    return today.substring(0 until 4)
}

// 2023-04-14에서 04를 추출
private fun GetMonth(today: String): String{
    return today.substring(4 until 6)
}

// 2023-04-14에서 14를 추출
private fun GetDay(today: String): String{
    return today.substring(6)
}

// 2023년 4월 14일을 세팅한 calendar객체 생성
private fun GetCalendar(year: String, month: String, day: String): Calendar{
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.YEAR, year.toInt())
    calendar.set(Calendar.MONTH, month.toInt()-1)
    calendar.set(Calendar.DAY_OF_MONTH, day.toInt())
    return calendar
}

private fun GetCustomCalendar(today: String): Calendar {
    val year = GetYear(today)
    val month = GetMonth(today)
    val day = GetDay(today)
    val carlendar = GetCalendar(year, month, day)
    return carlendar
}

// date ex) 2023-04-14
fun GetDayOfWeek(date: String): String{
    val date = date.replace("-","") // 2023-04-14를 20230414로 변환
    val calendar = GetCustomCalendar(date)
    var dayOfWeekString: String? = null
    val dayOfWeekInt: Int = calendar.get(Calendar.DAY_OF_WEEK)

    when(dayOfWeekInt){
        1 -> dayOfWeekString = "일"
        2 -> dayOfWeekString = "월"
        3 -> dayOfWeekString = "화"
        4 -> dayOfWeekString = "수"
        5 -> dayOfWeekString = "목"
        6 -> dayOfWeekString = "금"
        7 -> dayOfWeekString = "토"
    }
    return dayOfWeekString!!
}

fun main() {
    print(GetDayOfWeek("2023-04-14"))
}