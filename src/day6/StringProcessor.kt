package day6

/**
 * 자바의 상속 구현을 코틀린에서 어떻게 받아들이는가?
 */

/* java */
interface StringProcessor {
    void process (String value);
}

class StringPrinter : StringProcessor  {
    override fun process (value: String) {
        println(value)
    }
}

class NullableStringPrinter : StringProcessor {
    override fun process (value : String?) {
        if (value != null) {
            println(value)
        }
    }
}