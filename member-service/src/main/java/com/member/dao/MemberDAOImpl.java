package com.member.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.member.model.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
@Qualifier("localData")
public class MemberDAOImpl implements MemberDAO {

    private static Map<Integer, Member> members;

    static {

        members = new HashMap<Integer, Member>(){

            {
                put(1, new Member(1, "Vicki", 5));
                put(2, new Member(2, "Alex U",6));
                put(3, new Member(3, "Anna",7));
            }
        };
    }

    @Override
    public Collection<Member> getAllMembers(){
        return members.values();
    }

    @Override
    public Member getMemberById(int id){
        return members.get(id);
    }

    @Override
    public void removeMemberById(int id) {
        members.remove(id);
    }

    @Override
    public void updateMember(Member member){
        Member e = members.get(member.getId());
        e.setYears(member.getYears());
        e.setName(member.getName());
        members.put(member.getId(), member);
    }

    @Override
    public void insertMemberToDb(Member member) {
        members.put(member.getId(), member);
    }

	@Override
	public int getMemberYears(int id) {
		// TODO Auto-generated method stub
		return members.get(id).getYears();
	}
}
