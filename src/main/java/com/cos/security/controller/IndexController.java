package com.cos.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //view를 리턴하겠다
public class IndexController {
    //localhost:8080/
    //localhost:8080
    @GetMapping({"","/"})
    public String index(){
        //머스테치 기본 폴더 - src/main/resources/
        //뷰리졸버 : templates(prefix) .mustache(suffix)
        return "index";// src/main/resources/templates/index.mustache
    }

    @GetMapping({"/user"})
    public String user(){
        return "user";// src/main/resources/templates/user.mustache
    }

    @GetMapping({"/admin"})
    public String admin(){
        return "admin";// src/main/resources/templates/user.mustache
    }

    @GetMapping({"/manager"})
    public String manager(){
        return "manager";// src/main/resources/templates/user.mustache
    }

    @GetMapping({"/login"})
    public String login(){
        return "login";// src/main/resources/templates/user.mustache
    }

    @GetMapping({"/join"})
    public String join(){
        return "join";// src/main/resources/templates/user.mustache
    }

    @ResponseBody
    @GetMapping({"/joinProc"})
    public String joinProc(){
        return "환영합니다 회원님^^";// src/main/resources/templates/user.mustache
    }
}
