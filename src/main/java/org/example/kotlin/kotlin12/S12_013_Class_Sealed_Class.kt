package org.example.kotlin.kotlin12

/**
 * 密封类
 */
sealed class LicenseStatus2 {

    object UnQualified : LicenseStatus2()
    object Learning : LicenseStatus2()
    class Qualified(val licenseId: String) : LicenseStatus2()
}

class Driver2(var status: LicenseStatus2) {
    fun checkLicense(): String {
        return when (status) {
            is LicenseStatus2.UnQualified -> "没资格"
            is LicenseStatus2.Learning -> "在学"
            is LicenseStatus2.Qualified -> "有资格，驾驶证编号：${(this.status as LicenseStatus2.Qualified).licenseId}"
        }
    }
}

fun main(args: Array<String>) {
    val status = LicenseStatus2.Learning
    println(Driver2(status).checkLicense()) // 在学

    val status2 = LicenseStatus2.Qualified("001")
    println(Driver2(status2).checkLicense()) // 有资格，驾驶证编号：001
}