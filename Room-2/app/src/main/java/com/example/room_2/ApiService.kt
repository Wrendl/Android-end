package com.example.room_2

import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("posts/")
    fun getPosts(): Call<List<Post>>

    @GET("posts/{id}/")
    fun getPostById(@Path("id") postId: Int): Call<Post>

//    @Headers("Cache-Control: max-age=640000", "User-Agent: My-App-Name")
//    @GET("todos/")
//    fun getTodosByUserId(
//        @Query("userId") userId: Int,
//        @Query("completed") completed: Boolean
//    ): Call<List<Todo>>
//
//
//    @FormUrlEncoded
//    @POST("todos/")
//    fun addTodo(
//        @Field("userId") userId: Int,
//        @Field("title") title: String,
//        @Field("completed") completed: Boolean
//    ): Call<Todo>
//
//    @GET
//    fun getTodosWithUrl(@Url url: String): Call<List<Todo>>
}