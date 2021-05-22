package com.example.lib

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


class CoroutineImpl {
    suspend fun request(url: String) {
        delay(1000)

        println("request $url")
    }


    fun coroutineRequest() {
        val urls = listOf("https://baidu.com", "https://qingyingliu.top")
        runBlocking {
            val costTime = measureTimeMillis {
                urls.map {
                    async {
                        request(it)
                    }
                }.forEach {
                    it.await()
                }
            }
            println("running time costs $costTime ms")
        }
    }
}

// 测试程序
//fun main() {
//    CoroutineImpl().coroutineRequest()
//}