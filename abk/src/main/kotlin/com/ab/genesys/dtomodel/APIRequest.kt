package com.ab.genesys.dtomodel

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class APIRequest(val i: Int ? = null,
    val b: Boolean ? = null,
    val d: Double ? = null,
    val f: Float ? = null,
    val l: Long ? = null,
    val s: Short ? = null,
    val c: Char ? = null,
    val y: Byte ? = null
)