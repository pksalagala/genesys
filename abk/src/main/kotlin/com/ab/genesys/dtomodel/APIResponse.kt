package com.ab.genesys.dtomodel

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class APIResponse(var response: Response = Response(2000), var data: APIData? = null) {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    data class APIData(
        var i: Int?,
        var b: Boolean? = null,
        var d: Double? = null,
        var f: Float? = null,
        var l: Long? = null,
        var s: Short? = null,
        var c: Char? = null,
        var y: Byte? = null,
        var str: String? = null
    )

    @JsonInclude(JsonInclude.Include.NON_NULL)
    data class Response(var responseCode: Int, var responseStatus: String? = null, var responseDescription: String?  = null)

}