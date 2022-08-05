package com.tistory.ku_develog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tistory.ku_develog.dao.MemberDAO;
import com.tistory.ku_develog.dto.MemberDTO;
import com.tistory.ku_develog.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDao;

	@Override
	@Transactional
	public List<MemberDTO> getAll() {
		return memberDao.getAll();
	}

	@Override
	@Transactional
	public MemberDTO getMember(String id) {
		return memberDao.getMember(id);
	}

	@Override
	@Transactional
	public boolean insertMember(MemberDTO memberDto) {
		return memberDao.insertMember(memberDto);
	}

	@Override
	@Transactional
	public boolean deleteMember(String id) {
		return memberDao.deleteMember(id);
	}

	@Override
	@Transactional
	public MemberDTO updateMember(MemberDTO memeberDto) {
		return memberDao.updateMember(memeberDto);
	}
}
