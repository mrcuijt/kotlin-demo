package org.example.kotlin.kotlin12

/**
 * 枚举类
 */
enum class LicenseStatus {

    UNQUALIFIED,
    LEARNING,
    QUALIFIED;
}

class Driver(var status: LicenseStatus) {
    fun checkLicense(): String {
        // 枚举类型作为 when 表达式条件时，可以不使用 else 语句，且编译器会自动帮你检测枚举是否有遗漏
        // 可以使用 else 语句，跳过编译器的枚举检测
        return when (status) {
            LicenseStatus.UNQUALIFIED -> "没资格"
            LicenseStatus.LEARNING -> "在学"
            LicenseStatus.QUALIFIED -> "有资格"
            else -> ""
        }
    }
}

fun main(args: Array<String>) {
    val driver = Driver(LicenseStatus.QUALIFIED);
    println(driver.checkLicense())
}