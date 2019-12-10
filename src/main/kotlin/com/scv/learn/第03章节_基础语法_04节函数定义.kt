enum class OptSys : ICreator{
    WINDOWS,

    LINUX {
        override fun creator() = "林纳斯"
    },

    MAC {
        override fun creator() = "乔布斯"
    };

    override fun creator(): String {
        return "统一的creator()"
    }
}

interface ICreator{
    fun creator():String
}

fun main(){
    println(OptSys.values().toList())
    val valueOf: OptSys = OptSys.valueOf("MAC")
    println(valueOf)
    println(OptSys.valueOf("鸿蒙"))
}
