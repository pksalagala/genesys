package com.ab.genesys.service

import com.ab.genesys.core.TestClass
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.springframework.stereotype.Service
import java.util.concurrent.ThreadLocalRandom
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.util.*

@Service
class MainService {

    val log: Logger = LogManager.getLogger()

    private val colormap = arrayOf(
            "Maroon", "Red", "Orange", "Yellow", "Olive", "Green", "Purple",
            "Fuchsia", "Lime", "Teal", "Aqua", "Blue", "Navy", "Black", "Gray", "Silver", "White")


    fun getColor(): String {
        val rand = ThreadLocalRandom.current().nextInt(0, colormap.size)
        val color = colormap[rand]
        log.info("Today's color is .... {}", color)
        return color
    }

    fun testMethod(): String  {
        val testClass: TestClass = TestClass()
        testClass.name = "My name is prem"
        val ret: String = Optional.ofNullable(testClass.name).orElse("no value")
        return ret
    }

    fun testMethod1(): String {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
        //Thread.sleep(2000) // wait for 2 seconds
        println("Stop")
        return "test1"
    }

 }