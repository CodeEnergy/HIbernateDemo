///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package net.codeenergy.demo;
//
//import com.google.gson.Gson;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import net.codeenergy.demo.DAO.AccountDAO;
//import net.codeenergy.demo.DTO.Account;
//import net.codeenergy.demo.DTO.ResponseObj;
//import net.codeenergy.demo.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author quangphuong
// */
//@RestController
//public class RestHomeController {
//    @Autowired
//    AccountService accountService;
//    
//    @RequestMapping(value = "/login" , method = RequestMethod.POST)
//    public String login(HttpServletRequest request, HttpServletResponse response) {
//        String email = request.getParameter("email");
//        String pass = request.getParameter("password");
//        
//        if(accountService.checkLogin(email, pass)) {
//            Account acc = new Account(email);
//            Gson gson = new Gson();
//            String json = gson.toJson(acc);
//            return json;
//        } else {
//            return "";
//        }
//    }
//}
