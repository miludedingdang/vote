package com.milu.vote.controller;

import com.milu.vote.bean.User;
import com.milu.vote.bean.Vote;
import com.milu.vote.service.UserService;
import com.milu.vote.service.VoteService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private VoteService voteService;

    @RequestMapping("/")
    public String goLogin() {
        return "login";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest req, User user) {
        if (user != null && StringUtils.isNotBlank(user.getUserName()) && StringUtils.isNotBlank(user.getUserPassword())) {
            List<User> list = userService.list(user);
            if (list != null && list.size() > 0) {
                Vote vote = new Vote();
                List<Vote> listVote = voteService.list(vote);
                req.setAttribute("list", listVote);
                req.getSession().setAttribute("role", user.getUserName());
                return "voteslist";
            }
        }
        req.setAttribute("message", "用户名和密码错误,请您注册或者联系管理员");
        return "login";
    }
}
