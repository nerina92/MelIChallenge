package com.example.melichallenge.di

import okhttp3.*
import java.net.ProtocolException
import java.net.SocketTimeoutException

class TimeOutInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var response: Response

        try {
            response = chain.proceed(chain.request())

        }catch(exception: SocketTimeoutException){
            val responseString = exception.message.toString()
            response = Response.Builder()
                .code(404)
                .message(responseString)
                .request(chain.request())
                .protocol(Protocol.HTTP_2)
                .body(
                    ResponseBody.create(MediaType.get("application/json"),responseString)
                )
                .addHeader("content-type", "application/json")
                .build()
        }

        return response
    }
}
