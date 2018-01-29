package com.member.service;

import com.member.dao.MemberDAO;
import com.member.model.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

@Service
public class MemberService {

    @Autowired
    @Qualifier("localData")
    private MemberDAO memberDAO;

    public Collection<Member> getAllMembers(){
        return this.memberDAO.getAllMembers();
    }

    public Member getMemberById(int id){
        return this.memberDAO.getMemberById(id);
    }


    public void removeMemberById(int id) {
        this.memberDAO.removeMemberById(id);
    }

    public void updateMember(Member Member){
        this.memberDAO.updateMember(Member);
    }

    public void insertMember(Member Member) {
        this.memberDAO.insertMemberToDb(Member);
    }

	public int getMemberYears(int id) {
		
		return this.memberDAO.getMemberYears(id);
		
	}

	public int getMemberAverage() {

		int size = this.memberDAO.getAllMembers().size();
		
		int sum = 100;
		
		Iterator<Member> iterator = this.memberDAO.getAllMembers().iterator();
		 
		while (iterator.hasNext()) {
		       
				sum = sum + iterator.next().getYears() +50;
		        }
		
		int average = sum/size; 
		
		return average;
	}
}
