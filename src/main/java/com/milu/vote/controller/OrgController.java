package com.milu.vote.controller;

import com.milu.vote.bean.Org;
import com.milu.vote.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class OrgController {

    @Autowired
    private OrgService orgService;


    @RequestMapping("orgsave")
    public String save(Org org) {
        org.setId(UUID.randomUUID().toString());
        orgService.save(org);
        return "login";
    }

    @RequestMapping("orgdelete")
    public String delete(String id) {
        orgService.delete(id);
        return "";
    }

    @RequestMapping("orgupdate")
    public String update(Org org) {
        orgService.update(org);
        return "";
    }

    @RequestMapping("orglist")
    public String list(Org org) {
        List<Org> list = orgService.list(org);
        return "";
    }

    @RequestMapping("orgquery")
    public String query(String id) {
        Org org = orgService.query(id);
        return "";
    }

}
