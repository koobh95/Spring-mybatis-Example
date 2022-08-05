package com.tistory.ku_develog.service;

import java.util.List;

import com.tistory.ku_develog.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> getAll();
	public MemberDTO getMember(String id);
	public boolean insertMember(MemberDTO memberDto);
	public boolean deleteMember(String id);
	public MemberDTO updateMember(MemberDTO memeberDto);
}
