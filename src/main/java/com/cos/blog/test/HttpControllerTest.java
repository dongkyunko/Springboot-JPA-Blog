package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

//사용자가 요청 -> 응답(HTML파일)
//@Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

    //인터넷 브라우저 요청은 get 무조건 get 요청밖에 할 수 없다(디폴트get)
    //http://localhostL:8080/http/get (select)
    @GetMapping("/http/get")
    public String getTest(Member m){
        return "get 요청 : " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }
    //http://localhostL:8080/http/post (post)
    @PostMapping("/http/post")
    public String postPost(@RequestBody Member m){
        return "post 요청 : " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }
    //http://localhostL:8080/http/put (put)
    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }
    //http://localhostL:8080/http/delete (delte)
    @DeleteMapping("/http/delete")
    public String delteTest(){
        return "delete 요청";
    }

}
