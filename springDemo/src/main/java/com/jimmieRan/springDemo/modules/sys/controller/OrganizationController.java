package com.jimmieRan.springDemo.modules.sys.controller;

import com.jimmieRan.springDemo.modules.sys.service.OrganizationService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ${DESCRIPTION}
 * <p> User: ran
 * <p> Date: 2017/1/23
 * <p> Version: 1.0
 */
@Controller
@RequestMapping("organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    /**
     * 跳转机构组织主页
     * @param model
     * @return
     */
    @RequiresPermissions("organization:view")
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        return "organization/index";
    }

    /**
     * 树结构显示所有机构组织
     * @param model
     * @return
     */
    @RequiresPermissions("organization:view")
    @RequestMapping("tree")
    public String showTree(Model model){
        model.addAttribute("organizationList",organizationService.findAll());
        return "organization/tree";
    }

    /**
     * 维护组织机构信息
     * @param id
     * @param model
     * @return
     */
    @RequiresPermissions("organization:update")
    @RequestMapping(value = "{id}/maintain", method = RequestMethod.GET)
    public String showMaintainForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("organization", organizationService.findOne(id));
        return "organization/maintain";
    }

}
