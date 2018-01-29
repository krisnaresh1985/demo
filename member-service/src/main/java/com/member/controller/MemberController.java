package com.member.controller;

import com.member.model.Member;
import com.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/allMembers")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/all" , method = RequestMethod.GET)
    public Collection<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") int id){
        return memberService.getMemberById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMemberById(@PathVariable("id") int id){
    	memberService.removeMemberById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteMemberById(@RequestBody Member member){
    	memberService.updateMember(member);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertMember(@RequestBody Member member){
    	memberService.insertMember(member);
    }
    
    
    @RequestMapping(value = "/{id}/{years}", method = RequestMethod.GET)
    public int getMemberYears(@PathVariable("id") int id){
        return memberService.getMemberYears(id);
    }
    
    
    @RequestMapping(value = "/average", method = RequestMethod.GET)
    public int getMemberAverage(){
        return memberService.getMemberAverage();
    }
}
