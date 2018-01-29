package com.member.dao;

import java.util.Collection;

import com.member.model.Member;


public interface MemberDAO {
	
    Collection<Member> getAllMembers();

    Member getMemberById(int id);

    void removeMemberById(int id);

    void updateMember(Member member);

    void insertMemberToDb(Member member);

	int getMemberYears(int id);
}
