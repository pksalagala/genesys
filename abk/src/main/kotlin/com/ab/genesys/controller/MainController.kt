package com.ab.genesys.controller

import com.ab.genesys.core.TestClass
import com.ab.genesys.dtomodel.APIRequest
import com.ab.genesys.dtomodel.APIResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import com.ab.genesys.service.MainService
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.util.Optional

@RestController
class MainController {

    private final val log: Logger = LogManager.getLogger()

    @Value("\${portal.developer.name}" )
    private lateinit var name: String

    @Autowired
    private lateinit var  mainSvc: MainService

    @GetMapping
    fun message(): String = "hello from $name"

    @GetMapping("/color_of_day")
    fun colorOfDay(): String {
        return mainSvc.getColor()
    }

    @PostMapping("/test")
    fun test(req: APIRequest): APIResponse {
        log.info("Printing {}", mainSvc.testMethod())
        val data = APIResponse.APIData(10)
        val response = APIResponse.Response(2000)
        return APIResponse(response,data)
    }

    @GetMapping("/test1")
    fun test1(): String {
        log.info("Testing test1")
        return mainSvc.testMethod1()
    }

}